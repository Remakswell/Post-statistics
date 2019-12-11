package com.example.poststatistics.models.comment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentExample {

    @SerializedName("data")
    @Expose
    private List<CommentDatum> data = null;
    @SerializedName("commentLinks")
    @Expose
    private CommentLinks commentLinks;
    @SerializedName("commentMeta")
    @Expose
    private CommentMeta commentMeta;

    public List<CommentDatum> getData() {
        return data;
    }

    public void setData(List<CommentDatum> data) {
        this.data = data;
    }

    public CommentLinks getCommentLinks() {
        return commentLinks;
    }

    public void setCommentLinks(CommentLinks commentLinks) {
        this.commentLinks = commentLinks;
    }

    public CommentMeta getCommentMeta() {
        return commentMeta;
    }

    public void setCommentMeta(CommentMeta commentMeta) {
        this.commentMeta = commentMeta;
    }

}
