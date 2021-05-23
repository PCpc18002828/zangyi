package com.zangyi.common;

public class MusicPersonList {
    private Integer id;

    private String sex;

    private String headpic;

    private String namezang;

    private String namehan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
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
        return "MusicPersonList{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", headpic='" + headpic + '\'' +
                ", namezang='" + namezang + '\'' +
                ", namehan='" + namehan + '\'' +
                '}';
    }
}