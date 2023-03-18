/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Request {

    private int requestID;
    private int houseID;
    private int accountID;
    private boolean state;
    private String houseName;
    private String userName;

    public Request(int requestID, int houseID, int accountID, boolean state, String houseName, String userName) {
        this.requestID = requestID;
        this.houseID = houseID;
        this.accountID = accountID;
        this.state = state;
        this.houseName = houseName;
        this.userName = userName;
    }
    
    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getHouseID() {
        return houseID;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Request{" + "requestID=" + requestID + ", houseID=" + houseID + ", accountID=" + accountID + ", state=" + state + '}';
    }

}
