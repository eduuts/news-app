package edu.newsappnew;

/**
 * Created by edu on 7/24/2017.
 */

public class Story {

    String title;

    String url;
    String section;

    public Story(String title, String url,String section) {
        this.title = title;
        this.url = url;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }
    @Override
    public String toString() {
        return "News{" + "title='" + title + '\'' + ", url='" + url + '\'' +", section='" + section + '\'' + '}';
    }
}