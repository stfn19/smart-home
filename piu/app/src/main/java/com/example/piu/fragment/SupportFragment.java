package com.example.piu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.piu.adapter.SupportQuestionAnswerAdapter;
import com.example.piu.R;
import com.example.piu.model.Support;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SupportFragment extends Fragment {
    @BindView(R.id.categories_list_view)
    ListView mCategoriesListView;

    @BindView(R.id.questions_list_view)
    RecyclerView mQuestionsListView;

    @BindView(R.id.button_contact)
    Button mButtonContact;

    @BindView(R.id.button_chat)
    Button mButtonChat;

    private String[] mCategoriesArray = {"General", "Accounts", "Rules", "Activities", "Privacy Policy", "Terms and Conditions"};
    private List<Support> mQuestionsArray;

    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_support, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), R.layout.text_view_item, mCategoriesArray);
        mCategoriesListView.setAdapter(adapter);
        createQuestionArray();
        mCategoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 4 || i == 5) {
                    Navigation.findNavController(mView).navigate(R.id.action_supportFragment_to_termsCondPrivPolFragment);
                } else {
                    SupportQuestionAnswerAdapter expListAdapter = new SupportQuestionAnswerAdapter(mQuestionsArray);
                    mQuestionsListView.setAdapter(expListAdapter);
                    mQuestionsListView.setLayoutManager(new LinearLayoutManager(getContext()));
                    mQuestionsListView.setVisibility(View.VISIBLE);
                    mCategoriesListView.setVisibility(View.GONE);
                }
            }
        });

        mButtonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_supportFragment_to_contactFragment);
            }
        });

        mButtonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_supportFragment_to_chatFragment);
            }
        });
    }

    private void createQuestionArray() {
        mQuestionsArray = new ArrayList<>();
        String mAnswer = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.";
        mQuestionsArray.add(new Support("Lorem ipsum dolor sit amet?", mAnswer, false));
        mQuestionsArray.add(new Support("Gravida quis blandit turpis?", mAnswer, false));
        mQuestionsArray.add(new Support("Tempus iaculis urna id volutpat?", mAnswer, false));
        mQuestionsArray.add(new Support("Vitae suscipit tellus mauris a?", mAnswer, false));
        mQuestionsArray.add(new Support("Fusce id velit ut tortor pretium?", mAnswer, false));
        mQuestionsArray.add(new Support("Magna sit amet purus gravida?", mAnswer, false));
    }
}
