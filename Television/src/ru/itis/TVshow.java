package ru.itis;

import java.time.LocalTime;

public class TVshow {
    private String tvName;
    private LocalTime beginTime;
    private LocalTime finishTime;

    public TVshow(String tvName, LocalTime beginTime, LocalTime finishTime) {
        setTVname(tvName);
        setBeginTime(beginTime);
        setFinishTime(finishTime);
    }

    public void setTVname(String TVname) {
        this.tvName = TVname;
    }

    public void setBeginTime(LocalTime beginTime) {
        this.beginTime = beginTime;
    }

    public void setFinishTime(LocalTime finishTime) {
        this.finishTime = finishTime;
    }

    public String getTvName() {
        return tvName;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getFinishTime() {
        return finishTime;
    }
}

