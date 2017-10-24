package ru.itis;

public class Channels {
    public int tvShowCount = 4;
    private String nameShow;
    private TVshow[] TVshows = new TVshow[tvShowCount];
    private int count = 0;

    public Channels(String nameShow) {
        setNameShow(nameShow);
    }

    public void setNameShow(String nameShow) {
        this.nameShow = nameShow;
    }
    public String getNameShow() {
        return nameShow;
    }

    public void addTVshow (TVshow tvShow) {
        TVshows[count] = tvShow;
        count++;
    }
}
