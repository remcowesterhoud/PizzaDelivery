package case2.pizzadelivery.entity.toppings;

import case2.pizzadelivery.entity.decorator.PizzaComponent;
import case2.pizzadelivery.entity.decorator.ToppingDecorator;

/**
 * Created by Remco on 4-11-2015.
 */
public class Anchovy extends ToppingDecorator{

    PizzaComponent pizzaComponent;

    public Anchovy(PizzaComponent pizzaComponent){
        this.pizzaComponent = pizzaComponent;
        this.toppingName = "Anchovy";
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + ", Anchovy";
    }

    @Override
    public double cost() {
        return .75;
    }
}
