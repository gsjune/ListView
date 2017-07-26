package com.hckim.listview_adapterview.adapterview;

/**
 * 모델 클래스
 */

public class People { // <String>에 들어갈 데이터 타입
    private String name;
    private String phone;
    private int picture;

    public People(String name, String phone, int picture) { // 생성자
        this.name = name;
        this.phone = phone;
        this.picture = picture;
    }

    public String getName() { // getter and setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    @Override
    public String toString() { // toString
        return "People{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", picture=" + picture +
                '}';
    }
}
