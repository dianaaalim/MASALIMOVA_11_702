package ru.itis.OOPmoney;

public class Money {
    private long rubles;
    private byte copiks;

    public Money(long rubles, byte copiks) {
        this.rubles = rubles;
        this.copiks = copiks;
    }

    public String toString() {
        return getRubles() + "," + getCopiks();
    }

    public void setCopiks(byte copiks) {
        if(copiks < 100 && copiks >= 0) {
            this.copiks = copiks;
        }
    }
    public void setRubles(long rubles) {
        if(rubles >= 0) {
            this.rubles = rubles;
        }
    }
    public long getRubles() {
        return rubles;
    }
    public byte getCopiks() {
        return copiks;
    }
}
