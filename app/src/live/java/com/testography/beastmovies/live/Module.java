package com.testography.beastmovies.live;

import com.testography.beastmovies.infrastructure.BeastMoviesApplication;

public class Module {
    public static void Register(BeastMoviesApplication application) {
        new LiveMovieService(application);
    }
}
