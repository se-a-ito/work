package Kadai251_02;
import Kadai251_02.Item;
import Kadai251_02.Bag;
public class Main {
    public static void main(String[] args) {
        Donkey roba = new Donkey();
        Player player1 = new Player();
        player1.bag = roba.bag;
        Item ringo = new Item("リンゴ", 3);
        Item pan = new Item("パン", 5);
        System.out.println("持ち物");
        player1.putInTheBag(ringo);
        player1.putInTheBag(pan);
        player1.eatInTheBag(0);
        roba.checkInTheBag();
    }
}
