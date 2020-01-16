package com.example.piu.fragment;


import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;



public class RoomFeaturesFragment extends Fragment {

    private View mView;

    @BindView(R.id.buttonOnOff)
    Button mButtonOnOff;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_room_features, container, false);
        ButterKnife.bind(this, mView);
        return mView;

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mButtonOnOff.setOnClickListener(view1 -> onClick(mView));


    }

    public void onClick(View v) {
        new AlertDialog.Builder(getActivity())
                .setTitle("Do you want to turn on the light?" )
                .setPositiveButton("Yes", (dialog, which) -> {
                    AlertDialog alert2 = new AlertDialog.Builder(getActivity())
                            .setTitle("Light on ")
                            .setNeutralButton("Exit", (dialog1, which1) -> {
                            })
                            .show();
                })
                .setNegativeButton("No", (dialog, which) -> {

                })
                .show();
    }
}
