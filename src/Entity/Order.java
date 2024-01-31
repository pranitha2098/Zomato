package Entity;

import Enums.OrderStatus;

import java.util.Arrays;

public class Order {
    private int orderID;
    private Food[] orderedFood;
    private OrderStatus orderStatus;
    private double totalCost;
    private int customerID;
    private int restaurantID;

    public Order( Food[] orderedFood, OrderStatus orderStatus, double totalCost, int customerID, int restaurantID) {
        this.orderID = orderID;
        this.orderedFood = orderedFood;
        this.orderStatus = orderStatus;
        this.totalCost = totalCost;
        this.customerID = customerID;
        this.restaurantID = restaurantID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Food[] getOrderedFood() {
        return orderedFood;
    }

    public void setOrderedFood(Food[] orderedFood) {
        this.orderedFood = orderedFood;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderedFood=" + Arrays.toString(orderedFood) +
                ", orderStatus=" + orderStatus +
                ", totalCost=" + totalCost +
                ", customerID=" + customerID +
                ", restaurantID=" + restaurantID +
                '}';
    }
}
