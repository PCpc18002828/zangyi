package com.zangyi.common;

public class MusicInstrumentVideo {
    private Integer id;

    private String videoId;

    private String nameZang;

    private String nameHan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
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
}