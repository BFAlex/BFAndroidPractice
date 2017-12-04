package com.bf.intent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bf.a1.bfandroidpractice.R;

/**
 * Created by 1 on 2017/12/4.
 */

public class SecondActivityComponent extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secondactivity_compomennt);
    }
}
