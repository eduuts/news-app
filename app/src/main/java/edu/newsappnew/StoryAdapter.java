package edu.newsappnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by edu on 7/24/2017.
 */

public class StoryAdapter extends ArrayAdapter<Story> {

    public StoryAdapter(Context context) {
        super(context, -1, new ArrayList<Story>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.article);
        TextView section = (TextView) convertView.findViewById(R.id.section);

        Story currentStory = getItem(position);
        title.setText(currentStory.getTitle());

        section.setText(currentStory.getSection());
        return convertView;
    }
}