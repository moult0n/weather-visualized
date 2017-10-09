package weatherapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Xkcd {

    private String month;
    private Long num;
    private String link;
    private String year;
    private String news;
    private String safe_title;
    private String transcript;
    private String alt;
    private String img;
    private String title;
    private String day;

    public Xkcd(){}

    public void setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return this.month;
    }

    public void setNum(Long num){
        this.num = num;
    }

    public Long getNum(){
        return this.num;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return this.link;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return this.year;
    }

    public void setNews(String news){
        this.news = news;
    }

    public String getNews(){
        return this.news;
    }

    public void setSafeTitle(String safe_title){
        this.safe_title = safe_title;
    }

    public String getSafeTitle(){
        return this.safe_title;
    }

    public void setTranscript(String transcript){
        this.transcript = transcript;
    }

    public String getTranscript(){
        return this.transcript;
    }

    public void setAlt(String alt){
        this.alt = alt;
    }

    public String getAlt(){
        return this.alt;
    }

    public void setImg(String img){
        this.img = img;
    }

    public String getImg(){
        return this.img;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getDay(){
        return this.day;
    }

    @Override
    public String toString(){
        return "Xkcd{" +
                "month=" + month +
                ", num=" + num +
                ", link=" + link +
                ", year=" + year +
                ", news=" + news +
                ", safe_title=" + safe_title +
                ", transcript=" + transcript +
                ", alt=" + alt +
                ", img=" + img +
                ", title=" + title +
                ", day=" + day + '\'' +
                '}';
    }
}

