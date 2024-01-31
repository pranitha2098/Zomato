package Database;

import Entity.Food;
import Entity.Order;
import Entity.Restaurant;

public class RestaurantDatabase {
    public static Restaurant[] restaurantArray=new Restaurant[20];

    static{
        Restaurant restaurant1=new Restaurant(1,"Udupi","Paringipalya",new long[]{1234L,567854L},0,new Food[10], new Order[10]);
        Restaurant restaurant2=new Restaurant(2,"PizzaHut","Doddathoguru",new long[]{1234L},0,null, new Order[10]);
        restaurantArray[0]=restaurant1;
        restaurantArray[1]=restaurant2;

    }
}
