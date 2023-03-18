/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Blog;
import model.House;
import model.Request;
import model.Role;

/**
 *
 * @author Admin
 */
public class RequestDAO extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;
    String query = "";

    public ArrayList<Request> getAllRequests() {
        ArrayList<Request> requestList = new ArrayList<>();
        try {
            query = "SELECT * FROM Request r\n"
                    + "JOIN House h\n"
                    + "ON r.houseID = h.houseID\n"
                    + "JOIN Account a\n"
                    + "ON a.accountID = r.accountID ";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                requestList.add(new Request(rs.getInt("RequestID"), rs.getInt("HouseID"), rs.getInt("AccountID"), rs.getBoolean("State"), rs.getString("HouseName"), rs.getString("Username")));
            }
        } catch (SQLException e) {
        }
        return requestList;
    }

    public ArrayList<House> getAllHouse() {
        ArrayList<House> houseList = new ArrayList<>();
        try {
            query = "SELECT * FROM House";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                House h = new House();
                h.setHouseID(rs.getInt("HouseID"));
                h.setDescription(rs.getString("Description"));
                h.setHouseName(rs.getString("HouseName"));
                h.setImageURL(rs.getString("ImageURL"));
                h.setPrice(rs.getInt("Price"));
                h.setSize(rs.getInt("Size"));
                h.setState(rs.getBoolean("State"));
                houseList.add(h);
            }
        } catch (SQLException e) {
        }
        return houseList;
    }

    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> accountList = new ArrayList<>();
        try {
            query = "SELECT * FROM Account";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role();
                role.setRoleID(rs.getInt("RoleID"));
                accountList.add(new Account(rs.getInt("AccountID"), rs.getString("Username"), rs.getString("Password"), rs.getString("FirstName"), rs.getString("LastName"), rs.getBoolean("Gender"), rs.getString("Phone"), rs.getString("Email"), rs.getString("Address"), role));
            }
        } catch (SQLException e) {
        }
        return accountList;
    }

    public void addRequest(int houseID, int accountID) {
        try {
            query = "insert into Request(HouseID, AccountID, state) values (?, ?, 1)";
            ps = connection.prepareStatement(query);
            ps.setInt(1, houseID);
            ps.setInt(2, accountID);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RequestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteRequest(String id) {
        query = "Delete FROM Request WHERE RequestID = ?";

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }

    }
}
