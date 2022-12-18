package Kadai251_01;
import Kadai251_01.Player;
import Kadai251_01.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     *
     * @return itemList アイテムリスト
     */
    public static List<Item> itemList() {
        List<Item> itemList = new ArrayList<Item>();
//        Item item1 = new Item("貝殻", 21);
//        Item item2 = new Item("布団代わりのワカメ", 3);
//        Item item3 = new Item("サングラス", 1);
//        Item item4 = new Item("浮き輪", 1);
        itemList.add(new Item("貝殻", 21));
        itemList.add(new Item("布団代わりのワカメ", 3));
        itemList.add(new Item("サングラス", 1));
        itemList.add(new Item("浮き輪", 1));
        return itemList;
    }

    public static void main(String[] args) {
        Player Calypso = new Player("カリュプソー", 99, itemList());
        Calypso.showStatus();
//        System.out.println("Player Name: " + Calypso.getName());
//        System.out.println("Level: " + Calypso.getLevel());
//        for (int i = 0; i < Calypso.getItems().size(); i++) {
//            System.out.println("item[" + (i+1) + "]:" + Calypso.getItems().get(i).getName() + " × " + Calypso.getItems().get(i).getCount());
//        }
    }
}
