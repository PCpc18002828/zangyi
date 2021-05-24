package com.zangyi.common;

public class MusicInstrumentVideo {
    private Integer id;

    private Integer classid;

    private String musicalinstrument;

    private String name;

    private String urlid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getMusicalinstrument() {
        return musicalinstrument;
    }

    public void setMusicalinstrument(String musicalinstrument) {
        this.musicalinstrument = musicalinstrument == null ? null : musicalinstrument.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrlid() {
        return urlid;
    }

    public void setUrlid(String urlid) {
        this.urlid = urlid == null ? null : urlid.trim();
    }
}