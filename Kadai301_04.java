//課題 301_04 コンストラクタとアクセスメソッド
//ドッグランにいる人とペットの情報一覧を出力するs。
//
//        人の名前は他のオブジェクトから変更できない
//        ペットは1人あたり1匹のみで変更できない
//        各フィールドの初期値はインスタンス化するときに設定する
/**
 *　人クラス
 *"人の名前" @param person_name
 *"人の体重" @param weight
 */
public class Kadai301_04 {
    private String person_name;
    private Double weight;

    public Kadai301_04(String name, Double weight) {
        this.person_name = name;
        this.weight = weight;
    }

    public String get_name() {
        return this.person_name;
    }

    public Double get_weight() {
        return this.weight;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Kadai301_04 taro = new Kadai301_04("たろ", 100.3);
        Pet tarotaro = new Pet("たろたろ",10.2);
        Kadai301_04 jiro = new Kadai301_04("じろ", 100.3);
        Pet jirojiro = new Pet("じろじろ",30.2);
        System.out.println("飼い主:" + taro.get_name() + "\t" + taro.get_weight() + "kg" + "\t" + "ペット:" + tarotaro.get_name() + "\t" + tarotaro.get_weight() + "kg");
        System.out.println("飼い主:" + jiro.get_name() + "\t" + jiro.get_weight() + "kg" + "\t" + "ペット:" + jirojiro.get_name() + "\t" + jirojiro.get_weight() + "kg");
    }
}
/**
 *　ペットクラス
 *"ペットの名前" @param pet_name
 *"ペットの体重" @param pet_weight
 */
class Pet {
    private final String pet_name;
    private Double pet_weight;

    public Pet(String pet_name,Double pet_weight) {
        this.pet_name = pet_name;
        this.pet_weight = pet_weight;
    }

    public String get_name() {
        return this.pet_name;
    }

    public Double get_weight() {
        return this.pet_weight;
    }
}
