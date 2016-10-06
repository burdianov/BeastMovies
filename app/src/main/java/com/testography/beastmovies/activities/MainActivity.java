package com.testography.beastmovies.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.squareup.otto.Subscribe;
import com.testography.beastmovies.R;
import com.testography.beastmovies.services.MovieServices;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.activity_main_txt)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mBus.post(new MovieServices.SearchMoviesRequest("query"));
    }

    @Subscribe
    public void getMovieMessage(MovieServices.SearchMoviesResponse response) {
        mTextView.setText(response.mModifiedQuery);
    }
}
