import java.util.Scanner;
//課題 301_03 クラス変数とインスタンス変数
//        カレー店のチェーンの在庫管理をする。
//
//        店クラスを作成し、3つの支店をインスタンスとして作成する。
//
//        カレーは最初の在庫は10皿
//        カレーの在庫は全支店で共有する。
//        支店を入力するとカレーを販売し在庫を減らす。
public class kadai301_03 {
    Integer currey_stock = 10;
    String A = "大阪店";
    String B = "名古屋店";
    String C = "北海道店";
    public void buy_currey() {
        while(true) {
            System.out.println("在庫" + currey_stock);
            System.out.println("A:" + A + "B:" + B + "C:" + C);
            Scanner store_name = new Scanner(System.in);
            String name = store_name.next();
            switch (name) {
                case "A", "B", "C" -> currey_stock--;
                default -> System.out.println("そのような支店はございません。");
            }
            if (currey_stock == 0) {
                System.out.println("在庫切れ 閉店です。");
                break;
            }
        }
    }
    public static void main(String[] args) {
        kadai301_03 store = new kadai301_03();
        store.buy_currey();
    }
}
