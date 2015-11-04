package case2.pizzadelivery.managedBeans;

import case2.pizzadelivery.entity.CartItem;
import case2.pizzadelivery.entity.Pizza;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Remco on 3-11-2015.
 */
@ManagedBean(name = "cart")
@SessionScoped
public class ShoppingCartBean {

    private HashMap<Integer, CartItem> cartItems;
    private int itemAmount;

    public ShoppingCartBean(){
        cartItems = new HashMap<Integer, CartItem>();
    }

    public void add(Pizza pizza){
        if (cartItems.containsKey(pizza.getId())){
            CartItem item = cartItems.get(pizza.getId());
            item.increment();
        }
        else{
            CartItem item = new CartItem(pizza, 1);
            cartItems.put(pizza.getId(), item);
        }
    }

    public void remove(int pizzaID){
        if (cartItems.containsKey(pizzaID)){
            CartItem item = cartItems.get(pizzaID);
            if (item.getAmount() > 1){
                item.decrement();
            }
            else{
                cartItems.remove(pizzaID);
            }
        }
    }

    public void clear(){
        cartItems.clear();
    }

    public String deliver(){
        return "orderComplete";
    }

    public HashMap<Integer, CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<Integer, CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<CartItem> getItems(){
        List<CartItem> items = new ArrayList<CartItem>();
        items.addAll(cartItems.values());
        return items;
    }

    public int getItemAmount() {
        itemAmount = 0;
        for (CartItem item : getItems()){
            itemAmount += item.getAmount();
        }
        return itemAmount;
    }

    public String getTotal(){
        DecimalFormat df = new DecimalFormat("#0.00");
        double price = 0;
        for (CartItem item : getItems()){
            Pizza pizza = (Pizza) item.getObject();
            price += pizza.getPrice() * item.getAmount();
        }
        return df.format(price);
    }
}
