package case2.pizzadelivery.entity.toppings;

import case2.pizzadelivery.entity.decorator.PizzaComponent;
import case2.pizzadelivery.entity.decorator.ToppingDecorator;

/**
 * Created by Remco on 4-11-2015.
 */
public class Bacon extends ToppingDecorator {

    PizzaComponent pizzaComponent;

    public Bacon(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        this.toppingName = "Bacon";
    }

    @Override
    public String getDescription() {
        return pizzaComponent.getDescription() + ", Bacon";
    }

    @Override
    public double cost() {
        return .91;
    }
}
