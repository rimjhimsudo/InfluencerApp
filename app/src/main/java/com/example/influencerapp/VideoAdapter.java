package com.example.influencerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideodetailsHolder> {
    private Context context;
        //to inflate view
    private List<videodetails> videodetailsList;
    //storing video details list

    //gettng context and vdeodetalslst
    public  VideoAdapter(Context context, List<videodetails> videodetailsList){
        this.context=context;
        this.videodetailsList=videodetailsList;
    }
    @Override
    public  VideodetailsHolder onCreateViewHolder(ViewGroup parent , int viewType){
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.video_item,null);
        return new VideodetailsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideodetailsHolder holder, int position) {
        videodetails vd=videodetailsList.get(position);
        holder.tvideoname.setText(vd.getVideoname());
        holder.tearning.setText(String.valueOf(vd.getEarning()));
        //holder.tdatetime.setText(String.valueOf(vd.getDate()));
        holder.tpostdate.setText(String.valueOf(vd.getDate()));
        holder.tstatus.setText(vd.getStatus());
        if (vd.getStatus().equals("denied")){
            holder.tstatus.setTextColor(context.getResources().getColor(R.color.red));
        }
    }

    @Override
    public int getItemCount() {
        return videodetailsList.size();
    }

    class VideodetailsHolder extends RecyclerView.ViewHolder{

        TextView tvideoname, tpostdate, tearning, tstatus;
        public  VideodetailsHolder(View itemview){
            super(itemview);
            tvideoname=itemview.findViewById(R.id.videoname);
            tearning=itemview.findViewById(R.id.earning);
            tpostdate=itemview.findViewById(R.id.datetime);
            tstatus=itemview.findViewById(R.id.status);
        }
    }


}
