/**
 * 304_01 オーバーライド
 */
public class Shark extends Fish{
    static final String name = "サメ";

    public void swim() {
        System.out.println(name + "は獲物を探しながら泳ぐ。");
    }

}
