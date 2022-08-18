package com.example.myhole.model;

import java.lang.System;

/**
 * Hole
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u00aa\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\r\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u000e\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017\u00a8\u00065"}, d2 = {"Lcom/example/myhole/model/Hole;", "", "content", "", "creatAt", "follow", "", "forestID", "forestName", "holeID", "isFollow", "", "isMine", "isReply", "isThumb", "lastReplyAt", "reply", "thumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getContent", "()Ljava/lang/String;", "getCreatAt", "getFollow", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getForestID", "getForestName", "getHoleID", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastReplyAt", "getReply", "getThumb", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/example/myhole/model/Hole;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Hole {
    
    /**
     * 内容
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String content = null;
    
    /**
     * 发布时间
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String creatAt = null;
    
    /**
     * 收藏数
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long follow = null;
    
    /**
     * 小树林id
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String forestID = null;
    
    /**
     * 小树林名字
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String forestName = null;
    
    /**
     * 树洞id
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String holeID = null;
    
    /**
     * 是否收藏
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isFollow = null;
    
    /**
     * 是否属于自己
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isMine = null;
    
    /**
     * 是否评论
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isReply = null;
    
    /**
     * 是否点赞
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isThumb = null;
    
    /**
     * 最新评论时间
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastReplyAt = null;
    
    /**
     * 评论数
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long reply = null;
    
    /**
     * 点赞数
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long thumb = null;
    
    /**
     * Hole
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.myhole.model.Hole copy(@org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String creatAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "forestId")
    java.lang.String forestID, @org.jetbrains.annotations.Nullable()
    java.lang.String forestName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "holeId")
    java.lang.String holeID, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFollow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isMine, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isReply, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isThumb, @org.jetbrains.annotations.Nullable()
    java.lang.String lastReplyAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long reply, @org.jetbrains.annotations.Nullable()
    java.lang.Long thumb) {
        return null;
    }
    
    /**
     * Hole
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Hole
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Hole
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Hole() {
        super();
    }
    
    public Hole(@org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String creatAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long follow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "forestId")
    java.lang.String forestID, @org.jetbrains.annotations.Nullable()
    java.lang.String forestName, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "holeId")
    java.lang.String holeID, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFollow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isMine, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isReply, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isThumb, @org.jetbrains.annotations.Nullable()
    java.lang.String lastReplyAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long reply, @org.jetbrains.annotations.Nullable()
    java.lang.Long thumb) {
        super();
    }
    
    /**
     * 内容
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * 内容
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContent() {
        return null;
    }
    
    /**
     * 发布时间
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * 发布时间
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatAt() {
        return null;
    }
    
    /**
     * 收藏数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    /**
     * 收藏数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getFollow() {
        return null;
    }
    
    /**
     * 小树林id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * 小树林id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForestID() {
        return null;
    }
    
    /**
     * 小树林名字
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * 小树林名字
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForestName() {
        return null;
    }
    
    /**
     * 树洞id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * 树洞id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHoleID() {
        return null;
    }
    
    /**
     * 是否收藏
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    /**
     * 是否收藏
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFollow() {
        return null;
    }
    
    /**
     * 是否属于自己
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    /**
     * 是否属于自己
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isMine() {
        return null;
    }
    
    /**
     * 是否评论
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    /**
     * 是否评论
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isReply() {
        return null;
    }
    
    /**
     * 是否点赞
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    /**
     * 是否点赞
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isThumb() {
        return null;
    }
    
    /**
     * 最新评论时间
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * 最新评论时间
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastReplyAt() {
        return null;
    }
    
    /**
     * 评论数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
        return null;
    }
    
    /**
     * 评论数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getReply() {
        return null;
    }
    
    /**
     * 点赞数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
        return null;
    }
    
    /**
     * 点赞数
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getThumb() {
        return null;
    }
}