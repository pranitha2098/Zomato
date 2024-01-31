package Entity;

import Enums.FoodType;

public class Food {
    private int foodID;

    private String foodName;
    private String foodCategory;
    private FoodType foodType;
    private double price;
    private double foodRating;


    public Food() {
        System.out.println("I am food");
    }

    public Food(int foodID, String foodName, String foodCategory, FoodType foodType, double price, double foodRating) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodType = foodType;
        this.price = price;
        this.foodRating = foodRating;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(double foodRating) {
        this.foodRating = foodRating;
    }
    @Override
    public String toString() {
        return "Food{" +
                "foodID=" + foodID +
                ", foodName='" + foodName + '\'' +
                ", foodCategory='" + foodCategory + '\'' +
                ", foodType=" + foodType +
                ", price=" + price +
                ", foodRating=" + foodRating +
                '}';
    }
}
