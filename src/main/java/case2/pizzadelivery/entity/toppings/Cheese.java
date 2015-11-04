package case2.pizzadelivery.entity.toppings;

import case2.pizzadelivery.entity.decorator.PizzaComponent;
import case2.pizzadelivery.entity.decorator.ToppingDecorator;

/**
 * Created by Remco on 4-11-2015.
 */
public class Cheese extends ToppingDecorator{

    PizzaComponent pizzaComponent;

    public Cheese (PizzaComponent pizzaComponent){
        this.pizzaComponent = pizzaComponent;
        this.toppingName = "Cheese";
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return .50;
    }
}
