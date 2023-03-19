/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.House;
import model.Role;

/**
 *
 * @author tcc
 */
public class HouseViewDAO extends DBContext{
//    Connection conn = null;
//    PreparedStatement ps = null;
//    ResultSet rs = null;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public List<House> getAllHouse(){
        List<House> list = new ArrayList<>();
        String query = "select * from House";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new House(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getBoolean(7)));
            }
            
        } catch (Exception e) {
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        HouseViewDAO dao = new HouseViewDAO();
        List<House> list = dao.getAllHouse();
        for (House o : list) {
            System.out.println(o);
        }
    }
}
