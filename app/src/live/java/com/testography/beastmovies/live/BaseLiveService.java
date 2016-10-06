package com.testography.beastmovies.live;

import com.squareup.otto.Bus;
import com.testography.beastmovies.infrastructure.BeastMoviesApplication;

public class BaseLiveService {
    protected BeastMoviesApplication mApplication;
    protected Bus mBus;

    public BaseLiveService(BeastMoviesApplication application) {
        mApplication = application;
        mBus = application.getBus();
        mBus.register(this);
    }
}
