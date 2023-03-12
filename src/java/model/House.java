/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class House {
    private int houseID;
    private String houseName;
    private String imageURL;
    private String description;
    private int size;
    private double price;
    private boolean state;

    public House() {
    }

    public House(int houseID, String houseName, String imageURL, String description, int size, double price, boolean state) {
        this.houseID = houseID;
        this.houseName = houseName;
        this.imageURL = imageURL;
        this.description = description;
        this.size = size;
        this.price = price;
        this.state = state;
    }

    public int getHouseID() {
        return houseID;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "House{" + "houseID=" + houseID + ", houseName=" + houseName + ", imageURL=" + imageURL + ", description=" + description + ", size=" + size + ", price=" + price + ", state=" + state + '}';
    }
    
    
    
}
