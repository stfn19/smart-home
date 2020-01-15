package com.example.piu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.piu.R;
import com.example.piu.adapter.UsersAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UsersFragment extends Fragment {

    @BindView(R.id.users_recycler_view)
    RecyclerView mUsers;

    private List<String> mUserList = new ArrayList<>();

    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        makeUserList();
        mView = inflater.inflate(R.layout.fragment_users, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUsers.setAdapter(new UsersAdapter(mUserList));
        mUsers.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void makeUserList() {
        mUserList.add("Brandon Moore");
        mUserList.add("Lisa Moore");
        mUserList.add("Maya Moore");
        mUserList.add("Brandon Moore Jr.");
        mUserList.add("Felix Moore");
    }
}
