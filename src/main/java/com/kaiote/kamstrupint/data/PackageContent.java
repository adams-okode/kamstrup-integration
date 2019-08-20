package com.kaiote.kamstrupint.data;

/**
 * PackageContent
 */
public class PackageContent {

    public Double volume;
    public String infoCode;
    public Double minFlow;
    public Double maxFlow;
    public Double minWaterTemperature;
    public Double minAmbientrTemperature;
    public Double maxAmbientTemperature;

    public PackageContent() {
    }

    public PackageContent(Double volume, String infoCode, Double minFlow, Double maxFlow, Double minWaterTemperature,
            Double minAmbientrTemperature, Double maxAmbientTemperature) {
        this.volume = volume;
        this.infoCode = infoCode;
        this.minFlow = minFlow;
        this.maxFlow = maxFlow;
        this.minWaterTemperature = minWaterTemperature;
        this.minAmbientrTemperature = minAmbientrTemperature;
        this.maxAmbientTemperature = maxAmbientTemperature;
    }

    public Double getVolume() {
        return this.volume;
    }

    public void setVolume(Double volume) {

        this.volume = volume;
    }

    public PackageContent volume(Double volume) {
        this.volume = volume;
        return this;
    }

    public String getInfoCode() {
        return this.infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public PackageContent infoCode(String infoCode) {
        this.infoCode = infoCode;
        return this;
    }

    public Double getMinFlow() {
        return this.minFlow;
    }

    public void setMinFlow(Double minFlow) {
        this.minFlow = minFlow;
    }

    public PackageContent minFlow(Double minFlow) {
        this.minFlow = minFlow;
        return this;
    }

    public Double getMaxFlow() {
        return this.maxFlow;
    }

    public void setMaxFlow(Double maxFlow) {
        this.maxFlow = maxFlow;
    }

    public PackageContent maxFlow(Double maxFlow) {
        this.maxFlow = maxFlow;
        return this;
    }

    public Double getMinWaterTemperature() {
        return this.minWaterTemperature;
    }

    public void setMinWaterTemperature(Double minWaterTemperature) {
        this.minWaterTemperature = minWaterTemperature;
    }

    public PackageContent minWaterTemperature(Double minWaterTemperature) {
        this.minWaterTemperature = minWaterTemperature;
        return this;
    }

    public Double getMinAmbientrTemperature() {
        return this.minAmbientrTemperature;
    }

    public void setMinAmbientrTemperature(Double minAmbientrTemperature) {
        this.minAmbientrTemperature = minAmbientrTemperature;
    }

    public PackageContent minAmbientrTemperature(Double minAmbientrTemperature) {
        this.minAmbientrTemperature = minAmbientrTemperature;
        return this;
    }

    public Double getMaxAmbientTemperature() {
        return this.maxAmbientTemperature;
    }

    public void setMaxAmbientTemperature(Double maxAmbientTemperature) {
        this.maxAmbientTemperature = maxAmbientTemperature;
    }

    public PackageContent maxAmbientTemperature(Double maxAmbientTemperature) {
        this.maxAmbientTemperature = maxAmbientTemperature;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " volume='" + getVolume() + "'" + ", infoCode='" + getInfoCode() + "'" + ", minFlow='"
                + getMinFlow() + "'" + ", maxFlow='" + getMaxFlow() + "'" + ", minWaterTemperature='"
                + getMinWaterTemperature() + "'" + ", minAmbientrTemperature='" + getMinAmbientrTemperature() + "'"
                + ", maxAmbientTemperature='" + getMaxAmbientTemperature() + "'" + "}";
    }

}