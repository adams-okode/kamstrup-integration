package com.kaiote.kamstrupint.data;

/**
 * PackIDD Decoded Information PackID is decoded as From PackID, PackageType
 * determines the content of the package: For this example, the content for
 * PackageType = 1 is decoded as This shows that the total consumption volume,
 * V1, on the meter is 33.975 m3, using the equation The maximum flow rate is
 * 0.367 L/hr. InfoCode identifies any active alarms and how long they have been
 * active in the last 30 days. The LSB 4 bits indicate active alarms and
 * represent DRY, REVERSE, LEAK and BURST. The hour counters are represented by
 * the 12 MSB bits as 3 bits each. bin Decimals Units Log PackageType 8 2 2 1 3
 * hex 03 00 0 001 text 3 m3 & L/hr Day 1
 */
public class PackIDD {
    
    private String decimals;

    private String units;

    private String log;

    private String packageType;

    public PackIDD() {
    }

    public PackIDD(String decimals, String units, String log, String packageType) {
        this.decimals = decimals;
        this.units = units;
        this.log = log;
        this.packageType = packageType;
    }

    public String getDecimals() {
        return this.decimals;
    }

    public void setDecimals(String decimals) {
        this.decimals = decimals;
    }

    public PackIDD decimals(String decimals) {
        this.decimals = decimals;
        return this;
    }

    public String getUnits() {
        return this.units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public PackIDD units(String units) {
        this.units = units;
        return this;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public PackIDD log(String log) {
        this.log = log;
        return this;
    }

    public String getPackageType() {
        return this.packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public PackIDD packageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " decimals='" + getDecimals() + "'" + ", units='" + getUnits() + "'" + ", log='" + getLog() + "'"
                + ", packageType='" + getPackageType() + "'" + "}";
    }

}