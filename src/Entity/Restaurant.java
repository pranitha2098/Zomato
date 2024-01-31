package Entity;

import java.util.Arrays;

public class Restaurant {
    private int restaurantID;
    private String restaurantName;
    private String restaurantAddress;
    private long[] restaurantContact;
    private double rating;
    private Food[] food;
    private Order[] orderDetails;

    public Restaurant(int restaurantID, String restaurantName, String restaurantAddress, long[] restaurantContact, double rating, Food[] food, Order[] orderDetails) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantContact = restaurantContact;
        this.rating = rating;
        this.food = food;
        this.orderDetails = orderDetails;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public long[] getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(long[] restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Food[] getFood() {
        return food;
    }

    public void setFood(Food[] food) {


        this.food = food;
    }

    public Order[] getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Order[] orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantID=" + restaurantID +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantContact=" + Arrays.toString(restaurantContact) +
                ", rating=" + rating +
                ", food=" + Arrays.toString(food) +
                ", orderDetails=" + Arrays.toString(orderDetails) +
                '}';
    }
}
