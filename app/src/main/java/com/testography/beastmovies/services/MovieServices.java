package com.testography.beastmovies.services;

public class MovieServices {
    private MovieServices() {
    }

    public static class SearchMoviesRequest {
        public String mQuery;

        public SearchMoviesRequest(String query) {
            mQuery = query;
        }
    }

    public static class SearchMoviesResponse {
        public String mModifiedQuery;
    }
}
