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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.piu.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



public class ActivityFragment extends Fragment {
    @BindView(R.id.new_activity_option)
    TextView newActivity;


    @BindView(R.id.activity_list)
    ListView activityListView;
    private String[] currentActivity={"Workout","Dinner","Study"};


    private View activityView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        activityView = inflater.inflate(R.layout.fragment_activity, container, false);
        ButterKnife.bind(this,activityView);
        return activityView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), R.layout.text_view_item, currentActivity);
        activityListView.setAdapter(adapter);
        //SavedRuleAapter savedRuleAapter = new SavedRuleAapter(rulesArray);
        //rulseListView.setAdapter(savedRuleAapter);
        newActivity.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Navigation.findNavController(activityView).navigate(R.id.action_activityFragment_to_newActivityFragment);

                                       }
                                   }
        );

    }

}
