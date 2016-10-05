package com.testography.beastmovies.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

public class BeastMoviesApplication extends Application {
    private Bus mBus;

    public BeastMoviesApplication() {
        mBus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Bus getBus() {
        return mBus;
    }
}
