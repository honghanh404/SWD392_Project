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
public class RequestView {
    private String decription;
    private String accountName;
    private String houseName;

    public RequestView(String decription, String accountName, String houseName) {
        this.decription = decription;
        this.accountName = accountName;
        this.houseName = houseName;
    }

    public RequestView() {
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Override
    public String toString() {
        return "RequestView{" + "decription=" + decription + ", accountName=" + accountName + ", houseName=" + houseName + '}';
    }
    
    
}
