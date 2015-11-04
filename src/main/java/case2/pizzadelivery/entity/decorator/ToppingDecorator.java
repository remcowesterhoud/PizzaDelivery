package case2.pizzadelivery.entity.decorator;

/**
 * Created by Remco on 4-11-2015.
 */
public abstract class ToppingDecorator extends PizzaComponent{

    protected String toppingName;

    public String getToppingName(){
        return toppingName;
    }
    public abstract String getDescription();
}
