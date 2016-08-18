package com.ethanco.myjitpacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ethanco.ethancoutil.EUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EUtil.toast(this, "JitPack");
    }
}
