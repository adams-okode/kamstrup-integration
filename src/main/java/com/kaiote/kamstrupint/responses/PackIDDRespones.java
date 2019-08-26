package com.kaiote.kamstrupint.responses;

/**
 * PackIDDRespones
 */
public class PackIDDRespones {

    public String loggingFrequency;

    public int resultDecimalPlaces;

    public String unitStructure;

    public int packageType;

    public PackIDDRespones() {
    }

    public PackIDDRespones(String loggingFrequency, int resultDecimalPlaces, String unitStructure, int packageType) {
        this.loggingFrequency = loggingFrequency;
        this.resultDecimalPlaces = resultDecimalPlaces;
        this.unitStructure = unitStructure;
        this.packageType = packageType;
    }

    public String getLoggingFrequency() {
        return this.loggingFrequency;
    }

    public void setLoggingFrequency(String loggingFrequency) {
        this.loggingFrequency = loggingFrequency;
    }

    public PackIDDRespones loggingFrequency(String loggingFrequency) {
        this.loggingFrequency = loggingFrequency;
        return this;
    }

    public int getResultDecimalPlaces() {
        return this.resultDecimalPlaces;
    }

    public void setResultDecimalPlaces(int resultDecimalPlaces) {
        this.resultDecimalPlaces = resultDecimalPlaces;
    }

    public PackIDDRespones resultDecimalPlaces(int resultDecimalPlaces) {
        this.resultDecimalPlaces = resultDecimalPlaces;
        return this;
    }

    public String getUnitStructure() {
        return this.unitStructure;
    }

    public void setUnitStructure(String unitStructure) {
        this.unitStructure = unitStructure;
    }

    public PackIDDRespones unitStructure(String unitStructure) {
        this.unitStructure = unitStructure;
        return this;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }

    public PackIDDRespones packageType(int packageType) {
        this.packageType = packageType;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " loggingFrequency:'" + getLoggingFrequency() + "'" + ", resultDecimalPlaces:'"
                + getResultDecimalPlaces() + "'" + ", unitStructure:'" + getUnitStructure() + "'" + ", packageType:'"
                + getPackageType() + "'" + "}";
    }

}