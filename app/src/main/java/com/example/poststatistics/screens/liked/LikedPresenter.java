package com.example.poststatistics.screens.liked;

import com.example.poststatistics.rest.ServerApiImpl;

public class LikedPresenter {
    private LikedView likedView;
    private ServerApiImpl serverApiImp;

    public LikedPresenter(LikedView likedView, ServerApiImpl serverApiImp) {
        this.likedView = likedView;
        this.serverApiImp = serverApiImp;
    }

    public void onResume(){
        if (likedView != null) {
            likedView.showProgress();
        }
        serverApiImp.addLikedUsersList();
    }

    public void onDestroy() {
        likedView = null;
    }
}
