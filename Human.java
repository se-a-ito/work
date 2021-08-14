/**
 * 課題 301_04 コンストラクタとアクセスメソッド
 * ドッグランにいる人とペットの情報一覧を出力する
 *
 * 人の名前は他のオブジェクトから変更できない
 * ペットは1人あたり1匹のみで変更できない
 * 各フィールドの初期値はインスタンス化するときに設定する
 */
public class Human {
    private String personName;
    private Double weight;

    /**
     * コンストラクタ
     * @param name 人の名前
     * @param weight 人の体重
     */
    public Human(String name, Double weight) {
        this.personName = name;
        this.weight = weight;
    }

    public String getName() {
        return this.personName;
    }

    public Double getWeight() {
        return this.weight;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Human taro = new Human("たろ", 100.3);
        Pet tarotaro = new Pet("たろたろ",10.2);
        Human jiro = new Human("じろ", 100.3);
        Pet jirojiro = new Pet("じろじろ",30.2);
        System.out.printf("飼い主:%s %sKg ペット:%s %sKg",taro.getName(),taro.getWeight(),tarotaro.getName(),tarotaro.getWeight());
        System.out.println();
        System.out.printf("飼い主:%s %sKg ペット:%s %sKg",jiro.getName(),jiro.getWeight(),jirojiro.getName(),jirojiro.getWeight());
//        System.out.println("飼い主:" + taro.getName() + "\t" + taro.getWeight() + "kg" + "\t" + "ペット:" + tarotaro.getName() + "\t" + tarotaro.getWeight() + "kg");
//        System.out.println("飼い主:" + jiro.getName() + "\t" + jiro.getWeight() + "kg" + "\t" + "ペット:" + jirojiro.getName() + "\t" + jirojiro.getWeight() + "kg");
    }
}
