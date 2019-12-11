package com.example.poststatistics.screens.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.poststatistics.R;
import com.example.poststatistics.models.comment.CommentDatum;

import java.util.ArrayList;
import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{

    private Context mContext;
    private List<CommentDatum> mCommentList = new ArrayList<>();
    private CommentCountInterface countInterface;

    public CommentAdapter(Context mContext, CommentCountInterface countInterface) {
        this.mContext = mContext;
        this.countInterface = countInterface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.like_user_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mCommentList.get(position).getCommentAvatarImage().getUrlMedium())
                .into(holder.userImg);

        holder.userName.setText(mCommentList.get(position).getNickname());
        countInterface.setCommentCount(mCommentList.size());
    }

    @Override
    public int getItemCount() {
        return mCommentList.size();
    }

    public void setCommentItems(List<CommentDatum> mCommentList){
        this.mCommentList.clear();
        this.mCommentList.addAll(mCommentList);
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView userImg;
        TextView userName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            userImg = itemView.findViewById(R.id.userImg);
            userName = itemView.findViewById(R.id.userName);
        }
    }

    public interface CommentCountInterface{
        void setCommentCount(int commentUsersCount);
    }
}