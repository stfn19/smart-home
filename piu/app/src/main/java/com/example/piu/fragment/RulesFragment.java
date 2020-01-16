package com.example.piu.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.piu.R;
import com.example.piu.adapter.SavedRuleAapter;
import com.example.piu.model.SavedRule;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



public class RulesFragment extends Fragment {


    @BindView(R.id.new_rule_option)
    TextView newRule;


    @BindView(R.id.rules_list)
    ListView rulseListView;
    private String[] currentRules={"No TV after 12","Limited water"};
    private List<SavedRule> rulesArray;

    private View rulesView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        rulesView = inflater.inflate(R.layout.fragment_rules, container, false);
        ButterKnife.bind(this,rulesView);
        return rulesView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSaveRules();
        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), R.layout.text_view_item, currentRules);
        rulseListView.setAdapter(adapter);
        //SavedRuleAapter savedRuleAapter = new SavedRuleAapter(rulesArray);
        //rulseListView.setAdapter(savedRuleAapter);
        newRule.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     Navigation.findNavController(rulesView).navigate(R.id.action_rulesFragment_to_newRuleFragment);

                                                 }
                                             }
        );

    }
    private void initSaveRules(){
        rulesArray = new ArrayList<>();
        rulesArray.add(new SavedRule("First rule",R.drawable.icons8_plus_24));
    }
}
