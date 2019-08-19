package com.kaiote.kamstrupint.data;

/**
 * Key Definitio Class This will be provided By Kamstrup
 * 
 */
public class Key {

    private String meterNo;
    private String serialNo;
    private String dekKey;
    private String meterName;
    private String configNo;

    public Key() {

    }

    /**
     * 
     * @param meterNo
     * @param serialNo
     * @param dekKey
     * @param meterName
     * @param configNo
     */
    public Key(String meterNo, String serialNo, String dekKey, String meterName, String configNo) {
        this.meterNo = meterNo;
        this.serialNo = serialNo;
        this.dekKey = dekKey;
        this.meterName = meterName;
        this.configNo = configNo;
    }

    public String getMeterNo() {
        return this.meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public Key meterNo(String meterNo) {
        this.meterNo = meterNo;
        return this;
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Key serialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    public String getDekKey() {
        return this.dekKey;
    }

    public void setDekKey(String dekKey) {
        this.dekKey = dekKey;
    }

    public Key dekKey(String dekKey) {
        this.dekKey = dekKey;
        return this;
    }

    public String getMeterName() {
        return this.meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public Key meterName(String meterName) {
        this.meterName = meterName;
        return this;
    }

    public String getConfigNo() {
        return this.configNo;
    }

    public void setConfigNo(String configNo) {
        this.configNo = configNo;
    }

    public Key configNo(String configNo) {
        this.configNo = configNo;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " meterNo='" + getMeterNo() + "'" + ", serialNo='" + getSerialNo() + "'" + ", dekKey='"
                + getDekKey() + "'" + ", meterName='" + getMeterName() + "'" + ", configNo='" + getConfigNo() + "'"
                + "}";
    }

}