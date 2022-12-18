package Kadai251_02;

public class Donkey {
    public Bag bag = new Bag();
    private int age;

    public Donkey() {
        this.age = 0;
    }
    public Donkey(int age) {
        this.age = age;
    }
    public void putInTheBag(Item item) {
        this.bag.addItem(item);
    }

    public Item getInTheBag(int index) {
        return this.bag.getItem(index);
    }

    public void checkInTheBag() {
        System.out.println("持ち物");
        for (int i = 0; i < this.bag.getItems().size(); i++) {
            System.out.println(this.bag.getItem(i).getName() + ": " + this.bag.getItem(i).getCount() + "個");
        }
    }
}
