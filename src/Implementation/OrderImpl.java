package Implementation;

import Database.FoodDatabase;
import Database.OrderDatabase;
import Entity.Food;
import Entity.Order;
import Enums.OrderStatus;

public class OrderImpl {


    private double calculatePrice(Food[] food){
        double total_price=0.0;
        for(int i=0;i<food.length;i++){
            total_price+=food[i].getPrice();
        }
        return total_price;
    }

    public void updateOrderStatus(Order order, OrderStatus status){
        order.setOrderStatus(status);
    }
    private Order findOrderByID(int orderID) {
        for (int i = 0; i < OrderDatabase.orderArray.length; i++) {
            if (OrderDatabase.orderArray[i].getOrderID() == orderID)
                return OrderDatabase.orderArray[i];
        };
        return null;
    }

}
