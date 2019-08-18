package com.danish.toaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.danish.toastit.ToastIt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastIt.shortToast(this, "i am short Toast");

        ToastIt.shortToast(this, "i am long Toast");
    }
}
