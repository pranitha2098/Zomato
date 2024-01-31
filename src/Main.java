import Database.CustomerDatabase;
import Database.FoodDatabase;
import Database.RestaurantDatabase;
import Entity.Customer;
import Entity.Food;
import Enums.FoodType;
import Implementation.CustomerImpl;
import Implementation.RestaurantImpl;

public class Main {
    public static void main(String[] args) {

        Food food1=new Food(5,"samosa","snake", FoodType.Veg,20.0,0);
        Food food2=new Food(6,"katchori","snake", FoodType.Veg,30.0,0);
        Food[] f  = new Food[]{food1, FoodDatabase.foodArray[1],food2};

        RestaurantImpl restaurant= new RestaurantImpl();
        restaurant.addFood(2,f);
        restaurant.removeFood(2,6 );


        System.out.println(RestaurantDatabase.restaurantArray);





    }
}