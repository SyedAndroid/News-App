package com.example.syed.newsapp;

import android.content.Intent;
import android.content.Loader;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.app.LoaderManager;
import java.util.List;


public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<NewsItem>>, RVAdapter.ClickCallback {

    private List<NewsItem> news;
    private RecyclerView reView;
    private RVAdapter newsAdapter;
    private List listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);
        reView = (RecyclerView) findViewById(R.id.rview);
        LinearLayoutManager linLayMan = new LinearLayoutManager(this);
        reView.setLayoutManager(linLayMan);
        reView.setHasFixedSize(true);
        LoaderManager loaderManager = getLoaderManager();
        loaderManager.initLoader(1, null, this);
    }


    @Override
    public Loader<List<NewsItem>> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<NewsItem>> loader, List<NewsItem> data) {
        newsAdapter = new RVAdapter(data, this);
        reView.setAdapter(newsAdapter);
        listData = data;
        newsAdapter.setClickCallback(this);
    }

    @Override
    public void onLoaderReset(Loader<List<NewsItem>> loader) {
    }

    @Override
    public void itemClick(int p) {
        NewsItem item = (NewsItem) listData.get(p);
        Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getURL()));
        startActivity(url);
    }
}
