package com.example.poststatistics.screens.liked;

import com.example.poststatistics.models.liked.liked_response.Datum;

import java.util.List;

public interface LikedView {
    void setItems(List<Datum> likedUsersList);
    void showProgress();
    void hideProgress();
}
