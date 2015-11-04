package case2.pizzadelivery.managedBeans;

import case2.pizzadelivery.ejb.PizzaRequestBean;
import case2.pizzadelivery.entity.Pizza;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by Remco on 3-11-2015.
 */
@ManagedBean(name = "inventory")
@ApplicationScoped
public class InventoryBean {
    @EJB
    PizzaRequestBean pizzaRequestBean;

    public InventoryBean(){

    }

    public List<Pizza> getPizzaList() {
        return pizzaRequestBean.getPizzaList();
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        pizzaRequestBean.setPizzaList(pizzaList);
    }
}
