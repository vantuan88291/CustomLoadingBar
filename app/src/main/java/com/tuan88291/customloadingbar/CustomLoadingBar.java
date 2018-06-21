package com.tuan88291.customloadingbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CustomLoadingBar extends FrameLayout{

    private TextView mLoadtext;
    private ProgressBar mLoading;

    public CustomLoadingBar(@NonNull Context context) {
        super(context);
    }

    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUpView(context, attrs);
    }

    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //

        setUpView(context, attrs);


    }

    @SuppressLint("NewApi")
    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void setUpView(Context context, AttributeSet attrs){
        LayoutInflater.from(context).inflate(R.layout.custom_loading, this, true);
        this.mLoadtext = findViewById(R.id.textload);
        this.mLoading = findViewById(R.id.loading);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomLoadingbar);
        String mtext = a.getString(R.styleable.CustomLoadingbar_loadingText);
        this.mLoadtext.setTextColor(a.getColor(R.styleable.CustomLoadingbar_loadingTextColor, ContextCompat.getColor(context, R.color.colorAccent)));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ColorStateList colorLoad = ColorStateList.valueOf(a.getColor(R.styleable.CustomLoadingbar_loadingBarColor, ContextCompat.getColor(context, R.color.colorAccent)));
            this.mLoading.setIndeterminateTintList(colorLoad);
        }

        setTextLoading(mtext);



    }

    private void setTextLoading(String text){
        if (text != null){
            this.mLoadtext.setText(text);
        }
    }


}
