package com.example.myhole.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myhole/data/HomeScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_holeList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/myhole/model/Hole;", "_status", "Lcom/example/myhole/data/HustHoleApiStatus;", "_time", "", "holeList", "Landroidx/lifecycle/LiveData;", "getHoleList", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "time", "getTime", "getCurrentTime", "", "getHomeScreenHoles", "", "getMoreHoles", "app_debug"})
public final class HomeScreenViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myhole.model.Hole>> _holeList = null;
    private final androidx.lifecycle.MutableLiveData<com.example.myhole.data.HustHoleApiStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _time = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.myhole.data.HustHoleApiStatus> status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myhole.model.Hole>> holeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> time = null;
    
    public HomeScreenViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myhole.data.HustHoleApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myhole.model.Hole>> getHoleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTime() {
        return null;
    }
    
    public final void getHomeScreenHoles() {
    }
    
    public final void getMoreHoles(int time) {
    }
    
    private final java.lang.String getCurrentTime() {
        return null;
    }
}