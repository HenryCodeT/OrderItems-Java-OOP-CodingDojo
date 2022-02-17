import java.util.ArrayList;
/**
 * Order
 */
public class Order {
    public String name;
    public double total;
    public boolean isReady;
    public ArrayList<Item> items = new ArrayList<Item>();
}