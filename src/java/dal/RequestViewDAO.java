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
import model.House;
import model.RequestViews;
import model.RequestView;

/**
 *
 * @author tcc
 */
public class RequestViewDAO extends DBContext {

    private PreparedStatement ps;
    private ResultSet rs;

    public List<RequestView> getAllRequest() {
        List<RequestView> list = new ArrayList<>();
        String query = "select s.Decription, "
                + "a.FirstName+ a.LastName as AccountName, h.HouseName from Request s, House h, "
                + "Account a where s.HouseID = h.HouseID and s.AccountID = a.AccountID";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new RequestView(rs.getString(1), rs.getString(2), rs.getString(3)));
            }

        } catch (Exception e) {
        }

        return list;
    }

    public static void main(String[] args) {
        RequestViewDAO dao = new RequestViewDAO();
        List<RequestView> list = dao.getAllRequest();
        for (RequestView o : list) {
            System.out.println(o);
        }
    }
}
