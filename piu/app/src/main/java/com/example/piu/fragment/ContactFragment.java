package com.example.piu.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContactFragment extends Fragment {

    @BindView(R.id.contact_message)
    EditText mContactMessage;

    @BindView(R.id.char_counter)
    TextView mCharCounter;

    private final TextWatcher mTextEditorWatcher = new TextWatcher() {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //This sets a textview to the current length
            String myText = s.length() + "/500";
            mCharCounter.setText(myText);
        }

        public void afterTextChanged(Editable s) {
        }
    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCharCounter.setText("0/500");
        mContactMessage.addTextChangedListener(mTextEditorWatcher);
    }
}
