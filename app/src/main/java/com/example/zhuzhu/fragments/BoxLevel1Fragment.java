package com.example.zhuzhu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.zhuzhu.R;
import com.example.zhuzhu.customview.RLProgressBar;

/**
 * Description:
 * Created By BSM
 * Date: 2020/9/27
 */
public class BoxLevel1Fragment extends Fragment {

    public RLProgressBar rl_pb;
    public TextView tv_box_prize;
    public ImageView iv_box_gift_1;
    public TextView tv_box_gift_1;
    public RelativeLayout rl_box_gift_1;
    public ImageView iv_box_gift_2;
    public TextView tv_box_gift_2;
    public RelativeLayout rl_box_gift_2;
    public ImageView iv_box_gift_3;
    public TextView tv_box_gift_3;
    public RelativeLayout rl_box_gift_3;
    public ImageView iv_box_gift_4;
    public TextView tv_box_gift_4;
    public RelativeLayout rl_box_gift_4;
    public ImageView iv_box_gift_5;
    public TextView tv_box_gift_5;
    public RelativeLayout rl_box_gift_5;
    public ImageView iv_box_gift_6;
    public TextView tv_box_gift_6;
    public RelativeLayout rl_box_gift_6;
    public RelativeLayout rl_box_gift;
    public TextView tv_box_send;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_level_one, container, false);
        initViewHolder(inflate);
        return inflate;
    }

    public void initViewHolder(View rootView) {
        this.rl_pb = (RLProgressBar) rootView.findViewById(R.id.rl_pb);
        this.tv_box_prize = (TextView) rootView.findViewById(R.id.tv_box_prize);
        this.iv_box_gift_1 = (ImageView) rootView.findViewById(R.id.iv_box_gift_1);
        this.tv_box_gift_1 = (TextView) rootView.findViewById(R.id.tv_box_gift_1);
        this.rl_box_gift_1 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_1);
        this.iv_box_gift_2 = (ImageView) rootView.findViewById(R.id.iv_box_gift_2);
        this.tv_box_gift_2 = (TextView) rootView.findViewById(R.id.tv_box_gift_2);
        this.rl_box_gift_2 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_2);
        this.iv_box_gift_3 = (ImageView) rootView.findViewById(R.id.iv_box_gift_3);
        this.tv_box_gift_3 = (TextView) rootView.findViewById(R.id.tv_box_gift_3);
        this.rl_box_gift_3 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_3);
        this.iv_box_gift_4 = (ImageView) rootView.findViewById(R.id.iv_box_gift_4);
        this.tv_box_gift_4 = (TextView) rootView.findViewById(R.id.tv_box_gift_4);
        this.rl_box_gift_4 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_4);
        this.iv_box_gift_5 = (ImageView) rootView.findViewById(R.id.iv_box_gift_5);
        this.tv_box_gift_5 = (TextView) rootView.findViewById(R.id.tv_box_gift_5);
        this.rl_box_gift_5 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_5);
        this.iv_box_gift_6 = (ImageView) rootView.findViewById(R.id.iv_box_gift_6);
        this.tv_box_gift_6 = (TextView) rootView.findViewById(R.id.tv_box_gift_6);
        this.rl_box_gift_6 = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift_6);
        this.rl_box_gift = (RelativeLayout) rootView.findViewById(R.id.rl_box_gift);
        this.tv_box_send = (TextView) rootView.findViewById(R.id.tv_box_send);
    }

}
