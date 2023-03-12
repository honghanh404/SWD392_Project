/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Blog {
    private int blogID;
    private String title;
    private String content;
    private String imageURL;
    private String date;
    private boolean state;

    public Blog() {
    }

    public Blog(int blogID, String title, String content, String imageURL, String date, boolean state) {
        this.blogID = blogID;
        this.title = title;
        this.content = content;
        this.imageURL = imageURL;
        this.date = date;
        this.state = state;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Blog{" + "blogID=" + blogID + ", title=" + title + ", content=" + content + ", imageURL=" + imageURL + ", date=" + date + ", state=" + state + '}';
    }

    
 
    
}
