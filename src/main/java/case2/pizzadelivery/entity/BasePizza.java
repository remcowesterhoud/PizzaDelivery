package case2.pizzadelivery.entity;

import case2.pizzadelivery.entity.decorator.PizzaComponent;

/**
 * Created by Remco on 4-11-2015.
 */
public class BasePizza extends PizzaComponent {

    public BasePizza(){
        description = "Base pizza";
    }

    @Override
    public double cost() {
        return .89;
    }
}
