package com.testography.beastmovies.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;
import com.testography.beastmovies.live.Module;

public class BeastMoviesApplication extends Application {
    private Bus mBus;

    public BeastMoviesApplication() {
        mBus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Module.Register(this);
    }

    public Bus getBus() {
        return mBus;
    }
}
