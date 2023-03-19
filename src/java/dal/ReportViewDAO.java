/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ReportView;
import model.RequestView;

/**
 *
 * @author tcc
 */
public class ReportViewDAO extends DBContext{
    private PreparedStatement ps;
    private ResultSet rs;
    
    public List<ReportView> getAllReport(){
        List<ReportView> list = new ArrayList<>();
        String query = "select rt.Id, rt.Description DescriptionReport, r.Decription DescriptionRequest, a.FirstName+ a.LastName as accountName "
                + "from Report rt, Request r, Account a where rt.AccountID = a.AccountID and rt.RequestID = r.RequestID";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ReportView(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }

        } catch (Exception e) {
        }

        return list;
        
    }
    public static void main(String[] args) {
        ReportViewDAO dao = new ReportViewDAO();
        List<ReportView> list = dao.getAllReport();
        for (ReportView o : list) {
            System.out.println(o);
        }
        
    }
}
