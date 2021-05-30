package com.zangyi.common;

public class CalligraphyVideo {
    private Integer id;

    private String nameZang;

    private String nameHan;

    private String videoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameZang() {
        return nameZang;
    }

    public void setNameZang(String nameZang) {
        this.nameZang = nameZang == null ? null : nameZang.trim();
    }

    public String getNameHan() {
        return nameHan;
    }

    public void setNameHan(String nameHan) {
        this.nameHan = nameHan == null ? null : nameHan.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }
}