package Kadai251_01;
import Kadai251_01.Item;
import Kadai251_01.Main;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private Integer level;
    private List<Item> items = new ArrayList<Item>();

    /**
     * コンストラクター
     * @param name プレイヤー名
     * @param level レベル
     * @param items アイテムリスト
     */
    public Player(String name, Integer level, List<Item> items) {
        this.name = name;
        this.level = level;
        this.items = items;
    }


    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public List<Item> getItems() {
        return items;
    }

    /**
     * コンソール表示メソッド
     */
    public void showStatus() {
        System.out.println("Player Name: " + this.getName());
        System.out.println("Level: " + this.getLevel());
        for (int i = 0; i < this.getItems().size(); i++) {
            System.out.println("item[" + (i+1) + "]:" + this.getItems().get(i).getName() + " × " + this.getItems().get(i).getCount());
        }
    }
}