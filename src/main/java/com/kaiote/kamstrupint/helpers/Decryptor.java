package com.kaiote.kamstrupint.helpers;

import static javax.xml.bind.DatatypeConverter.parseHexBinary;
import static javax.xml.bind.DatatypeConverter.printHexBinary;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Decryptor
 */
public class Decryptor {

    private Separator separator = new Separator();
    public String key = "";
    public byte[] initVector;
    public String decryptedText = "";

    /**
     * 
     * @param AESCnt
     * @param key
     */
    public Decryptor(String AESCnt, String key) {

        this.key = key;

        String s = "";
        int n = 16;
        for (int i = 1; i <= n; i++) {
            s = s + AESCnt;
        }

        this.initVector = HexSupport.toBytesFromHex(s);
    }

    
    /**
     * 
     * @return
     * @throws Exception
     */
    public String CRC16CITT() throws Exception {
        String first8Bytes = this.separator.splitSections(this.decryptedText, 0, 16);
        String b = CRC16CCITT.calc(first8Bytes);
        return b;
    }

    /**
     * 
     * @param encrypted
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     */
    public Decryptor decrypt(String encrypted) throws Exception {

        String hexKey = this.key;
        String hexIv = HexSupport.toHexFromBytes(this.initVector);
        String hexEncodedText = encrypted;

        // define AES key
        SecretKey key = new SecretKeySpec(parseHexBinary(hexKey), "AES");

        // define AES IV
        IvParameterSpec ivspec = new IvParameterSpec(parseHexBinary(hexIv));

        // define cipher mode
        Cipher cipher = Cipher.getInstance("AES/CTR/NOPADDING");
        cipher.init(Cipher.DECRYPT_MODE, key, ivspec);

        // decode
        byte[] result = cipher.doFinal(parseHexBinary(hexEncodedText));

        String out = printHexBinary(result);
        // print out the decrypted text
        this.decryptedText = out;

        return this;
    }
}