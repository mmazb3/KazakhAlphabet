package me.abetayev.kazakhalphabet;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolders> {

    private ArrayList<Letters> mLetterList;

    public static class ViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView mLetter;

        public ViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.mLetter = itemView.findViewById(R.id.imageView);
        }

        @Override
        public void onClick(View v) {

        }
    }


    public RecyclerViewAdapter(ArrayList<Letters> letterList) {
        mLetterList = letterList;
    }


    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item2,
                parent, false);
        ViewHolders rcv = new ViewHolders(view);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, int position) {
        holder.mLetter.setImageResource(mLetterList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.mLetterList.size();
    }
}

