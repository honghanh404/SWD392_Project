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
public class ReportView {
    private int id;
    private String descriptionReport;
    private String descriptionRequest;
    private String accountName;

    public ReportView() {
    }

    public ReportView(int id, String descriptionReport, String descriptionRequest, String accountName) {
        this.id = id;
        this.descriptionReport = descriptionReport;
        this.descriptionRequest = descriptionRequest;
        this.accountName = accountName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptionReport() {
        return descriptionReport;
    }

    public void setDescriptionReport(String descriptionReport) {
        this.descriptionReport = descriptionReport;
    }

    public String getDescriptionRequest() {
        return descriptionRequest;
    }

    public void setDescriptionRequest(String descriptionRequest) {
        this.descriptionRequest = descriptionRequest;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "ReportView{" + "id=" + id + ", descriptionReport=" + descriptionReport + ", descriptionRequest=" + descriptionRequest + ", accountName=" + accountName + '}';
    }

    
}
