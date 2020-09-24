package com.example.zhuzhu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhuzhu.R;
import com.example.zhuzhu.callback.DialogBoxCallback;

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
public class BoxHelpFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_box_help, container,false);
        return inflate;
    }
}
