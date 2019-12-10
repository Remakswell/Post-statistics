package com.example.poststatistics.models;

import com.google.gson.annotations.SerializedName;

public class PostRequest {
    @SerializedName("id")
    private Long id;

    public PostRequest(Long id) {
        this.id = id;
    }
}
