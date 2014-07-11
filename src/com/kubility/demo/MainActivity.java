
package com.kubility.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private OmnidirectionalScrollView scrollView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        scrollView = (OmnidirectionalScrollView)findViewById(R.id.scroll1);
    }
}
