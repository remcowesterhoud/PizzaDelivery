package case2.pizzadelivery.managedBeans;

import case2.pizzadelivery.entity.BasePizza;
import case2.pizzadelivery.entity.decorator.PizzaComponent;
import case2.pizzadelivery.entity.toppings.Anchovy;
import case2.pizzadelivery.entity.toppings.Bacon;
import case2.pizzadelivery.entity.toppings.Cheese;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by Remco on 4-11-2015.
 */
@ManagedBean(name = "createPizza")
@SessionScoped
public class CreatePizzaBean {

    private PizzaComponent pizza;

    public CreatePizzaBean() {
        pizza = new BasePizza();
    }

    public String createNewPizza(){
        pizza = new BasePizza();
        return "createPizzaView";
    }

    public void addAnchovy(){
        pizza = new Anchovy(pizza);
    }

    public void addBacon(){
        pizza = new Bacon(pizza);
    }

    public void addCheese(){
        pizza = new Cheese(pizza);
    }
}
