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
import model.Blog;

/**
 *
 * @author dell
 */
public class BlogDAO extends DBContext{
     PreparedStatement ps = null;
    ResultSet rs = null;
    String query = "";
    

    public ArrayList<Blog> getAllBlogs() {
        ArrayList<Blog> blogList = new ArrayList<>();
        try {

            query = "select * from Blog";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                blogList.add(new Blog(rs.getInt("BlogID"), rs.getString("Tilte"), rs.getString("Content"), rs.getString("ImageURL"), rs.getString("Date")));
            }
        } catch (SQLException e) {
        }
        return blogList;
    }

    public Blog getBlogByID(int id) {
        query = "SELECT * FROM Blog WHERE BlogID = ?";
        try {
 
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Blog(rs.getInt("BlogID"), rs.getString("Tilte"), rs.getString("Content"), rs.getString("ImageURL"), rs.getString("Date"));
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public void add(String title, String content, String imageURL, String date) {
        query = "INSERT INTO Blog VALUES (?,?,?,?)";
        try { 
            ps = connection.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setString(3, imageURL);
            ps.setString(4, date);
            ps.executeUpdate();
        } catch (SQLException e) {
        }

    }

    public void delete(String id) {
        query = "Delete FROM Blog WHERE BlogID = ?";

        try { 
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
   
    }
    public static void main(String[] args) {
        BlogDAO dao = new BlogDAO();
        List<Blog> list = dao.getAllBlogs();
        for (Blog blog : list) {
             System.out.println(list);
        }
    }
}

