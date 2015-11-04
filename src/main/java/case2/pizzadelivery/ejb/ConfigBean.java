package case2.pizzadelivery.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Created by Remco on 3-11-2015.
 */
@Singleton
@Startup
public class ConfigBean {
    @EJB
    private PizzaRequestBean request;

    @PostConstruct
    public void createData(){
        request.createPizza(1, "Salami", "Pizza met salami", 100, 5.00);
        request.createPizza(2, "Ansjovis", "Pizza met ansjovis", 120, 6.00);
        request.createPizza(3, "Hawaii", "Pizza Hawaii", 150, 7.00);
    }
}
