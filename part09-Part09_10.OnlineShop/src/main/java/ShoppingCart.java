
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author trist
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if(cart.containsKey(product)){
            Item item = cart.get(product);
            item.increaseQuantity();
        }else{
            Item item = new Item(product, 1, price);
            cart.put(product, item);            
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print(){
        for (Item item : cart.values()) {
            System.out.println(item.toString());
        }
    }
}
