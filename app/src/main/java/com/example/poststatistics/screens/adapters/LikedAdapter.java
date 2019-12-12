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
import com.example.poststatistics.models.liked.liked_response.LikedDatum;

import java.util.ArrayList;
import java.util.List;

public class LikedAdapter extends RecyclerView.Adapter<LikedAdapter.ViewHolder> {

    private List<LikedDatum> mLikedPost = new ArrayList<>();
    private Context mContext;
    private LikedCountInterface countInterface;
    private int countItem = 0;

    public LikedAdapter( Context context, LikedCountInterface countInterface) {
        this.mContext = context;
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
                .load(mLikedPost.get(position).getLikedAvatarImage().getUrlMedium())
                .into(holder.userImg);

        holder.userName.setText(mLikedPost.get(position).getNickname());

        countInterface.setLikedCount(mLikedPost.size());

        if (countItem < mLikedPost.size()){
            countInterface.setRemainingCount(mLikedPost.size() - countItem);
            countItem++;
        }

        if(countItem == mLikedPost.size()){
            countInterface.setRemainingCount(0);
        }
    }

    public void setItems(List<LikedDatum> mLikedPost){
        this.mLikedPost.clear();
        this.mLikedPost.addAll(mLikedPost);
    }

    @Override
    public int getItemCount() {
        return mLikedPost.size();
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

    public interface LikedCountInterface{
        void setRemainingCount(int remainingLikedCount);
        void setLikedCount(int likedUsersCount);
    }
}
