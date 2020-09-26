package com.example.zhuzhu.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.zhuzhu.R;
import com.example.zhuzhu.callback.DialogBoxCallback;
import com.example.zhuzhu.customview.RLProgressBar;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author bsm
 * @name zhuzhu
 * @class name：com.example.zhuzhu.fragments
 * @class describe
 * @time 2020/9/24 20:37
 */
public class BoxLevelFragment extends Fragment implements View.OnClickListener {
    public Button btn_box_level_1;
    public Button btn_box_level_2;
    public Button btn_box_level_3;
    public Button btn_box_level_4;
    public Button btn_box_level_5;
    public LinearLayout ll_box_level;
    public TextView tv_box_current;
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
    private List<Button> btnLevelList;
    private DialogBoxCallback dialogBoxCallback;
    private RLProgressBar rlProgressBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_box_level, container, false);
        initViewHolder(inflate);
        for (Button button : btnLevelList) {
            button.setOnClickListener(this);
        }
        initBtnLevel(btn_box_level_1);

        return inflate;
    }

    private void initBtnLevel(Button btn_box_level_1) {
        for (Button button : btnLevelList) {
            if(btn_box_level_1 == button){
                button.setBackgroundResource(R.drawable.icon_box_level_bg);
                button.setTextColor(getResources().getColor(R.color.color_white));
            } else {
                button.setBackgroundResource(R.drawable.icon_box_level_bg_noral);
                button.setTextColor(getResources().getColor(R.color.color_white_50));
            }
        }
    }

    public void setDialogBoxCallback(DialogBoxCallback dialogBoxCallback) {
        this.dialogBoxCallback = dialogBoxCallback;
    }

    public void initViewHolder(View rootView) {
        btnLevelList = new ArrayList<>();
        this.btn_box_level_1 = (Button) rootView.findViewById(R.id.btn_box_level_1);
        this.btn_box_level_2 = (Button) rootView.findViewById(R.id.btn_box_level_2);
        this.btn_box_level_3 = (Button) rootView.findViewById(R.id.btn_box_level_3);
        this.btn_box_level_4 = (Button) rootView.findViewById(R.id.btn_box_level_4);
        this.btn_box_level_5 = (Button) rootView.findViewById(R.id.btn_box_level_5);
        btnLevelList.add(btn_box_level_1);
        btnLevelList.add(btn_box_level_2);
        btnLevelList.add(btn_box_level_3);
        btnLevelList.add(btn_box_level_4);
        btnLevelList.add(btn_box_level_5);

        this.ll_box_level = (LinearLayout) rootView.findViewById(R.id.ll_box_level);
        this.tv_box_current = (TextView) rootView.findViewById(R.id.tv_box_current);
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
        rlProgressBar = rootView.findViewById(R.id.rl_pb);
        handler.sendEmptyMessageDelayed(1,10);
    }

    int position = 1;

    private Handler handler = new Handler(){
        @SuppressLint("HandlerLeak")
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    position++;
                    Log.e("bsm","postion=="+position);
                    if(position == 100){
                        handler.removeMessages(1);
                    } else {
                        handler.sendEmptyMessageDelayed(1,10);
                    }
                    rlProgressBar.setPosition(position);
                    break;
            }
        }
    };


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_box_level_1:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_1);
                }
                rlProgressBar.setThumbIcon(R.drawable.icon_box_thumb_1);
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_2:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_2);
                }
                rlProgressBar.setThumbIcon(R.drawable.icon_box_thumb_2);
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_3:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_3);
                }
                rlProgressBar.setThumbIcon(R.drawable.icon_box_thumb_3);
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_4:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_4);
                }
                rlProgressBar.setThumbIcon(R.drawable.icon_box_thumb_4);
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_5:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_5);
                }
                rlProgressBar.setThumbIcon(R.drawable.icon_box_thumb_5);
                initBtnLevel((Button) view);
                break;
        }
    }

    @Override
    public void onDestroy() {
        if (handler != null) {
            handler.removeMessages(1);
        }
        super.onDestroy();
    }
}
