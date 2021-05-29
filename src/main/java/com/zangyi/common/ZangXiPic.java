package com.zangyi.common;

public class ZangXiPic {
    private Integer id;

    private String musicalImg;

    private String nameZang;

    private String nameHan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ZangXiPic{" +
                "id=" + id +
                ", musicalImg='" + musicalImg + '\'' +
                ", nameZang='" + nameZang + '\'' +
                ", nameHan='" + nameHan + '\'' +
                '}';
    }
}