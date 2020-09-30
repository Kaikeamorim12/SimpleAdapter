package com.example.simpleadapter.activity;

import android.os.Bundle;

import com.example.simpleadapter.R;
import com.example.simpleadapter.debug.DebugActivity;

public class UserActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}