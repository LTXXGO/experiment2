package com.example.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);
    }

    public void dismiss(View view) {
        finish();
    }
}
