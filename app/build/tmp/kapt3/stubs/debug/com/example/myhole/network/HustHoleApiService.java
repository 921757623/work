package com.example.myhole.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myhole/network/HustHoleApiService;", "", "getHoleList", "", "Lcom/example/myhole/model/Hole;", "timestamp", "", "getHoleNum", "", "mode", "offset", "(Ljava/lang/String;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneHole", "data", "Lcom/example/myhole/model/Interact;", "postInteractFollow", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "postInteractLike", "postInteractUnFollow", "postInteractUnLike", "app_debug"})
public abstract interface HustHoleApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "hole/list")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract java.lang.Object getHoleList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "timestamp")
    java.lang.String timestamp, @retrofit2.http.Query(value = "limit")
    int getHoleNum, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "mode")
    java.lang.String mode, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myhole.model.Hole>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "hole/one")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract com.example.myhole.model.Hole getOneHole(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myhole.model.Interact data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "interact/like")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract retrofit2.Call<okhttp3.ResponseBody> postInteractLike(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myhole.model.Interact data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "interact/unlike")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract retrofit2.Call<okhttp3.ResponseBody> postInteractUnLike(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myhole.model.Interact data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "interact/follow")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract retrofit2.Call<okhttp3.ResponseBody> postInteractFollow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myhole.model.Interact data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "interact/unfollow")
    @retrofit2.http.Headers(value = {"Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4"})
    public abstract retrofit2.Call<okhttp3.ResponseBody> postInteractUnFollow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myhole.model.Interact data);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}