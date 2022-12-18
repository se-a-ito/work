package Kadai251_02;
import Kadai251_02.Item;
import Kadai251_02.Bag;
public class Player {
    public Bag bag;

    public void putInTheBag(Item item) {
        this.bag.addItem(item);
        System.out.println(item.getName() + ":" + item.getCount() + "個");
    }

    public Item getInTheBag(int index) {
        return this.bag.getItem(index);
    }

    public void eatInTheBag(int index) {
        int selectItemCount = this.bag.getItem(index).getCount();
        this.bag.getItem(index).setCount(1);
        int residueItemCount = this.bag.getItem(index).getCount();
        int ateItemCount = selectItemCount - residueItemCount;
        System.out.println("playerは" + this.bag.getItem(index).getName() + "を" + ateItemCount + "個食べた。");
    }
}
