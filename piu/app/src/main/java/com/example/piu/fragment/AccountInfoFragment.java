package com.example.piu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AccountInfoFragment extends Fragment {

    @BindView(R.id.change_password)
    TextView mChangePassword;

    @BindView(R.id.users)
    TextView mUsers;

    @BindView(R.id.logout)
    TextView mLogout;

    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_account_info, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo: nav to change password fragment
                Navigation.findNavController(mView).navigate(R.id.action_accountInfoFragment_to_changePasswordFragment);
            }
        });

        mUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_accountInfoFragment_to_usersFragment);
            }
        });

        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(mView).navigate(R.id.action_accountInfoFragment_to_loginFragment);
            }
        });
    }
}
