package com.wangjie.testrecycle;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/2.
 */
public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.MasonryView>{

    private ArrayList<String> url;

    public RecyleAdapter(ArrayList<String> url) {
        this.url = url;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.i("=====wj", "onCreateViewHolder");
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle, viewGroup, false);
        return new MasonryView(view);
    }

    @Override
    public void onBindViewHolder(MasonryView masonryView, int position) {

//        ViewGroup.LayoutParams params =  holder.itemView.getLayoutParams();//得到item的LayoutParams布局参数
//        params.height = heights.get(position);//把随机的高度赋予itemView布局
//        holder.itemView.setLayoutParams(params);//把params设置给itemView布局
        String s = url.get(position);
        Log.d("wj","===s==="+s);

        ImageOptions options2 = new ImageOptions.Builder()
                .setLoadingDrawableId(R.mipmap.ic_launcher)
                .setFailureDrawableId(R.drawable.imageh)
                .setUseMemCache(true)
                .build();
        x.image().bind(masonryView.imageView, s,options2);

        Log.i("=====wj", "onBindViewHolder");
    }

    @Override
    public int getItemCount() {
        return url.size();
    }

    public static class MasonryView extends  RecyclerView.ViewHolder{

        ImageView imageView;

        public MasonryView(View itemView){
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.image );
        }

    }
}
