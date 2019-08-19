package com.kaiote.kamstrupint;

import com.kaiote.kamstrupint.data.Key;
import com.kaiote.kamstrupint.data.SigFoxStructure;
import com.kaiote.kamstrupint.helpers.Decryptor;
import com.kaiote.kamstrupint.helpers.Separator;

/**
 * Hello world!
 *
 */
public class App {
    public static Separator separatorHelper = new Separator();

    public static void main(String[] args) {
        try {

            SigFoxStructure structure = App.separatorHelper.classifyMessage("c164ed406d8d6f1d8715f739");
            Key keyData = new Key();
            keyData.dekKey("C2E387277E39C9D821F3B05E1616F87C");

            Decryptor decryptor = new Decryptor(structure.getAESCnt(), keyData.getDekKey());
            decryptor.decrypt(structure.getEncryptedPayload());

            System.out.println(decryptor.CRC16CITT());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
