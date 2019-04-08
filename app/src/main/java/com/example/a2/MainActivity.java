package com.example.a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linearLayoutButtonTapped(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void relativeLayoutButtonTapped(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void frameLayoutButtonTapped(View view) {
        Intent intent = new Intent(this, FrameLayoutActivity.class);
        startActivity(intent);
    }

    public void tableLayoutButtonTapped(View view) {
        Intent intent = new Intent(this, TableLayoutActivity.class);
        startActivity(intent);
    }

    public void gridLayoutButtonTapped(View view) {
        Intent intent = new Intent(this, GridLayoutActivity.class);
        startActivity(intent);
    }
}
