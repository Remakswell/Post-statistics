package com.example.poststatistics.models.post.post_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostAuthor {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("active_gift")
    @Expose
    private Object activeGift;
    @SerializedName("avatar_image")
    @Expose
    private PostAvatarImage postAvatarImage;
    @SerializedName("is_commercial")
    @Expose
    private Boolean isCommercial;
    @SerializedName("off_page")
    @Expose
    private Boolean offPage;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_subscribed")
    @Expose
    private Boolean isSubscribed;
    @SerializedName("is_online")
    @Expose
    private Boolean isOnline;
    @SerializedName("postRating")
    @Expose
    private PostRating postRating;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("geo_id")
    @Expose
    private PostGeoId postGeoId;
    @SerializedName("contest_entry_instance")
    @Expose
    private Object contestEntryInstance;
    @SerializedName("chat_main_lang")
    @Expose
    private String chatMainLang;
    @SerializedName("is_voted")
    @Expose
    private Boolean isVoted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Object getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(Object activeGift) {
        this.activeGift = activeGift;
    }

    public PostAvatarImage getPostAvatarImage() {
        return postAvatarImage;
    }

    public void setPostAvatarImage(PostAvatarImage postAvatarImage) {
        this.postAvatarImage = postAvatarImage;
    }

    public Boolean getIsCommercial() {
        return isCommercial;
    }

    public void setIsCommercial(Boolean isCommercial) {
        this.isCommercial = isCommercial;
    }

    public Boolean getOffPage() {
        return offPage;
    }

    public void setOffPage(Boolean offPage) {
        this.offPage = offPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public PostRating getPostRating() {
        return postRating;
    }

    public void setPostRating(PostRating postRating) {
        this.postRating = postRating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public PostGeoId getPostGeoId() {
        return postGeoId;
    }

    public void setPostGeoId(PostGeoId postGeoId) {
        this.postGeoId = postGeoId;
    }

    public Object getContestEntryInstance() {
        return contestEntryInstance;
    }

    public void setContestEntryInstance(Object contestEntryInstance) {
        this.contestEntryInstance = contestEntryInstance;
    }

    public String getChatMainLang() {
        return chatMainLang;
    }

    public void setChatMainLang(String chatMainLang) {
        this.chatMainLang = chatMainLang;
    }

    public Boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Boolean isVoted) {
        this.isVoted = isVoted;
    }
}