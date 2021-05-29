package com.zangyi.common;

public class MusicInstrumentPic {
    private Integer id;

    private String classId;

    private String musicalImg;

    private String nameZang;

    private String nameHan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getMusicalImg() {
        return musicalImg;
    }

    public void setMusicalImg(String musicalImg) {
        this.musicalImg = musicalImg == null ? null : musicalImg.trim();
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