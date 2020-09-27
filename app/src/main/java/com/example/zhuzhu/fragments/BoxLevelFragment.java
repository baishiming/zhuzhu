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
import com.example.zhuzhu.adapters.MyFragmentPagerAdapter;
import com.example.zhuzhu.callback.DialogBoxCallback;
import com.example.zhuzhu.customview.RLProgressBar;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

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
    public ViewPager viewPager_level;

    private List<Button> btnLevelList;
    private DialogBoxCallback dialogBoxCallback;

    private BoxLevel1Fragment boxLevel1Fragment;
    private BoxLevel1Fragment boxLevel2Fragment;
    private BoxLevel1Fragment boxLevel3Fragment;
    private BoxLevel1Fragment boxLevel4Fragment;
    private BoxLevel1Fragment boxLevel5Fragment;

    private ArrayList<Fragment> fragmentList = null;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_box_level, container, false);
        initViewHolder(inflate);
        for (Button button : btnLevelList) {
            button.setOnClickListener(this);
        }
        initBtnLevel(btn_box_level_1);
        initViewPager();
        return inflate;
    }

    private void initViewPager() {
        fragmentList = new ArrayList<>();
        boxLevel1Fragment = new BoxLevel1Fragment();
        boxLevel2Fragment = new BoxLevel1Fragment();
        boxLevel3Fragment = new BoxLevel1Fragment();
        boxLevel4Fragment = new BoxLevel1Fragment();
        boxLevel5Fragment = new BoxLevel1Fragment();
        fragmentList.add(boxLevel1Fragment);
        fragmentList.add(boxLevel2Fragment);
        fragmentList.add(boxLevel3Fragment);
        fragmentList.add(boxLevel4Fragment);
        fragmentList.add(boxLevel5Fragment);
        FragmentManager fragmentManager = getChildFragmentManager();
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(fragmentManager,fragmentList);
        viewPager_level.setAdapter(myFragmentPagerAdapter);
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

        viewPager_level = rootView.findViewById(R.id.viewPager_level);

        btnLevelList.add(btn_box_level_1);
        btnLevelList.add(btn_box_level_2);
        btnLevelList.add(btn_box_level_3);
        btnLevelList.add(btn_box_level_4);
        btnLevelList.add(btn_box_level_5);

        //rlProgressBar = rootView.findViewById(R.id.rl_pb);
        //handler.sendEmptyMessageDelayed(1,10);
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
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_2:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_2);
                }
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_3:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_3);
                }
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_4:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_4);
                }
                initBtnLevel((Button) view);
                break;
            case R.id.btn_box_level_5:
                if (dialogBoxCallback != null) {
                    dialogBoxCallback.onBackBoxIcon(R.drawable.icon_dialog_box_level_5);
                }
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
