package rocks.zipcode.assessment2.collections;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import sun.reflect.generics.tree.Tree;

import java.util.*;


/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    private Map< String, String > inventory = new TreeMap<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
       List<String> newList = new ArrayList<>(strings);

}

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        List<String> items = new ArrayList<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        ArrayList<String> items = new ArrayList<>();
        items.add(item);



    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.remove(item);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inventory.size();
    }
}
