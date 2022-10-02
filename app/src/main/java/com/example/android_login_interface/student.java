package com.example.android_login_interface;

public class student {
    public void Student(String name, String age, String id, String cid, int img){
        this.name =name;
        this.age=age;
        this.id=id;
        this.cid=cid;
        this.img=img;
    }
    private int img;
    private String name;
    private String age;
    private String id;
    private String cid;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
