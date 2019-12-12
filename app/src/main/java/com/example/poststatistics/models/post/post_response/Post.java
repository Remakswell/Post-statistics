package com.example.poststatistics.models.post.post_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("allow_comments")
    @Expose
    private Boolean allowComments;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("content")
    @Expose
    private Object content;
    @SerializedName("postAuthor")
    @Expose
    private PostAuthor postAuthor;
    @SerializedName("postAttachments")
    @Expose
    private PostAttachments postAttachments;
    @SerializedName("site_link")
    @Expose
    private String siteLink;
    @SerializedName("intags")
    @Expose
    private List<Object> intags = null;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_at_timestamp")
    @Expose
    private Integer createdAtTimestamp;
    @SerializedName("is_repost")
    @Expose
    private Boolean isRepost;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("attachments_order")
    @Expose
    private List<PostAttachmentsOrder> postAttachmentsOrder = null;
    @SerializedName("is_liked")
    @Expose
    private Boolean isLiked;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("extra")
    @Expose
    private Object extra;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("is_avatar")
    @Expose
    private Boolean isAvatar;
    @SerializedName("is_bookmarked")
    @Expose
    private Boolean isBookmarked;
    @SerializedName("is_reposted")
    @Expose
    private Boolean isReposted;
    @SerializedName("bookmarks_count")
    @Expose
    private Integer bookmarksCount;
    @SerializedName("reposts_count")
    @Expose
    private Integer repostsCount;
    @SerializedName("views_count")
    @Expose
    private Integer viewsCount;
    @SerializedName("link")
    @Expose
    private Object link;
    @SerializedName("ad_id")
    @Expose
    private Object adId;
    @SerializedName("ad_active")
    @Expose
    private Boolean adActive;
    @SerializedName("ad_on_moderation")
    @Expose
    private Boolean adOnModeration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Boolean allowComments) {
        this.allowComments = allowComments;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public PostAuthor getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(PostAuthor postAuthor) {
        this.postAuthor = postAuthor;
    }

    public PostAttachments getPostAttachments() {
        return postAttachments;
    }

    public void setPostAttachments(PostAttachments postAttachments) {
        this.postAttachments = postAttachments;
    }

    public String getSiteLink() {
        return siteLink;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }

    public List<Object> getIntags() {
        return intags;
    }

    public void setIntags(List<Object> intags) {
        this.intags = intags;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }

    public void setCreatedAtTimestamp(Integer createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
    }

    public Boolean getIsRepost() {
        return isRepost;
    }

    public void setIsRepost(Boolean isRepost) {
        this.isRepost = isRepost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostAttachmentsOrder> getPostAttachmentsOrder() {
        return postAttachmentsOrder;
    }

    public void setPostAttachmentsOrder(List<PostAttachmentsOrder> postAttachmentsOrder) {
        this.postAttachmentsOrder = postAttachmentsOrder;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Boolean getIsAvatar() {
        return isAvatar;
    }

    public void setIsAvatar(Boolean isAvatar) {
        this.isAvatar = isAvatar;
    }

    public Boolean getIsBookmarked() {
        return isBookmarked;
    }

    public void setIsBookmarked(Boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    public Boolean getIsReposted() {
        return isReposted;
    }

    public void setIsReposted(Boolean isReposted) {
        this.isReposted = isReposted;
    }

    public Integer getBookmarksCount() {
        return bookmarksCount;
    }

    public void setBookmarksCount(Integer bookmarksCount) {
        this.bookmarksCount = bookmarksCount;
    }

    public Integer getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(Integer repostsCount) {
        this.repostsCount = repostsCount;
    }

    public Integer getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    public Object getLink() {
        return link;
    }

    public void setLink(Object link) {
        this.link = link;
    }

    public Object getAdId() {
        return adId;
    }

    public void setAdId(Object adId) {
        this.adId = adId;
    }

    public Boolean getAdActive() {
        return adActive;
    }

    public void setAdActive(Boolean adActive) {
        this.adActive = adActive;
    }

    public Boolean getAdOnModeration() {
        return adOnModeration;
    }

    public void setAdOnModeration(Boolean adOnModeration) {
        this.adOnModeration = adOnModeration;
    }
}