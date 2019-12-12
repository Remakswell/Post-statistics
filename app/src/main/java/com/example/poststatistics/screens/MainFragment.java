package com.example.poststatistics.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poststatistics.R;
import com.example.poststatistics.models.comment.CommentDatum;
import com.example.poststatistics.models.liked.liked_response.LikedDatum;
import com.example.poststatistics.rest.ServerApiImpl;
import com.example.poststatistics.screens.adapters.CommentAdapter;
import com.example.poststatistics.screens.adapters.LikedAdapter;

import java.util.List;

public class MainFragment extends Fragment implements MainView {

    private ProgressBar progressBar;
    private MainPresenter presenter;

    //Views
    private TextView viewsTextCount;

    //Liked
    private TextView likeCountText;
    private TextView remainingCountText;
    private LinearLayoutManager layoutManager;
    private RecyclerView recyclerView;
    private LikedAdapter likedAdapter;

    //Comment
    private TextView commentCountText;
    private LinearLayoutManager commentLayoutManager;
    private RecyclerView commentRecyclerView;
    private CommentAdapter commentAdapter;

    //Marked
    private TextView markedCountText;

    //Reposts
    private TextView repostsCount;

    //Bookmark
    private TextView bookmarkCount;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        progressBar = view.findViewById(R.id.progressBar);
        presenter = new MainPresenter(this, new ServerApiImpl(this));

        initCount(view);
        initLikedList(view);
        initCommentList(view);

        presenter.onStart();
    }

    @Override
    public void onDestroyView() {
        presenter.onDestroy();
        super.onDestroyView();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.update_post, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_update) {
            presenter.onStart();
        }
        return true;
    }

    @Override
    public void setItems(List<LikedDatum> likedUsersList) {
        likedAdapter.setItems(likedUsersList);
        likedAdapter.notifyDataSetChanged();
    }

    @Override
    public void setCommentItems(List<CommentDatum> commentUsersList) {
        commentAdapter.setCommentItems(commentUsersList);
        commentAdapter.notifyDataSetChanged();
    }

    @Override
    public void setMarkedCount(int markedCount) {
        markedCountText.setText(getString(R.string.marked_count, markedCount));
    }

    @Override
    public void setViewsCount(int count) {
        viewsTextCount.setText(getString(R.string.views_count, count));
    }

    @Override
    public void setRepostsCount(int count) {
        repostsCount.setText(getString(R.string.reposts_count, count));
    }

    @Override
    public void setBookmarkCount(int count) {
        bookmarkCount.setText(getString(R.string.bookmark_count, count));
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    private void initCount(View view){
        viewsTextCount = view.findViewById(R.id.viewsText);
        markedCountText = view.findViewById(R.id.markedText);
        repostsCount = view.findViewById(R.id.repostsText);
        bookmarkCount = view.findViewById(R.id.bookmarkText);
    }

    private void initLikedList(View view){
        likeCountText = view.findViewById(R.id.likeCountText);
        remainingCountText = view.findViewById(R.id.remainingCountText);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView = view.findViewById(R.id.likedRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        likedAdapter = new LikedAdapter(getContext(), new LikedAdapter.LikedCountInterface() {
            @Override
            public void setRemainingCount(int remainingLikedCount) {
                remainingCountText.setText(getString(R.string.count_users, remainingLikedCount));
            }

            @Override
            public void setLikedCount(int likedUsersCount) {
                likeCountText.setText(getString(R.string.liked_users, likedUsersCount));
            }
        });

        recyclerView.setAdapter(likedAdapter);
    }

    private void initCommentList(View view){
        commentCountText = view.findViewById(R.id.commentCountText);
        commentLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        commentRecyclerView = view.findViewById(R.id.commentRecyclerView);
        commentRecyclerView.setLayoutManager(commentLayoutManager);

        commentAdapter = new CommentAdapter(getContext(), new CommentAdapter.CommentCountInterface() {
            @Override
            public void setCommentCount(int commentUsersCount) {
                commentCountText.setText(getString(R.string.comment_users, commentUsersCount));
            }
        });

        commentRecyclerView.setAdapter(commentAdapter);
    }
}
