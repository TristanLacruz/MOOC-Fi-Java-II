
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author trist
 */
public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Warehouse() {
        products = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (products.get(product) == null) {
            return -99;
        } else {
            return products.get(product);
        }
    }

    public int stock(String product) {
        if (stocks.get(product) == null) {
            return 0;
        } else {
            return stocks.get(product);
        }
    }

    public boolean take(String product) {
        if (stocks.get(product) == null) {
            return false;
        } else if (stocks.get(product) > 0) {
            int aux = stocks.get(product);
            aux--;
            stocks.put(product, aux);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> keys = products.keySet();
        return keys;
    }
    
    public Map<String, Integer> getMap(){
        return stocks;
    }
}
