// Generated by data binding compiler. Do not edit!
package com.example.myhole.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myhole.R;
import com.example.myhole.model.Hole;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView content;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView holeNum;

  @NonNull
  public final ImageView imgStar;

  @NonNull
  public final ImageView imgTalk;

  @NonNull
  public final TextView textStar;

  @NonNull
  public final TextView textTalk;

  @NonNull
  public final ImageView threePoint;

  @NonNull
  public final ImageView thumbsUp;

  @NonNull
  public final TextView upNum;

  @Bindable
  protected Hole mHole;

  protected ListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView content, TextView date, TextView holeNum, ImageView imgStar, ImageView imgTalk,
      TextView textStar, TextView textTalk, ImageView threePoint, ImageView thumbsUp,
      TextView upNum) {
    super(_bindingComponent, _root, _localFieldCount);
    this.content = content;
    this.date = date;
    this.holeNum = holeNum;
    this.imgStar = imgStar;
    this.imgTalk = imgTalk;
    this.textStar = textStar;
    this.textTalk = textTalk;
    this.threePoint = threePoint;
    this.thumbsUp = thumbsUp;
    this.upNum = upNum;
  }

  public abstract void setHole(@Nullable Hole hole);

  @Nullable
  public Hole getHole() {
    return mHole;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemBinding>inflateInternal(inflater, R.layout.list_item, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemBinding>inflateInternal(inflater, R.layout.list_item, null, false, component);
  }

  public static ListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemBinding)bind(component, view, R.layout.list_item);
  }
}
