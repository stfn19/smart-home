package com.example.piu.fragment;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.piu.R;
import com.example.piu.model.OnBackPressed;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment implements OnBackPressed {


    @BindView(R.id.device_list)
    Button mDeviceList;


    @BindView(R.id.bedroom)
    Button mBedroom;

    @BindView(R.id.living_room)
    Button mLiving_room;


    @BindView(R.id.bathroom)
    Button mBathroom;


    @BindView(R.id.kitchen)
    Button mKitchen;


    @BindView(R.id.store)
    Button mStore;


    @BindView(R.id.study_room)
    Button mStudy_room;



    Fragment homeFragment = this;


    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    private Boolean mBedroomClicked = false,
            mLiving_roomClicked = false,
            mBathroomClicked = false,
            mKitchenClicked = false,
            mStoreClicked = false,
            mSudy_roomClicked = false;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDeviceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_deviceListFragment);
            }
        });

        mBedroom.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onClick(View view) {

                Bundle bundle1= new Bundle();
                bundle1.putInt("bedroom", 1);
                homeFragment.setArguments(bundle1);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2, bundle1);

                mBedroomClicked = true;
                mLiving_roomClicked= false;
                mBathroomClicked = false;
                mKitchenClicked = false;
                mStoreClicked = false;
                mSudy_roomClicked= false;
                //setPictureAndText();

            }
        });

        mLiving_room.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("living_room", 2);
                homeFragment.setArguments(bundle2);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2,bundle2);

                mBedroomClicked = false;
                mLiving_roomClicked= true;
                mBathroomClicked = false;
                mKitchenClicked = false;
                mStoreClicked = false;
                mSudy_roomClicked= false;
                //setPictureAndText();
            }
        });
        mBathroom.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("bathroom", 3);
                homeFragment.setArguments(bundle3);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2,bundle3);

                mBedroomClicked = false;
                mLiving_roomClicked=false;
                mBathroomClicked = true;
                mKitchenClicked = false;
                mStoreClicked = false;
                mSudy_roomClicked= false;
                //setPictureAndText();
            }
        });

        mKitchen.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Bundle bundle4 = new Bundle();
                bundle4.putInt("kitchen", 4);
                homeFragment.setArguments(bundle4);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2,bundle4);

                mBedroomClicked = false;
                mLiving_roomClicked= false;
                mBathroomClicked = false;
                mKitchenClicked = true;
                mStoreClicked = false;
                mSudy_roomClicked= false;
               // setPictureAndText();
            }
        });

        mStore.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Bundle bundle5 = new Bundle();
                bundle5.putInt("store", 5);
                homeFragment.setArguments(bundle5);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2,bundle5);

                mBedroomClicked = false;
                mLiving_roomClicked= false;
                mBathroomClicked = false;
                mKitchenClicked = false;
                mStoreClicked = true;
                mSudy_roomClicked= false;
               // setPictureAndText();
            }
        });

        mStudy_room.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Bundle bundle6 = new Bundle();
                bundle6.putInt("study_room", 6);
                homeFragment.setArguments(bundle6);
                Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2,bundle6);

                mBedroomClicked = false;
                mLiving_roomClicked=false;
                mBathroomClicked = false;
                mKitchenClicked = false;
                mStoreClicked = false;
                mSudy_roomClicked= true;
               // setPictureAndText();
            }
        });
    }

    /*
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setPictureAndText() {

        Navigation.findNavController(mView).navigate(R.id.action_homeFragment_to_roomFragment2);

        if (mBedroomClicked) {
            final Drawable foregroundBed = mBedroom.getForeground();
            mRound_button.setForeground(foregroundBed);
        } else if(mLiving_roomClicked)
        {
            final Drawable foregroundLiving = mLiving_room.getForeground();
            mRound_button.setForeground(foregroundLiving);
        }
        else if(mBathroomClicked)
        {
            final Drawable foregroundBathroom = mBathroom.getForeground();
            mRound_button.setForeground(foregroundBathroom);
        }
        else if(mKitchenClicked)
        {
            final Drawable foregroundKitchen = mKitchen.getForeground();
            mRound_button.setForeground(foregroundKitchen);
        }
        else if(mStoreClicked)
        {
            final Drawable foregroundStore = mStore.getForeground();
            mRound_button.setForeground(foregroundStore);
        }
        else if(mSudy_roomClicked)
        {
            final Drawable foregroundStudy= mStudy_room.getForeground();
            mRound_button.setForeground(foregroundStudy);
        }


    }*/



    public void onBackPressed() { getActivity().getSupportFragmentManager().popBackStack();}



    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

