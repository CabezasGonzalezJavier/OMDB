package com.thedeveloperworldisyours.omdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.thedeveloperworldisyours.omdb.adapter.CustomRecyclerViewAdapter;
import com.thedeveloperworldisyours.omdb.model.Movie;
import com.thedeveloperworldisyours.omdb.presenter.MainPresenter;
import com.thedeveloperworldisyours.omdb.presenter.MainPresenterImpl;
import com.thedeveloperworldisyours.omdb.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter mMainPresenter;

    @BindView(R.id.activity_main_progress_bar)
    ProgressBar mProgressBar;
    @BindView(R.id.activity_main_recycler_view)
    RecyclerView mRecyclerView;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mMainPresenter = new MainPresenterImpl(this);
        mMainPresenter.getMovie();

        mRecyclerView.setHasFixedSize(true);





    }

    @Override
    public void onError() {
        Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccessful(Movie movie) {

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CustomRecyclerViewAdapter(movie);
        mRecyclerView.setAdapter(mAdapter);
        Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShowProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onHideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }
}
