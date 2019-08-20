package com.kaiote.kamstrupint;

import com.kaiote.kamstrupint.data.Key;
import com.kaiote.kamstrupint.data.PackIDD;
import com.kaiote.kamstrupint.data.PackageContent;
import com.kaiote.kamstrupint.data.SigFoxStructure;
import com.kaiote.kamstrupint.helpers.DataAssigner;
import com.kaiote.kamstrupint.helpers.DataClassifier;
import com.kaiote.kamstrupint.helpers.Decryptor;
import com.kaiote.kamstrupint.helpers.HexSupport;
import com.kaiote.kamstrupint.helpers.Separator;
import com.kaiote.kamstrupint.responses.PackIDDRespones;

import javax.xml.bind.DatatypeConverter;

/**
 * Kamstrup
 */
public class Kamstrup {

    public Decryptor decryptor;

    public SigFoxStructure sigFoxStructure;

    public Key keyData = new Key();

    public Separator separator = new Separator();

    public PackIDDRespones packIDDRespones;

    public PackageContent packageContent;

    /**
     * 
     * @param AEScnt
     * @param DekKey
     * @param message
     * @throws Exception
     */
    public Kamstrup(String DekKey, String message) throws Exception {

        this.sigFoxStructure = this.separator.classifyMessage(message);

        this.keyData.dekKey(DekKey);

        this.decryptor = new Decryptor(this.sigFoxStructure.getAESCnt(), this.keyData.getDekKey());

        this.decryptor.decrypt(this.sigFoxStructure.getEncryptedPayload());
    }

    /**
     * 
     * @return
     * @throws Exception
     */
    public Kamstrup getDataTypeParameters() throws Exception {

        String packId = this.sigFoxStructure.getPackID();

        String binaryPackID = HexSupport.toBitString(DatatypeConverter.parseHexBinary(packId));

        PackIDD packaged = DataClassifier.packIDDClassifier(binaryPackID);
        PackIDDRespones assigned = DataAssigner.packIDDResponseAssigner(packaged);

        this.packIDDRespones = assigned;

        return this;
    }

    /**
     * 
     * @return
     * @throws Exception
     */
    public Kamstrup getpackageContentParameters() throws Exception {
        this.packageContent = DataClassifier.packageContentClassifier(
                this.separator.splitSections(this.decryptor.decryptedText, 0, 16), this.packIDDRespones);
        System.out.println(this.separator.splitSections(this.decryptor.decryptedText, 0, 16));
        return this;
    }
}