package com.example.poststatistics.models.liked.liked_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LikedExample {

    @SerializedName("data")
    @Expose
    private List<LikedDatum> data = null;
    @SerializedName("likedLinks")
    @Expose
    private LikedLinks likedLinks;
    @SerializedName("likedMeta")
    @Expose
    private LikedMeta likedMeta;

    public List<LikedDatum> getData() {
        return data;
    }

    public void setData(List<LikedDatum> data) {
        this.data = data;
    }

    public LikedLinks getLikedLinks() {
        return likedLinks;
    }

    public void setLikedLinks(LikedLinks likedLinks) {
        this.likedLinks = likedLinks;
    }

    public LikedMeta getLikedMeta() {
        return likedMeta;
    }

    public void setLikedMeta(LikedMeta likedMeta) {
        this.likedMeta = likedMeta;
    }
}
