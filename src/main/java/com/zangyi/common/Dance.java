package com.zangyi.common;

public class Dance {
    private Integer id;

    private String placeid;

    private String namezang;

    private String namehan;

    private String videoimg;

    private String videotime;

    private String videoid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid == null ? null : placeid.trim();
    }

    public String getNamezang() {
        return namezang;
    }

    public void setNamezang(String namezang) {
        this.namezang = namezang == null ? null : namezang.trim();
    }

    public String getNamehan() {
        return namehan;
    }

    public void setNamehan(String namehan) {
        this.namehan = namehan == null ? null : namehan.trim();
    }

    public String getVideoimg() {
        return videoimg;
    }

    public void setVideoimg(String videoimg) {
        this.videoimg = videoimg == null ? null : videoimg.trim();
    }

    public String getVideotime() {
        return videotime;
    }

    public void setVideotime(String videotime) {
        this.videotime = videotime == null ? null : videotime.trim();
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid == null ? null : videoid.trim();
    }

    @Override
    public String toString() {
        return "Dance{" +
                "id=" + id +
                ", placeid='" + placeid + '\'' +
                ", namezang='" + namezang + '\'' +
                ", namehan='" + namehan + '\'' +
                ", videoimg='" + videoimg + '\'' +
                ", videotime='" + videotime + '\'' +
                ", videoid='" + videoid + '\'' +
                '}';
    }
}