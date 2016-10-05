package com.testography.beastmovies.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.otto.Bus;
import com.testography.beastmovies.infrastructure.BeastMoviesApplication;

public class BaseActivity extends AppCompatActivity {
    protected BeastMoviesApplication mApplication;
    protected Bus mBus;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mApplication = (BeastMoviesApplication) getApplication();
        mBus = mApplication.getBus();
        mBus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mBus.unregister(this);
    }
}
