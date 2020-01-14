package com.example.piu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.piu.R;
import com.example.piu.model.Support;

import java.util.List;

public class SupportQuestionAnswerAdapter extends RecyclerView.Adapter<SupportQuestionAnswerAdapter.RecViewHolder> {
    private List<Support> list;

    public SupportQuestionAnswerAdapter(List<Support> list) {
        this.list = list;
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.answer_text_view_item, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecViewHolder holder, final int position) {
        final Support qa = list.get(position);
        holder.bind(qa);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean expanded = qa.isExpanded();
                qa.setExpanded(!expanded);
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class RecViewHolder extends RecyclerView.ViewHolder {

        private TextView mQuestion;
        private TextView mAnswer;

        RecViewHolder(View itemView) {
            super(itemView);

            mQuestion = itemView.findViewById(R.id.question);
            mAnswer = itemView.findViewById(R.id.answer);
        }

        private void bind(Support qa) {

            mAnswer.setVisibility(qa.isExpanded() ? View.VISIBLE : View.GONE);

            mQuestion.setText(qa.getQuestion());
            mAnswer.setText(qa.getAnswer());
        }
    }
}