package com.example.piu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginFragment extends Fragment {
    @BindView(R.id.fingerprint)
    ImageView mFingerPrintImageView;

    @BindView(R.id.login_button)
    Button mLoginButton;

    @BindView(R.id.username_edit_text)
    EditText mUserNameEditText;

    @BindView(R.id.password_edit_text)
    EditText mPasswordEditText;

    private View mView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFingerPrintImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(mView).navigate(R.id.loginFragment_to_loginFingerprintFragment);
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mPasswordEditText.getText().toString().isEmpty() && !mUserNameEditText.getText().toString().isEmpty()) {
                    Navigation.findNavController(mView).navigate(R.id.loginFragment_to_homeFragment);
                } else {
                    Toast.makeText(getContext(), "Error!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
