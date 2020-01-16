package com.example.piu.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.piu.R;
import com.example.piu.model.SavedRule;

import java.util.List;

public class SavedRuleAapter extends RecyclerView.Adapter<SavedRuleAapter.RecViewHolder> {
    private List<SavedRule> list;

    public SavedRuleAapter(List<SavedRule> list) {
        this.list = list;
    }

    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.saved_rule, parent, false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecViewHolder holder, final int position) {
        final SavedRule savedRule = list.get(position);
        holder.bind(savedRule);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class RecViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView img;

        RecViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.saved_rule_name);
            img = itemView.findViewById(R.id.delete_rule);
        }

        private void bind(SavedRule savedRule) {

            name.setText(savedRule.getName());
            img.setImageAlpha(savedRule.getRemoveImg());
        }
    }
}
