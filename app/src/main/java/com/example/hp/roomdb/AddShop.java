package com.example.hp.roomdb;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddShop extends AppCompatActivity {


    EditText shop_address;
    EditText shop_title;
    EditText shop_tel;
    EditText contact_name;
    EditText worktime;
    Button button;

    private static final String TAG = "AddShop";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_shop);

        shop_address = findViewById(R.id.shop_address);
        shop_title = findViewById(R.id.shop_title);
        shop_tel = findViewById(R.id.shop_tel);
        contact_name = findViewById(R.id.contact_name);
        worktime = findViewById(R.id.worktime);
        button = findViewById(R.id.save_input_data);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: save to database
                Log.d(TAG, "onClick:"
                        + shop_address.getText().toString()
                        + "\n" + shop_title.getText().toString()
                       + "\n" + shop_tel.getText().toString()
                        + "\n" + contact_name.getText().toString()
                        + "\n" + worktime.getText().toString()
                );

                AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "production")
                        .allowMainThreadQueries()
                        .build();
                Shop shop = new Shop(shop_address.getText().toString(),shop_title.getText().toString(),shop_tel.getText().toString(),contact_name.getText().toString(),worktime.getText().toString());
                db.shopDao().insertAll(shop);
                startActivity(new Intent(AddShop.this, MainActivity.class));
            }
        });
    }
}

