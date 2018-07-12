package com.example.hp.roomdb;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

public interface ShopDao {

    @Query("SELECT * FROM shop")
    List<Shop> getAllShops();

    @Insert
    void insertAll(Shop ...shops);
}
