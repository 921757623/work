package com.example.myhole.databinding;
import com.example.myhole.R;
import com.example.myhole.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeScreenFragmentBindingImpl extends HomeScreenFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.Line, 4);
        sViewsWithIds.put(R.id.search, 5);
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.refreshLayout, 7);
        sViewsWithIds.put(R.id.nested_scroll, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeScreenFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private HomeScreenFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.scwang.smart.refresh.layout.SmartRefreshLayout) bindings[7]
            , (android.widget.EditText) bindings[5]
            );
        this.error.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.myhole.data.HomeScreenViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.myhole.data.HomeScreenViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.myhole.data.HustHoleApiStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelHoleList((androidx.lifecycle.LiveData<java.util.List<com.example.myhole.model.Hole>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.myhole.data.HustHoleApiStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHoleList(androidx.lifecycle.LiveData<java.util.List<com.example.myhole.model.Hole>> ViewModelHoleList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.example.myhole.data.HustHoleApiStatus> viewModelStatus = null;
        com.example.myhole.data.HustHoleApiStatus viewModelStatusGetValue = null;
        java.util.List<com.example.myhole.model.Hole> viewModelHoleListGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.example.myhole.model.Hole>> viewModelHoleList = null;
        com.example.myhole.data.HomeScreenViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.holeList
                        viewModelHoleList = viewModel.getHoleList();
                    }
                    updateLiveDataRegistration(1, viewModelHoleList);


                    if (viewModelHoleList != null) {
                        // read viewModel.holeList.getValue()
                        viewModelHoleListGetValue = viewModelHoleList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.myhole.adapter.CustomBindingAdapterKt.bindStatus(this.error, viewModelStatusGetValue);
            com.example.myhole.adapter.CustomBindingAdapterKt.bindStatus(this.mboundView2, viewModelStatusGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.myhole.adapter.CustomBindingAdapterKt.bindRecyclerView(this.recyclerView, viewModelHoleListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.holeList
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}