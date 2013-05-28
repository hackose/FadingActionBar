package com.manuelpeinado.fadingactionbar.demo;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.manuelpeinado.fadingactionbar.FadingActionBar;

public class LightActionBarActivity extends SherlockActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new FadingActionBar.Initializer()
            .actionBarBackground(R.drawable.ab_background_light)
            .headerLayout(R.layout.header)
            .contentLayout(R.layout.activity_scrollview)
            .apply(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}