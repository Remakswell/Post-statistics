package com.example.poststatistics.models.liked.liked_request;

import com.google.gson.annotations.SerializedName;

public class LikeRequest {
    @SerializedName("id")
    private Long id;

    public LikeRequest(Long id) {
        this.id = id;
    }
}
