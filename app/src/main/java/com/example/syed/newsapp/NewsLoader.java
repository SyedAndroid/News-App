package com.example.syed.newsapp;

import android.content.Context;
import android.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.example.syed.newsapp.QueryUtils.makeHttpRequest;

/**
 * Created by syed on 02/06/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<NewsItem>> {

    String StringURL = "https://content.guardianapis.com/search?q=trump&api-key=test";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    @Override
    public List<NewsItem> loadInBackground() {
        URL url = QueryUtils.createUrl(StringURL);
        String JSONResponse = "";
        try {
            JSONResponse = makeHttpRequest(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return QueryUtils.extractFeatureFromJson(JSONResponse);
    }
}
