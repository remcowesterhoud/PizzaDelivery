package case2.pizzadelivery.entity;

/**
 * Created by Remco on 3-11-2015.
 */
public class CartItem {

    private Object object;
    private int amount;

    public CartItem(Object object, int amount) {
        this.object = object;
        this.amount = amount;
    }

    public void increment(){
        amount++;
    }

    public void decrement(){
        amount--;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
