package com.tuan88291.customloadingbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CustomLoadingBar extends FrameLayout{

    private TextView mLoadtext;

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

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomLoadingbar);
        String mtext = a.getString(R.styleable.CustomLoadingbar_loadingText);
        this.mLoadtext.setTextColor(a.getColor(R.styleable.CustomLoadingbar_loadingTextColor, ContextCompat.getColor(context, R.color.colorAccent)));

        setTextLoading(mtext);



    }

    private void setTextLoading(String text){
        if (text != null){
            this.mLoadtext.setText(text);
        }
    }


}
