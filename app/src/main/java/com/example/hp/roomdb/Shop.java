package com.example.hp.roomdb;

public class Shop {

    private int id;
    private String address;
    private String title;
    private String tel;
    private String contact_name;
    private String worktime;

    public Shop(String address, String title, String tel, String contact_name, String worktime) {
        this.address = address;
        this.title = title;
        this.tel = tel;
        this.contact_name = contact_name;
        this.worktime = worktime;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public String getTel() {
        return tel;
    }

    public String getContact_name() {
        return contact_name;
    }

    public String getWorktime() {
        return worktime;
    }
}
