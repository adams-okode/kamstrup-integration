package com.kaiote.kamstrupint.data;

/**
 * InfoCodes
 */
public class InfoCodes {

    public String burstDuration;
    public String leakDuration;
    public String reverseDuration;
    public String dryDuration;

    public Boolean burst;
    public Boolean leak;
    public Boolean reverse;
    public Boolean dry;

    public InfoCodes() {
    }

    public InfoCodes(String burstDuration, String leakDuration, String reverseDuration, String dryDuration,
            Boolean burst, Boolean leak, Boolean reverse, Boolean dry) {
        this.burstDuration = burstDuration;
        this.leakDuration = leakDuration;
        this.reverseDuration = reverseDuration;
        this.dryDuration = dryDuration;
        this.burst = burst;
        this.leak = leak;
        this.reverse = reverse;
        this.dry = dry;
    }

    public String getBurstDuration() {
        return this.burstDuration;
    }

    public void setBurstDuration(String burstDuration) {
        this.burstDuration = burstDuration;
    }

    public InfoCodes burstDuration(String burstDuration) {
        this.burstDuration = burstDuration;
        return this;
    }

    public String getLeakDuration() {
        return this.leakDuration;
    }

    public void setLeakDuration(String leakDuration) {
        this.leakDuration = leakDuration;
    }

    public InfoCodes leakDuration(String leakDuration) {
        this.leakDuration = leakDuration;
        return this;
    }

    public String getReverseDuration() {
        return this.reverseDuration;
    }

    public void setReverseDuration(String reverseDuration) {
        this.reverseDuration = reverseDuration;
    }

    public InfoCodes reverseDuration(String reverseDuration) {
        this.reverseDuration = reverseDuration;
        return this;
    }

    public String getDryDuration() {
        return this.dryDuration;
    }

    public void setDryDuration(String dryDuration) {
        this.dryDuration = dryDuration;
    }

    public InfoCodes dryDuration(String dryDuration) {
        this.dryDuration = dryDuration;
        return this;
    }

    public Boolean isBurst() {
        return this.burst;
    }

    public Boolean getBurst() {
        return this.burst;
    }

    public void setBurst(Boolean burst) {
        this.burst = burst;
    }

    public InfoCodes burst(Boolean burst) {
        this.burst = burst;
        return this;
    }

    public Boolean isLeak() {
        return this.leak;
    }

    public Boolean getLeak() {
        return this.leak;
    }

    public void setLeak(Boolean leak) {
        this.leak = leak;
    }

    public InfoCodes leak(Boolean leak) {
        this.leak = leak;
        return this;
    }

    public Boolean isReverse() {
        return this.reverse;
    }

    public Boolean getReverse() {
        return this.reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public InfoCodes reverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    public Boolean isDry() {
        return this.dry;
    }

    public Boolean getDry() {
        return this.dry;
    }

    public void setDry(Boolean dry) {
        this.dry = dry;
    }

    public InfoCodes dry(Boolean dry) {
        this.dry = dry;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " burstDuration='" + getBurstDuration() + "'" + ", leakDuration='" + getLeakDuration() + "'"
                + ", reverseDuration='" + getReverseDuration() + "'" + ", dryDuration='" + getDryDuration() + "'"
                + ", burst='" + isBurst() + "'" + ", leak='" + isLeak() + "'" + ", reverse='" + isReverse() + "'"
                + ", dry='" + isDry() + "'" + "}";
    }

}