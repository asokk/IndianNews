package io.github.madhank93.indiannews;

public class News {

    private String newsImageURL;
    private String newsTitle;
    private String newsSource;
    private String newsDate;
    private String newsURL;

    public News (String newsImageURL, String newsTitle, String newsSource, String newsDate, String newsURL) {
        this.newsImageURL = newsImageURL;
        this.newsTitle = newsTitle;
        this.newsSource = newsSource;
        this.newsDate = newsDate;
        this.newsURL = newsURL;
    }

    public String getNewsURL() {
        return newsURL;
    }

    public void setNewsURL(String newsURL) {
        this.newsURL = newsURL;
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
