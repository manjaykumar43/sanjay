package com.mkd.sanjay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mkd.tereem.fewer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fewer.niceToast(this,"manjesh");
    }
}