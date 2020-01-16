package com.example.piu.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NewActivityFragment extends Fragment {
    @BindView(R.id.timer_view_a)
    TextView timerView;
    @BindView(R.id.add_img_a)
    ImageView addDevice;

    @BindView(R.id.add_new_device_a)
    TextView addDevice2;


    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_new_activity, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        timerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_newActivityFragment_to_actTimerFragment);
            }
        });
        addDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_newActivityFragment_to_allDevicesFragment);
            }
        });
        addDevice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_newActivityFragment_to_allDevicesFragment);
            }
        });


    }
}
