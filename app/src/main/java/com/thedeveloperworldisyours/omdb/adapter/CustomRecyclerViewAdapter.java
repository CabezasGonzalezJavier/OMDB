package com.thedeveloperworldisyours.omdb.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thedeveloperworldisyours.omdb.R;
import com.thedeveloperworldisyours.omdb.model.Movie;

/**
 * Created by javierg on 15/08/16.
 */
public class CustomRecyclerViewAdapter extends RecyclerView
        .Adapter<CustomRecyclerViewAdapter
        .DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private Movie mMovie;
    private static MyClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView label;
        TextView dateTime;

        public DataObjectHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.item_list_view_text_view);
            dateTime = (TextView) itemView.findViewById(R.id.item_list_view_text_view_two);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public CustomRecyclerViewAdapter(Movie movie) {
        mMovie = movie;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

            Log.i(LOG_TAG," --------> "+mMovie.getTitle());
        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.label.setText(mMovie.getTitle());
        holder.dateTime.setText(mMovie.getEpisodes().get(position).getTitle());
    }

//    public void addItem(Movie dataObj, int index) {
//        mMovie.add(dataObj);
//        notifyItemInserted(index);
//    }
//
//    public void deleteItem(int index) {
//        mMovie.remove(index);
//        notifyItemRemoved(index);
//    }

    @Override
    public int getItemCount() {
        return mMovie.getEpisodes().size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}
