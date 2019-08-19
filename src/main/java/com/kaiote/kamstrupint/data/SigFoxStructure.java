package com.kaiote.kamstrupint.data;

/**
 * SigFoxStructure
 */
public class SigFoxStructure {

    private String packID;
    private String AESCnt;
    private String encryptedPayload;

    public SigFoxStructure() {

    }

    public SigFoxStructure(String packID, String AESCnt, String encryptedPayload) {
        this.packID = packID;
        this.AESCnt = AESCnt;
        this.encryptedPayload = encryptedPayload;
    }

    public String getPackID() {
        return this.packID;
    }

    public void setPackID(String packID) {
        this.packID = packID;
    }

    public SigFoxStructure packID(String packID) {
        this.packID = packID;
        return this;
    }

    public String getAESCnt() {
        return this.AESCnt;
    }

    public void setAESCnt(String AESCnt) {
        this.AESCnt = AESCnt;
    }

    public SigFoxStructure AESCnt(String AESCnt) {
        this.AESCnt = AESCnt;
        return this;
    }

    public String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    public void setEncryptedPayload(String encryptedPayload) {
        this.encryptedPayload = encryptedPayload;
    }

    public SigFoxStructure encryptedPayload(String encryptedPayload) {
        this.encryptedPayload = encryptedPayload;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " packID='" + getPackID() + "'" + ", AESCnt='" + getAESCnt() + "'" + ", encryptedPayload='"
                + getEncryptedPayload() + "'" + "}";
    }

}