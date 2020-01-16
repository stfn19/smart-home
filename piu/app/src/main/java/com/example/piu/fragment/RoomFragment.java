package com.example.piu.fragment;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.piu.R;


import butterknife.BindView;
import butterknife.ButterKnife;


public class RoomFragment extends Fragment {
    private View mView;

    @BindView(R.id.buttonRound)
    Button mRound_button;

    @BindView(R.id.buttonLighting)
    Button mButtonLighting;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_room, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle!=null)
        {
            int bedroom= bundle.getInt("bedroom"),
                    livingroom =bundle.getInt("living_room"),
                    bathroom = bundle.getInt("bathroom"),
                    kitchen = bundle.getInt("kitchen"),
                    store = bundle.getInt("store"),
                    study_room = bundle.getInt("study_room");

            int receivedFragmentId = bundle.getInt("bedroom");
            if(bedroom==1)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.bed));
                mRound_button.setText("Bedroom");
                livingroom=0;
                bathroom=0;
                kitchen=0;
                store=0;
                study_room=0;
            }
            else if(livingroom==2)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.sofa));
                mRound_button.setText("Living Room");
                bedroom=0;
                bathroom=0;
                kitchen=0;
                store=0;
                study_room=0;
            }
            else if(bathroom==3)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.bathtub));
                mRound_button.setText("Bathroom");
                bedroom=0;
                livingroom=0;
                kitchen=0;
                store=0;
                study_room=0;
            }
            else if(kitchen==4)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.store));
                mRound_button.setText("Kitchen");
                bedroom=0;
                bathroom=0;
                bathroom=0;
                store=0;
                study_room=0;
            }
            else if(store==5)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.store));
                mRound_button.setText("Store Room");
                bedroom=0;
                bathroom=0;
                bathroom=0;
                kitchen=0;
                study_room=0;
            }
            else if(study_room==6)
            {
                mRound_button.setForeground(getContext().getDrawable(R.drawable.book));
                mRound_button.setText("Study Room");
                bedroom=0;
                bathroom=0;
                bathroom=0;
                kitchen=0;
                store=0;
            }
            else
            {
                Log.v("Room fragment", "Nu ");
            }

            mButtonLighting.setOnClickListener(view1 -> Navigation.findNavController(mView).navigate(R.id.action_roomFragment2_to_roomFeaturesFragment));
            /*

            switch(receivedFragmentId) {
                 case 1:
                     mRound_button.setForeground(getContext().getDrawable(R.drawable.bed));
                    mRound_button.setText("Bedroom");
                    break ;
                case 2:
                   // mRound_button.setForeground(getContext().getDrawable(R.drawable.sofa));
                    mRound_button.setText("Living Room");
                    break ;
                case 3:
                   // mRound_button.setForeground(getContext().getDrawable(R.drawable.bathtub));
                    mRound_button.setText("Bathroom");
                    break ;
                case 4:
                   // mRound_button.setForeground(getContext().getDrawable(R.drawable.store));
                    mRound_button.setText("Kitchen");
                    break ;
                case 5:
                  //  mRound_button.setForeground(getContext().getDrawable(R.drawable.kitchen));
                    mRound_button.setText("Store");
                    break ;
                case 6:
                    //mRound_button.setForeground(getContext().getDrawable(R.drawable.book));
                    mRound_button.setText("Study Room");
                    break ;
                default: Log.v("Room fragment", "Nu ");
                    break ;
            }
         */
        }


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
