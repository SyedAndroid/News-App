package com.example.syed.newsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.List;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by syed on 06/06/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NewsViewHolder> {

    List<NewsItem> news;
    private LayoutInflater inflater;

    private ClickCallback clickCallback;

    public interface ClickCallback {
        void itemClick(int p);
    }

    public void setClickCallback(final ClickCallback clickCallback) {
        this.clickCallback = clickCallback;
    }


    public RVAdapter(List<NewsItem> news, Context c) {
        inflater = LayoutInflater.from(c);
        this.news = news;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        NewsViewHolder nvh = new NewsViewHolder(view);
        return nvh;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.title.setText(news.get(position).getTitle());
        holder.section.setText(news.get(position).getSection());
        holder.date.setText(news.get(position).getDate());
    }


    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.cv)
        CardView cv;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.section)
        TextView section;
        @BindView(R.id.date)
        TextView date;
        private View container;

        NewsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            container = itemView.findViewById(R.id.LL);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.LL) {
                clickCallback.itemClick(getAdapterPosition());
            }
        }
    }
}
