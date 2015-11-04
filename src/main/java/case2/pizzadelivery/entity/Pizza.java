package case2.pizzadelivery.entity;

/**
 * Created by Remco on 3-11-2015.
 */
public class Pizza {
    private int id;
    private String name, description;
    private int calories;
    private double price;

    public Pizza(){

    }

    public Pizza(int id, String name, String description, int calories, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
