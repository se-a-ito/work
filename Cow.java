/**
 *課題 301_02 インスタンスとインスタンス変数
 *牛クラスを作成し、3頭の牛をインスタンスとして作成する。
 *
 *牛クラスの属性は以下とする。
 *
 * 名前(文字列)
 * 年齢(整数)
 * 性別(真偽値)
 * 体重(実数)
 * 牛クラスの振る舞いは以下とする。
 *
 * 話す(名前、年齢、性別、体重を出力する)
 * "牛の名前" @param name
 * "歳" @param age
 * "性別" @param gender
 * "体重" @param weight
 */
public class Cow {
    String name;
    Integer age;
    Boolean gender;
    Double weight;

    public Cow(String name, Integer age, Boolean gender, Double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void mow() {
        String sex;
        if (this.gender) {
            sex = "オス";
        } else {
            sex = "メス";
        }
        System.out.println(this.name + "\t" + this.age + "歳" + "\t" + sex + "\t" + this.weight  + "kg");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Cow  hanako =  new Cow("はなこ",3,false,100.4);
        hanako.mow();
        Cow  tarou = new Cow("たろう",4,true,200.5);
        tarou.mow();
        Cow  mugen = new Cow("むげん",9,true,300.6);
        mugen.mow();
    }
}
