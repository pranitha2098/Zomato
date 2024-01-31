package Database;

import Entity.Food;
import Enums.FoodType;

public  class FoodDatabase {
    public static Food[] foodArray=new Food[20];
    static{
        Food food1=new Food(1,"Jalebi","Sweet", FoodType.Veg,20.0,0);
        Food food2=new Food(2,"Rasogulla","Sweet", FoodType.Veg,30.0,0);
        Food food3=new Food(3,"Jamun","Sweet", FoodType.Veg,15.0,0);
        Food food4=new Food(4,"Chicken 65","Starters", FoodType.Non_veg,200.0,0);
        foodArray[0]=food1;
        foodArray[1]=food2;
        foodArray[2]=food3;
        foodArray[3]=food4;


    }
}
