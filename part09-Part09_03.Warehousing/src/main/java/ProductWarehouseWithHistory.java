
/**
 *
 * @author trist
 */

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        setInitialBalance(initialBalance);
    }

    private void setInitialBalance(double initialBalance) {
        changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amountTaken;
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
