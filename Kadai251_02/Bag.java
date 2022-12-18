package Kadai251_02;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItems() {
        return this.itemList;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }
    public Item getItem(int index) {
        return this.itemList.get(index);
    }
}
