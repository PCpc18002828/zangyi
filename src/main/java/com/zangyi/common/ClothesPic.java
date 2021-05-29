package com.zangyi.common;

public class ClothesPic {
    private Integer id;

    private String clothesId;

    private String zangName;

    private String hanName;

    private String clothesPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClothesId() {
        return clothesId;
    }

    public void setClothesId(String clothesId) {
        this.clothesId = clothesId == null ? null : clothesId.trim();
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

    public String getClothesPic() {
        return clothesPic;
    }

    public void setClothesPic(String clothesPic) {
        this.clothesPic = clothesPic == null ? null : clothesPic.trim();
    }
}