package com.example.parkminhyun.java_designpattern_seminar.screen;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.parkminhyun.java_designpattern_seminar.R;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ParkMinHyun on 2018-05-14.
 */

public class MemberListView extends FrameLayout {

    @BindView(R.id.nameText)
    MaterialEditText nameText;

    @BindView(R.id.phoneNumText)
    MaterialEditText phoneNumText;

    @BindView(R.id.memberAddButton)
    View memberAddButton;

    public MemberListView(Context context) {
        this(context, null);
    }

    public MemberListView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MemberListView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MemberListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.layout_member, this);
        ButterKnife.bind(this);
    }
}
