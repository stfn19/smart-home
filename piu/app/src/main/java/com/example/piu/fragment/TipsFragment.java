package com.example.piu.fragment;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.piu.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TipsFragment extends Fragment {
    private View mView;

    @BindView(R.id.image_angry)
    ImageView mAngrySmiley;

    @BindView(R.id.image_sad)
    ImageView mSadSmiley;

    @BindView(R.id.image_neutral)
    ImageView mNeutralSmiley;

    @BindView(R.id.image_happy)
    ImageView mHappySmiley;

    @BindView(R.id.image_very_happy)
    ImageView mVeryHappySmiley;

    @BindView(R.id.text_tell_us_more)
    TextView mTextTellUsMore;

    @BindView(R.id.edit_text_tell_us_more)
    EditText mEditTextTellUsMore;

    @BindView(R.id.button_done)
    Button mButtonDone;

    @BindView(R.id.text_thank_you)
    TextView mTextThankYou;

    private Boolean mAngryClicked = false,
            mSadClicked = false,
            mNeutralClicked = false,
            mHappyClicked = false,
            mVeryHappyClicked = false;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView = inflater.inflate(R.layout.fragment_tips, container, false);
        ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAngrySmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAngryClicked = true;
                mSadClicked = false;
                mNeutralClicked = false;
                mHappyClicked = false;
                mVeryHappyClicked = false;
                setDimensionsForSmileys();
            }
        });

        mSadSmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAngryClicked = false;
                mSadClicked = true;
                mNeutralClicked = false;
                mHappyClicked = false;
                mVeryHappyClicked = false;
                setDimensionsForSmileys();
            }
        });

        mNeutralSmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAngryClicked = false;
                mSadClicked = false;
                mNeutralClicked = true;
                mHappyClicked = false;
                mVeryHappyClicked = false;
                setDimensionsForSmileys();
            }
        });

        mHappySmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAngryClicked = false;
                mSadClicked = false;
                mNeutralClicked = false;
                mHappyClicked = true;
                mVeryHappyClicked = false;
                setDimensionsForSmileys();
            }
        });

        mVeryHappySmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAngryClicked = false;
                mSadClicked = false;
                mNeutralClicked = false;
                mHappyClicked = false;
                mVeryHappyClicked = true;
                setDimensionsForSmileys();
            }
        });
    }

    private void setDimensionsForSmileys() {
        mTextTellUsMore.setVisibility(View.VISIBLE);
        mEditTextTellUsMore.setVisibility(View.VISIBLE);
        mButtonDone.setVisibility(View.VISIBLE);

        mButtonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeEveryThingInvisible();
            }
        });

        final int bigDimensionInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 120, getResources().getDisplayMetrics());
        final int smallDimensionInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 70, getResources().getDisplayMetrics());
        if (mAngryClicked) {
            mAngrySmiley.getLayoutParams().height = bigDimensionInDp;
            mAngrySmiley.getLayoutParams().width = bigDimensionInDp;
        } else {
            mAngrySmiley.getLayoutParams().height = smallDimensionInDp;
            mAngrySmiley.getLayoutParams().width = smallDimensionInDp;
        }
        mAngrySmiley.requestLayout();

        if (mSadClicked) {
            mSadSmiley.getLayoutParams().height = bigDimensionInDp;
            mSadSmiley.getLayoutParams().width = bigDimensionInDp;
        } else {
            mSadSmiley.getLayoutParams().height = smallDimensionInDp;
            mSadSmiley.getLayoutParams().width = smallDimensionInDp;
        }
        mSadSmiley.requestLayout();

        if (mNeutralClicked) {
            mNeutralSmiley.getLayoutParams().height = bigDimensionInDp;
            mNeutralSmiley.getLayoutParams().width = bigDimensionInDp;
        } else {
            mNeutralSmiley.getLayoutParams().height = smallDimensionInDp;
            mNeutralSmiley.getLayoutParams().width = smallDimensionInDp;
        }
        mNeutralSmiley.requestLayout();

        if (mHappyClicked) {
            mHappySmiley.getLayoutParams().height = bigDimensionInDp;
            mHappySmiley.getLayoutParams().width = bigDimensionInDp;
        } else {
            mHappySmiley.getLayoutParams().height = smallDimensionInDp;
            mHappySmiley.getLayoutParams().width = smallDimensionInDp;
        }
        mHappySmiley.requestLayout();

        if(mVeryHappyClicked){
            mVeryHappySmiley.getLayoutParams().height = bigDimensionInDp;
            mVeryHappySmiley.getLayoutParams().width = bigDimensionInDp;
        }
        else{
            mVeryHappySmiley.getLayoutParams().height = smallDimensionInDp;
            mVeryHappySmiley.getLayoutParams().width = smallDimensionInDp;
        }
        mVeryHappySmiley.requestLayout();
    }

    private void makeEveryThingInvisible() {
        mAngrySmiley.setVisibility(View.GONE);
        mSadSmiley.setVisibility(View.GONE);
        mNeutralSmiley.setVisibility(View.GONE);
        mHappySmiley.setVisibility(View.GONE);
        mVeryHappySmiley.setVisibility(View.GONE);
        mTextTellUsMore.setVisibility(View.GONE);
        mEditTextTellUsMore.setVisibility(View.GONE);
        mButtonDone.setVisibility(View.GONE);

        mTextThankYou.setVisibility(View.VISIBLE);
    }
}
