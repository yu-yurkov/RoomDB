package com.example.hp.roomdb;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Shop.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ShopDao shopDao();
}

