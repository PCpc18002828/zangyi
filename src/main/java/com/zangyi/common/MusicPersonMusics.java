package com.zangyi.common;

public class MusicPersonMusics {
    private Integer id;

    private Integer userid;

    private String songzang;

    private String songhan;

    private String songaudio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSongzang() {
        return songzang;
    }

    public void setSongzang(String songzang) {
        this.songzang = songzang == null ? null : songzang.trim();
    }

    public String getSonghan() {
        return songhan;
    }

    public void setSonghan(String songhan) {
        this.songhan = songhan == null ? null : songhan.trim();
    }

    public String getSongaudio() {
        return songaudio;
    }

    public void setSongaudio(String songaudio) {
        this.songaudio = songaudio == null ? null : songaudio.trim();
    }

    @Override
    public String toString() {
        return "MusicPersonMusics{" +
                "id=" + id +
                ", userid=" + userid +
                ", songzang='" + songzang + '\'' +
                ", songhan='" + songhan + '\'' +
                ", songaudio='" + songaudio + '\'' +
                '}';
    }
}
