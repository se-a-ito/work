//牛クラスを作成し、3頭の牛をインスタンスとして作成する。
//
//        牛クラスの属性は以下とする。
//
//        名前(文字列)
//        年齢(整数)
//        性別(真偽値)
//        体重(実数)
//        牛クラスの振る舞いは以下とする。
//
//        話す(名前、年齢、性別、体重を出力する)
public class Kadai301_02 {
    String name;
    Integer age;
    Boolean gender;
    Double weight;

    public void mow(String name, Integer age, Boolean gender, Double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        String sex;
        if (this.gender) {
            sex = "オス";
        } else {
            sex = "メス";
        }
        System.out.println(this.name + "\t" + this.age + "歳" + "\t" + sex + "\t" + this.weight  + "kg");
    }

    public static void main(String[] args) {
        Kadai301_02  kadai =  new Kadai301_02();
        kadai.mow("はなこ",3,false,100.4);
        kadai.mow("たろう",4,true,200.5);
        kadai.mow("むげん",9,true,300.6);
    }
}
