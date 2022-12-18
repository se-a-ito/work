/**
 * 304_01 オーバーライド
 * 魚の動きをそれぞれの魚に合わせて表現する。
 *
 * 親クラスの魚を継承すること。
 * オーバーライドを利用し魚クラスのメソッドを上書きすること。
 * 子クラスの魚の種類は自由とするが3匹以上つくること。
 * 魚の名前はあとから変更できない。
 */
public class Fish {
    static final String name = "魚";

    public void swim() {
        System.out.println(name  + "は泳ぐ。");
    }

    public static void main(String[] args) {
        Fish[] fish = {new Fish(),new Maguro(),new Shark(),new Tobiuo()};
        for (Fish fishes: fish) {
            fishes.swim();
        }
//        Fish fish = new Fish();
//        Maguro maguro = new Maguro();
//        Shark same = new Shark();
//        Tobiuo tobiuo = new Tobiuo();
//        fish.swim();
//        maguro.swim();
//        same.swim();
//        tobiuo.swim();
    }
}
