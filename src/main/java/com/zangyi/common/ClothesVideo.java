package com.zangyi.common;

public class ClothesVideo {
    private Integer id;

    private String zangName;

    private String hanName;

    private String videoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZangName() {
        return zangName;
    }

    public void setZangName(String zangName) {
        this.zangName = zangName == null ? null : zangName.trim();
    }

    public String getHanName() {
        return hanName;
    }

    public void setHanName(String hanName) {
        this.hanName = hanName == null ? null : hanName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }
}