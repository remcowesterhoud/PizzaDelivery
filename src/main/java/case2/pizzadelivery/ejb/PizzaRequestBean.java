package case2.pizzadelivery.ejb;

import case2.pizzadelivery.entity.Pizza;

import javax.ejb.Singleton;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Remco on 3-11-2015.
 */
@Singleton
public class PizzaRequestBean {
    private List<Pizza> pizzaList;

    public PizzaRequestBean(){
        pizzaList = new LinkedList<Pizza>();
    }

    public void createPizza(int id, String name, String description, int calories, double price){
        Pizza pizza = new Pizza(id, name, description, calories, price);
        pizzaList.add(pizza);
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }
}
