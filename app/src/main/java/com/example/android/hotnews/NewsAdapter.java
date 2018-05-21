package com.example.android.hotnews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * The NewsAdapter object is used to create a list item layout for each article in the date
 * source.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * The constructor for NewsAdapter
     * @param context of the app
     * @param news is a list of articles
     */
    public NewsAdapter(Context context, List<News> news){
        super(context,0,news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //We check if there is an existing list item that we can use
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item,parent,false);
        }

        // Find the article at the given position in the list of articles
        News currentArticle = getItem(position);

        //Find the TextView with the id of section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        //Set the section for the current article
        sectionView.setText(currentArticle.getSectionName());

        //Find the TextView with the id of summary
        TextView summaryView = (TextView) listItemView.findViewById(R.id.summary);
        //Set the summary text for the current article
        summaryView.setText(currentArticle.getTitle());

        //Find the TextView with teh id of date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Set the date of the current article
        dateView.setText(currentArticle.getDate());

        return listItemView;

    }
}
