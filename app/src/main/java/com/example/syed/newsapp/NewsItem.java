package com.example.syed.newsapp;

/**
 * Created by syed on 02/06/2017.
 */

public class NewsItem {

    private String title;
    private String section;
    private String date;
    private String URL;

    public NewsItem(String title, String section, String date, String URL) {
        this.title = title;
        this.section = section;
        this.date = date;
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {  return section;    }

    public String getDate() {
        return date;
    }

}
