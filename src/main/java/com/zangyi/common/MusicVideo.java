package com.zangyi.common;

public class MusicVideo {
    private Integer id;

    private String video;

    private String namezang;

    private String namehan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
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

    @Override
    public String toString() {
        return "MusicVideo{" +
                "id=" + id +
                ", video='" + video + '\'' +
                ", namezang='" + namezang + '\'' +
                ", namehan='" + namehan + '\'' +
                '}';
    }
}