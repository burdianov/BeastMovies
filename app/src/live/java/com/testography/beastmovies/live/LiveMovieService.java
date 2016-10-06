package com.testography.beastmovies.live;

import com.squareup.otto.Subscribe;
import com.testography.beastmovies.infrastructure.BeastMoviesApplication;
import com.testography.beastmovies.services.MovieServices;

public class LiveMovieService extends BaseLiveService {

    public LiveMovieService(BeastMoviesApplication application) {
        super(application);
    }

    @Subscribe
    public void getMovieMessage(MovieServices.SearchMoviesRequest request) {
        MovieServices.SearchMoviesResponse response = new MovieServices.SearchMoviesResponse();
        response.mModifiedQuery = request.mQuery + " this query was modified!!!";
        mBus.post(response);
    }
}
