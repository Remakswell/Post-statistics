package com.example.poststatistics.rest;

import android.util.Log;

import com.example.poststatistics.models.PostRequest;
import com.example.poststatistics.models.comment.CommentExample;
import com.example.poststatistics.models.liked.liked_response.LikedExample;
import com.example.poststatistics.models.marked.MarkedExample;
import com.example.poststatistics.models.post.post_response.Post;
import com.example.poststatistics.screens.MainView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ServerApiImpl implements ServerApi {

    private final RetrofitRestService retrofitRestService = ApiClient.getApiClient().create(RetrofitRestService.class);
    private final String APPLICATION_JSON = "application/json";
    private final long POST_ID = 2720;
    private final String TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImRiYTYzMGE0YzIxYWZlNzRhYTVlNTgwZjBiZjliMDQ1YThmYzY4NWViMjE0ZmFmZTY4ZDAzMGQzZjdiNThhMDg3M2M1MzU3MTNjNjIxNmE5In0.eyJhdWQiOiIyIiwianRpIjoiZGJhNjMwYTRjMjFhZmU3NGFhNWU1ODBmMGJmOWIwNDVhOGZjNjg1ZWIyMTRmYWZlNjhkMDMwZDNmN2I1OGEwODczYzUzNTcxM2M2MjE2YTkiLCJpYXQiOjE1Njg2MzI3MDEsIm5iZiI6MTU2ODYzMjcwMSwiZXhwIjoxNjAwMjU1MTAxLCJzdWIiOiIzMDQ2MTAiLCJzY29wZXMiOltdfQ.BB_dmBJDg-NO72-HSqudwt3Ql4kO7uyVjx4sMTpMURpJZfRpd1-7wUjfERWumhp1JcQzFwiRsihKTLN_rVeLNzspcXUHtp6OTRBEPowrzhQq3tB8-mQxTL-8KV2QPOaDmYufoowtCaxbTp7ciKs7Ybs4t9XYfGQoyBurWJsspOU_ikvWHlZViHZQjs82aAIblC-XyQh94sJz0_3mDHQPcGhlpBXp-RMi-hghGZsFS_ZhugSKvz5bKeR0bzDTui1baUoGnCFOWwSDn_tek1rSpAIdOe5WK1J2Opvjx7kjq7ycjbDy8ZNurWhEExa8rrFRRHlzN2AwiWkwAd6BmMHI_nVhgGbqUzDg88_393nX8T8Fdrek-IU1k461MzAycsRiKTj_vRXVyNie25v-wg3aQ9PciB-zQH1JbBM6wPmavwi-5zWD5Ab5m3FGijBviPCnN2Q-H9aBN3zPLYrYHG305Rmq6DHc_QoC_GYISk_BbbU3_DrvnUml2ey07B0bprVKJPZWYE9LHW5A3k4-yV3eAR5rf-JcQjCigONs0lkcA9uu91R-n3VxmtIyOIO76SLdkiZEebV8yvIC696zrxPMzNktoDUc-SP359MZDHIvmtL2uyy3s83n3LtgwgamZC4e6_-GmU89npACLD5hK7-lVXeVRGAKZuhTHKWuKbEqLJ8";

    private MainView likedView;

    public ServerApiImpl(MainView likedView) {
        this.likedView = likedView;
    }

    @Override
    public void addLikedUsers() {

        retrofitRestService.getLikedUsers(APPLICATION_JSON, APPLICATION_JSON, "Bearer " + TOKEN, new PostRequest(POST_ID))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<LikedExample>() {

                    @Override
                    public void onSuccess(LikedExample likedExample) {
                        likedView.setItems(likedExample.getData());
                        likedView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("test", "on error " + e);
                    }
                });
    }

    @Override
    public void addViewsCount() {

        retrofitRestService.getPost(APPLICATION_JSON, APPLICATION_JSON, "Bearer " + TOKEN, new PostRequest(POST_ID))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<Post>() {

                    @Override
                    public void onSuccess(Post post) {
                        likedView.setViewsCount(post.getViewsCount());
                        likedView.setRepostsCount(post.getRepostsCount());
                        likedView.setBookmarkCount(post.getBookmarksCount());
                        likedView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("error_tag", "error: " + e);
                    }
                });
    }

    @Override
    public void addCommentUsers() {

        retrofitRestService.getCommentUsers(APPLICATION_JSON, APPLICATION_JSON, "Bearer " + TOKEN, new PostRequest(POST_ID))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<CommentExample>() {

                    @Override
                    public void onSuccess(CommentExample commentExample) {
                        likedView.setCommentItems(commentExample.getData());
                        likedView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("error_tag", "error: " + e);
                    }
                });
    }

    @Override
    public void addMarkedUsers() {

        retrofitRestService.getMarkedUsers(APPLICATION_JSON, APPLICATION_JSON, "Bearer " + TOKEN, new PostRequest(POST_ID))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSingleObserver<MarkedExample>() {

                    @Override
                    public void onSuccess(MarkedExample markedExample) {
                        likedView.setMarkedCount(markedExample.getData().size());
                        likedView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("error_tag", "oerror: " + e);
                    }
                });
    }
}
