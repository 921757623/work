package com.example.myhole.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\r"}, d2 = {"bindRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/example/myhole/model/Hole;", "bindStatus", "statusView", "Landroid/widget/ImageView;", "status", "Lcom/example/myhole/data/HustHoleApiStatus;", "Landroid/widget/TextView;", "app_debug"})
public final class CustomBindingAdapterKt {
    
    /**
     * @classname CustomBindingAdapter
     * @description:
     * @date :2022/8/17 20:28
     * @version :1.0
     * @author
     */
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myhole.model.Hole> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusView, @org.jetbrains.annotations.Nullable()
    com.example.myhole.data.HustHoleApiStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView statusView, @org.jetbrains.annotations.Nullable()
    com.example.myhole.data.HustHoleApiStatus status) {
    }
}