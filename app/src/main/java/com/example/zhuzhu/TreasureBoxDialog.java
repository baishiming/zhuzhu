package com.example.zhuzhu;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.zhuzhu.adapters.MyFragmentPagerAdapter;
import com.example.zhuzhu.callback.DialogBoxCallback;
import com.example.zhuzhu.fragments.BoxHelpFragment;
import com.example.zhuzhu.fragments.BoxLevelFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

/**
 * Description:
 * Created By BSM
 * Date: 2020/9/24
 */
public class TreasureBoxDialog extends DialogFragment implements DialogBoxCallback, View.OnClickListener {


    private ViewPager vp_box;
    private ImageView iv_dialog_box_help;
    private RelativeLayout rl_box;
    private ImageView iv_box_level;
    private BoxHelpFragment boxHelpFragment;
    private BoxLevelFragment boxLevelFragment;
    private ArrayList<Fragment> fragmentList = null;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private int curPosition = 0;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.DialogFullScreen1); //dialog全屏
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_treasure_box, container);
        getDialog().getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        WindowManager.LayoutParams params = getDialog().getWindow()
                .getAttributes();
        params.gravity = Gravity.BOTTOM;
        getDialog().getWindow().setAttributes(params);
        initViewHolder(view);
        initViewPager();
        return view;
    }

    private void initViewPager() {
        fragmentList = new ArrayList<>();
        boxHelpFragment = new BoxHelpFragment();
        boxLevelFragment = new BoxLevelFragment();
        boxLevelFragment.setDialogBoxCallback(this);
        fragmentList.add(boxLevelFragment);
        fragmentList.add(boxHelpFragment);
        FragmentManager fragmentManager = getChildFragmentManager();
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(fragmentManager,fragmentList);
        vp_box.setAdapter(myFragmentPagerAdapter);
    }

    public void initViewHolder(View rootView) {
        this.vp_box = (ViewPager) rootView.findViewById(R.id.vp_box);
        this.iv_dialog_box_help = (ImageView) rootView.findViewById(R.id.iv_dialog_box_help);
        this.rl_box = (RelativeLayout) rootView.findViewById(R.id.rl_box);
        iv_box_level =  rootView.findViewById(R.id.iv_box_level);

        iv_dialog_box_help.setOnClickListener(this);
    }

    @Override
    public void onBackBoxIcon(int srcId) {
        iv_box_level.setImageResource(srcId);
    }

    @Override
    public void onFragmentPosition(int position) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_dialog_box_help:
                if(curPosition == 0){
                    iv_dialog_box_help.setImageResource(R.drawable.icon_title_back_white);
                    curPosition = 1;
                    vp_box.setCurrentItem(1);
                } else {
                    iv_dialog_box_help.setImageResource(R.drawable.icon_dialog_box_help);
                    curPosition = 0;
                    vp_box.setCurrentItem(0);
                }
                break;
        }
    }
}
