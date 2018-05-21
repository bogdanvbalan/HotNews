package com.example.android.hotnews;

/**
 * A News object that contains the information for a single article.
 */

public class News {

    /** The section name for the article*/
    private String sectionName;

    /** The date when the article was published*/
    private String date;

    /** The title of the article */
    private String title;

    /** The link used to open the article in browser*/
    private String webUrl;

    /**
     * The constructor used to initialize an object of type News.
     * @param sectionName is the section to which the article was published
     * @param date is the date when the article was published
     * @param title is the summary of the article
     * @param webUrl is the URL used to access the article on browser
     */
    public News(String sectionName, String date, String title,String webUrl){
        this.sectionName = sectionName;
        this.date = date;
        this.title = title;
        this.webUrl = webUrl;
    }


    /**
     * Below are the getter methods for each data member of the object.
     */

    public String getSectionName(){return sectionName;}
    public String getDate(){return date;}
    public String getTitle(){return title;}
    public String getWebUrl(){return webUrl;}

}
