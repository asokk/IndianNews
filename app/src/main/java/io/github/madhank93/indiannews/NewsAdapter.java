package io.github.madhank93.indiannews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

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

        // Find the (news date) TextView with view ID new_title and set the value
        TextView newsDate = listItemView.findViewById(R.id.news_date);
        newsDate.setText(currentNews.getNewsDate());

        return listItemView;
    }

}
