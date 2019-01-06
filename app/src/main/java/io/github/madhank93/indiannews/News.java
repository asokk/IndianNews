package io.github.madhank93.indiannews;

public class News {

    private String newsImageURL;
    private String newsTitle;
    private String newsSource;
    private String newsDate;

    public News (String newsImageURL, String newsTitle, String newsSource, String newsDate) {
        this.newsImageURL = newsImageURL;
        this.newsTitle = newsTitle;
        this.newsSource = newsSource;
        this.newsDate = newsDate;
    }

    public String getNewsImageURL() {
        return newsImageURL;
    }

    public void setNewsImageURL(String newsImageURL) {
        this.newsImageURL = newsImageURL;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }
}
