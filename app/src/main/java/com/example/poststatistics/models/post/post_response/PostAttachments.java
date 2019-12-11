package com.example.poststatistics.models.post.post_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostAttachments {

    @SerializedName("postImages")
    @Expose
    private List<PostImage> postImages = null;
    @SerializedName("videos")
    @Expose
    private Object videos;
    @SerializedName("posts")
    @Expose
    private Object posts;

    public List<PostImage> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImage> postImages) {
        this.postImages = postImages;
    }

    public Object getVideos() {
        return videos;
    }

    public void setVideos(Object videos) {
        this.videos = videos;
    }

    public Object getPosts() {
        return posts;
    }

    public void setPosts(Object posts) {
        this.posts = posts;
    }
}
