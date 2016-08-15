package com.thedeveloperworldisyours.omdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.thedeveloperworldisyours.omdb.presenter.MainPresenter;
import com.thedeveloperworldisyours.omdb.presenter.MainPresenterImpl;
import com.thedeveloperworldisyours.omdb.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter mMainPresenter;

    @BindView(R.id.activity_main_progress_bar)
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mMainPresenter = new MainPresenterImpl(this);
        mMainPresenter.getMovie();

    }

    @Override
    public void onError() {
        Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccessful() {
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
