/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tcc
 */
public class RequestViews {

    private int requestID;
    private int houseID;
    private int accountID;
    private boolean state;
    private String decription;

    public RequestViews() {
    }
    
    

    public RequestViews(int requestID, int houseID, int accountID, boolean state, String decription) {
        this.requestID = requestID;
        this.houseID = houseID;
        this.accountID = accountID;
        this.state = state;
        this.decription = decription;
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

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return "Request{" + "requestID=" + requestID + ", houseID=" + houseID + ", accountID=" + accountID + ", state=" + state + ", decription=" + decription + '}';
    }

    
}
