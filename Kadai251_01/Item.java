package Kadai251_01;

import java.util.ArrayList;
import java.util.List;

public class Item {
    static final Integer MIN = 0;
    static final Integer MAX = 9999;
    private String name;
    private Integer count;

    /**
     * コンストラクター
     * @param name アイテム名
     * @param count アイテム数
     */
    public Item(String name, Integer count) {
        if (count < MIN) throw new
                IllegalArgumentException("不正：" + MIN + "未満");
        if (count > MAX) throw new
                IllegalArgumentException("不正：" + MAX + "オーバー");
        this.count = count;

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }
}
