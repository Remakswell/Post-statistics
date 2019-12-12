package com.example.poststatistics.models.marked;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarkedExample {

    @SerializedName("data")
    @Expose
    private List<Object> data = null;
    @SerializedName("links")
    @Expose
    private MarkedLinks links;
    @SerializedName("meta")
    @Expose
    private MarkedMeta meta;

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public MarkedLinks getMarkedLinks() {
        return links;
    }

    public void setMarkedLinks(MarkedLinks links) {
        this.links = links;
    }

    public MarkedMeta getMarkedMeta() {
        return meta;
    }

    public void setMarkedMeta(MarkedMeta meta) {
        this.meta = meta;
    }
}