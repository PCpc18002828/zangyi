package com.zangyi.common;

public class ZangXiVideo {
    private Integer id;

    private String voideUrl;

    private String nameZang;

    private String nameHan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoideUrl() {
        return voideUrl;
    }

    public void setVoideUrl(String voideUrl) {
        this.voideUrl = voideUrl == null ? null : voideUrl.trim();
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
        return "ZangXiVideo{" +
                "id=" + id +
                ", voideUrl='" + voideUrl + '\'' +
                ", nameZang='" + nameZang + '\'' +
                ", nameHan='" + nameHan + '\'' +
                '}';
    }
}