package com.example.poststatistics.screens;

import com.example.poststatistics.models.liked.liked_response.Datum;

import java.util.List;

public interface MainView {
    void setItems(List<Datum> likedUsersList);
    void setViewsCount(int count);
    void showProgress();
    void hideProgress();
}
