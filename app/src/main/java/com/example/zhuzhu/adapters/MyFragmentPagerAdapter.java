package com.example.zhuzhu.adapters;


import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by administratr on 2017/7/17.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> list;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

}
