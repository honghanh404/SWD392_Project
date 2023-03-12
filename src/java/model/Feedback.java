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
public class Feedback {
    private int feedbackID;
    private Account account;
    private House house;
    private String content;
    private String date;
    private boolean state;

    public Feedback() {
    }

    public Feedback(int feedbackID, Account account, House house, String content, String date, boolean state) {
        this.feedbackID = feedbackID;
        this.account = account;
        this.house = house;
        this.content = content;
        this.date = date;
        this.state = state;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Feedback{" + "feedbackID=" + feedbackID + ", account=" + account + ", house=" + house + ", content=" + content + ", date=" + date + ", state=" + state + '}';
    }
    
    
}
