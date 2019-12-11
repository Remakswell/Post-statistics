package com.example.poststatistics.screens;

import com.example.poststatistics.rest.ServerApiImpl;

class MainPresenter {

    private MainView mainView;
    private ServerApiImpl serverApiImp;

    MainPresenter(MainView likedView, ServerApiImpl serverApiImp) {
        this.mainView = likedView;
        this.serverApiImp = serverApiImp;
    }

    void onResume(){
        if (mainView != null) {
            mainView.showProgress();
        }
        serverApiImp.addLikedUsers();
        serverApiImp.addViewsCount();
        serverApiImp.addCommentUsers();
    }

    void onDestroy() {
        mainView = null;
    }
}
