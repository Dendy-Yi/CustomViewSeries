package com.dendy.view.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.dendy.view.R;
import com.dendy.view.view.CustomSeekBar;

/**
 * Created by Administrator on 2018/3/15.
 */

public class CustomSeekBarActivity extends Activity {

    private static final String TAG = CustomSeekBarActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customeseekbar);
        final CustomSeekBar customSeekBar = (CustomSeekBar) findViewById(R.id.customseekBar);
        customSeekBar.setResponseOnTouch(new CustomSeekBar.ResponseOnTouch() {
            @Override
            public void onTouchResponse(int progress) {
                Log.i(TAG, "onTouchResponse: progress = " + progress);
            }
        });
    }
}
