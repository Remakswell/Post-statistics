package com.example.poststatistics.screens;

import com.example.poststatistics.models.comment.CommentDatum;
import com.example.poststatistics.models.liked.liked_response.LikedDatum;

import java.util.List;

public interface MainView {
    void setItems(List<LikedDatum> likedUsersList);
    void setCommentItems(List<CommentDatum> commentUsersList);
    void setMarkedCount(int count);
    void setViewsCount(int count);
    void setRepostsCount(int count);
    void setBookmarkCount(int count);
    void showProgress();
    void hideProgress();
}
