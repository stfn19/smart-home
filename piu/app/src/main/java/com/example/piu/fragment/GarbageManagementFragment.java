package com.example.piu.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class GarbageManagementFragment extends Fragment {

    @BindView(R.id.total_recycle)
    TextView mTotalRecycle;

    @BindView(R.id.recycle_category)
    TextView mRecycleCategory;

    @BindView(R.id.recycle)
    TextView mRecycle;

    private View mView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_garbage_management, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTotalRecycle.setOnClickListener(view1 -> Navigation.findNavController(mView).navigate(R.id.action_garbageManagementFragment_to_viewTotalRecycleFragment));
        mRecycleCategory.setOnClickListener(view1 -> Navigation.findNavController(mView).navigate(R.id.action_garbageManagementFragment_to_recycleCategoriesFragment));
        mRecycle.setOnClickListener(view1 -> onClick(mView));

    }
    public void onClick(View v) {
        new AlertDialog.Builder(getActivity())
                .setTitle("Do you want to recycle?" )
                .setPositiveButton("Yes", (dialog, which) -> {
                    AlertDialog alert2 = new AlertDialog.Builder(getActivity())
                            .setTitle("Congratulations! ")
                            .setMessage("You've recycled your garbage!")
                            .setNeutralButton("Exit", (dialog1, which1) -> {
                            })
                            .show();
                })
                .setNegativeButton("No", (dialog, which) -> {

                })
                .show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
