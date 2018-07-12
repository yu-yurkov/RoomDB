package com.example.hp.roomdb;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Shop {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name="tel")
    private String tel;

    @ColumnInfo(name="contact_name")
    private String contact_name;

    @ColumnInfo(name="worktime")
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
