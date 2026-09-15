package com.saurabh.messages;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View root = new View(this);
        root.setBackgroundColor(getColor(R.color.app_background));

        setContentView(root);
    }
}
