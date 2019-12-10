package com.example.poststatistics.screens;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poststatistics.R;
import com.example.poststatistics.models.liked.liked_response.Datum;
import com.example.poststatistics.rest.ServerApiImpl;
import com.example.poststatistics.screens.adapters.LikedAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private Toolbar toolbar;
    private ProgressBar progressBar;
    private TextView likeCountText;
    private TextView remainingCountText;
    private TextView viewsTextCount;

    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private LikedAdapter likedAdapter;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.toolbarLeftBtn);

        progressBar = findViewById(R.id.progressBar);
        likeCountText = findViewById(R.id.likeCountText);
        remainingCountText = findViewById(R.id.remainingCountText);
        viewsTextCount = findViewById(R.id.viewsText);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = findViewById(R.id.likedRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        likedAdapter = new LikedAdapter(this, new LikedAdapter.RemainingCount() {
            @Override
            public void setRemainingCount(int remainingCount) {
                remainingCountText.setText(getString(R.string.count_users, remainingCount));
            }

            @Override
            public void setLikedCount(int likedUsersCount) {
                likeCountText.setText(getString(R.string.liked_users, likedUsersCount));
            }
        });

        recyclerView.setAdapter(likedAdapter);

        presenter = new MainPresenter(this, new ServerApiImpl(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.update_post, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_update) {
            presenter.onResume();
        }
        return true;
    }

    @Override
    public void setItems(List<Datum> likedUsersList) {
        likedAdapter.setItems(likedUsersList);
        likedAdapter.notifyDataSetChanged();
    }

    @Override
    public void setViewsCount(int count) {
        viewsTextCount.setText(getString(R.string.views_count, count));
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }
}
