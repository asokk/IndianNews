package io.github.madhank93.indiannews;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {

    /** Tag for the log messages */
    private static final String LOG_TAG = NewsAdapter.class.getSimpleName();


    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given
     * position in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the (news image) ImageView with view ID news_image_view and set the image
        ImageView newsImage = listItemView.findViewById(R.id.news_image_view);
        Picasso.get().load(currentNews.getNewsImageURL()).into(newsImage);

        // Find the (news title) TextView with view ID new_title and set the value
        TextView newsTitle = listItemView.findViewById(R.id.news_title);
        newsTitle.setText(currentNews.getNewsTitle());

        // Find the (news source) TextView with view ID new_title and set the value
        TextView newsSource = listItemView.findViewById(R.id.news_source);
        newsSource.setText(currentNews.getNewsSource());


        String formattedDate = formatDateAndTime(currentNews.getNewsDate());

        // Find the (news date) TextView with view ID new_title and set the value
        TextView newsDate = listItemView.findViewById(R.id.news_date);
        newsDate.setText(formattedDate);

        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "27-09-2018 10:15") from a date string.
     */
    private String formatDateAndTime(String timestamp) {

        SimpleDateFormat actualDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat expectedDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        Date dateValue = null;
        try
        {
            dateValue = actualDateFormat.parse(timestamp);
        }
        catch (ParseException e)
        {
            Log.e(LOG_TAG, "Problem in formatting the date pattern", e);
        }
        String formatted = expectedDateFormat.format(dateValue);

        return formatted;
    }

}
