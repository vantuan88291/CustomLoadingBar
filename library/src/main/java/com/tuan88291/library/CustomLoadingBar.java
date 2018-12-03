package com.tuan88291.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomLoadingBar extends RelativeLayout {

    private TextView mLoadtext;
    private ProgressBar mLoading;
    private ProgressBar mloadingCircular;
    private RelativeLayout mBoxLoading;

    public CustomLoadingBar(@NonNull Context context) {
        super(context);
    }

    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUpView(context, attrs);
    }

    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUpView(context, attrs);


    }

    @SuppressLint("NewApi")
    public CustomLoadingBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void setUpView(Context context, AttributeSet attrs){
        LayoutInflater.from(context).inflate(R.layout.custom_loading_bar_multi_progesss, this, true);
        this.mLoadtext = findViewById(R.id.textloadForLoading);
        this.mLoading = findViewById(R.id.loadingHorizontals);
        this.mloadingCircular = findViewById(R.id.loadingCircularbox);
        this.mBoxLoading = findViewById(R.id.boxLoadingBorderWhite);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomLoadingbar);
        String mtext = a.getString(R.styleable.CustomLoadingbar_loadingText);
        boolean mcheckBox = a.getBoolean(R.styleable.CustomLoadingbar_isboxLoading, false);
        boolean mcheckBoxCircular = a.getBoolean(R.styleable.CustomLoadingbar_isloadingCircular, false);
        this.mLoadtext.setTextColor(a.getColor(R.styleable.CustomLoadingbar_loadingTextColor, ContextCompat.getColor(context, R.color.colorAccent)));

        if(mcheckBox){
            mBoxLoading.setBackgroundResource(R.drawable.cicrlecornor);
        }else{
            mBoxLoading.setBackgroundColor(Color.TRANSPARENT);
        }

        if (mcheckBoxCircular){
            mLoading.setVisibility(GONE);
            mloadingCircular.setVisibility(VISIBLE);
        }else{
            mLoading.setVisibility(VISIBLE);
            mloadingCircular.setVisibility(GONE);
        }

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
