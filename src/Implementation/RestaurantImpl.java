package Implementation;

import Database.RestaurantDatabase;
import Entity.Food;
import Entity.Restaurant;

import java.util.Arrays;

public class RestaurantImpl {

    public void addFood(int restaurantID, Food[] food){
        int position=findRestaurantByID(restaurantID);
       int foodPosition = calculateFoodPosition(position);
       for (int i=0;i<food.length;i++)
           RestaurantDatabase.restaurantArray[position].getFood()[foodPosition++] = food[i];

    }
    private int calculateFoodPosition(int postion){
        if(RestaurantDatabase.restaurantArray[postion].getFood() == null)
            RestaurantDatabase.restaurantArray[postion].setFood(new Food[3]) ;

        Food[] food = RestaurantDatabase.restaurantArray[postion].getFood();
        for (int i=0;i<food.length;i++)
            if(food[i]==null)
                return i;

        return -1;
    }
    public void removeFood(int restaurantID, int foodID){
        int position=findRestaurantByID(restaurantID);
        int foodPosition=findFoodByID(foodID,position);
        if(foodPosition==-1){
            System.out.println("food doest exists");
            return;
        }
        Food[] food =RestaurantDatabase.restaurantArray[position].getFood();
        if(foodPosition==food.length-1){
            food[foodPosition]=null;
            return;
        }
        for(int i=foodPosition;i<food.length;i++){
            if(food[i]==null)
                break;
            food[i]=food[i+1];
        }

    }

    private int findFoodByID(int foodID, int position){
        for(int i=0;i<RestaurantDatabase.restaurantArray[position].getFood().length;i++){
            if(RestaurantDatabase.restaurantArray[position].getFood()[i]==null) {
                System.out.println("There is no food ID");
                break;
            }
            if(RestaurantDatabase.restaurantArray[position].getFood()[i].getFoodID()==foodID)
                return i;
        }
        return -1;
    }

    private int findRestaurantByID(int restaurantID){
        for(int i=0;i< RestaurantDatabase.restaurantArray.length;i++) {
            if (RestaurantDatabase.restaurantArray[i].getRestaurantID() == restaurantID)
                return i;
        }
        return -1;
    }
    public void listOfFood(int restaurantID){
        int position=findRestaurantByID(restaurantID);
        Food[] food= RestaurantDatabase.restaurantArray[position].getFood();
        System.out.println("The list of food from restaurant "+restaurantID+" is :");
        for(int i=0;i<food.length;i++){
            if(food[i]==null) {
                break;
            }
           System.out.println(food[i].getFoodName());
        }
    }

    public void listOfRestaurants(){
        System.out.println("List of Restaurants: ");
        for(int i=0;i<RestaurantDatabase.restaurantArray.length;i++){
            if(RestaurantDatabase.restaurantArray[i]==null)
                break;
            System.out.println(RestaurantDatabase.restaurantArray[i].getRestaurantName()+" "+RestaurantDatabase.restaurantArray[i].getRestaurantAddress()+" "+Arrays.toString(RestaurantDatabase.restaurantArray[i].getRestaurantContact())+" "+RestaurantDatabase.restaurantArray[i].getRating());
        }
    }
}