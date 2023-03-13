/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Role;

/**
 *
 * @author ASUS
 */
public class AccountDAO extends DBContext{
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Account login(String username, String password) {
        String sql = "select * from Account a\n" +
                    "join Role r on a.RoleID = r.RoleID\n" +
                    "where a.Username = ? and a.Password = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setAccountID(rs.getInt(1));
                account.setUsername(username);
                account.setPassword(password);
                account.setFirstName(rs.getString(4));
                account.setLastName(rs.getString(5));
                account.setGender(rs.getBoolean(6));
                account.setPhone(rs.getString(7));
                account.setEmail(rs.getString(8));
                account.setAddress(rs.getString(9));
                Role r = new Role();
                r.setRoleID(rs.getInt(10));
                r.setRoleName(rs.getString(12));
                account.setRole(r);
                return account;
            }

        } catch (SQLException e) {
        }
        return null;
    }
    
    public Account checkUserExist(String username) {
        String sql = "select * from Account where Username = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setAccountID(rs.getInt(1));
                account.setUsername(username);
                account.setPassword(rs.getString(3));
                account.setFirstName(rs.getString(4));
                account.setLastName(rs.getString(5));
                account.setGender(rs.getBoolean(6));
                account.setPhone(rs.getString(7));
                account.setEmail(rs.getString(8));
                account.setAddress(rs.getString(9));
                Role r = new Role();
                r.setRoleID(rs.getInt(10));
                account.setRole(r);
                return account;
            }else{
                return null;
            }
        } catch (SQLException ex) {

        }
        return null;
    }
    
    public void register(Account a){
        String sql = "insert into Account values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, a.getUsername());
            ps.setString(2, a.getPassword());
            ps.setString(3, a.getFirstName());
            ps.setString(4, a.getLastName());
            ps.setBoolean(5, a.isGender());
            ps.setString(6, a.getPhone());
            ps.setString(7, a.getEmail());
            ps.setString(8, a.getAddress());
            ps.setInt(9, a.getRole().getRoleID());
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public static void main(String[] args) {
        AccountDAO a = new AccountDAO();
        Account ac = new Account();
        ac.setFirstName("thganh");
        ac.setLastName("thganh");
        ac.setGender(true);
        ac.setUsername("thganh");
        ac.setPassword("thganh");
        ac.setPhone("123123");
        ac.setAddress("12341234");
        ac.setEmail("123123");
        ac.setRole(new Role(1, "Admin"));
        a.register(ac);
//        System.out.println(ac);
    }
    
}
