package case2.pizzadelivery.entity.decorator;

/**
 * Created by Remco on 4-11-2015.
 */
public abstract class PizzaComponent {

    protected String description = "Unknown Pizza";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
