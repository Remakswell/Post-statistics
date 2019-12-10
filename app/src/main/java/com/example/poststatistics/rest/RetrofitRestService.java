package com.example.poststatistics.rest;

import com.example.poststatistics.models.liked.liked_request.LikeRequest;
import com.example.poststatistics.models.liked.liked_response.Example;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitRestService {

    @POST("/v1/users/posts/likers/all")
    Single<Example> getLikedUsersList(@Header("Content-Type") String headerContentType,
                                      @Header("Accept") String headerAccept,
                                      @Header("Authorization") String headerToken,
                                      @Body LikeRequest body);
}
