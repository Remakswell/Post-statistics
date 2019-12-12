package com.example.poststatistics.models.comment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentDatum {

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
    private CommentAvatarImage commentAvatarImage;
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
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("is_subscribed")
    @Expose
    private Boolean isSubscribed;
    @SerializedName("is_online")
    @Expose
    private Boolean isOnline;
    @SerializedName("last_online_timestamp")
    @Expose
    private Integer lastOnlineTimestamp;
    @SerializedName("in_my_blacklist")
    @Expose
    private Boolean inMyBlacklist;
    @SerializedName("has_me_in_blacklist")
    @Expose
    private Boolean hasMeInBlacklist;

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

    public CommentAvatarImage getCommentAvatarImage() {
        return commentAvatarImage;
    }

    public void setCommentAvatarImage(CommentAvatarImage commentAvatarImage) {
        this.commentAvatarImage = commentAvatarImage;
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

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
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

    public Integer getLastOnlineTimestamp() {
        return lastOnlineTimestamp;
    }

    public void setLastOnlineTimestamp(Integer lastOnlineTimestamp) {
        this.lastOnlineTimestamp = lastOnlineTimestamp;
    }

    public Boolean getInMyBlacklist() {
        return inMyBlacklist;
    }

    public void setInMyBlacklist(Boolean inMyBlacklist) {
        this.inMyBlacklist = inMyBlacklist;
    }

    public Boolean getHasMeInBlacklist() {
        return hasMeInBlacklist;
    }

    public void setHasMeInBlacklist(Boolean hasMeInBlacklist) {
        this.hasMeInBlacklist = hasMeInBlacklist;
    }

}
