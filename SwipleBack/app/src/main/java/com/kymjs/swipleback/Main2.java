package com.kymjs.swipleback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author kymjs (http://www.kymjs.com/) on 9/26/15.
 */
public class Main2 extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.KJAppTheme);
        setContentView(R.layout.content_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2.this, Main2.class));
            }
        });
    }
}
