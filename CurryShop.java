import java.util.Scanner;
/**
 * 課題 301_03 クラス変数とインスタンス変数
 * カレー店のチェーンの在庫管理をする。
 *
 * 店クラスを作成し、3つの支店をインスタンスとして作成する。
 * カレーは最初の在庫は10皿
 * カレーの在庫は全支店で共有する。
 * 支店を入力するとカレーを販売し在庫を減らす。
 */
public class CurryShop {
    private String name;
    private static Integer currey_stock = 10;

    /**
     * コンストラクター
     * @param shop_name 支店名
     */
    public CurryShop(String shop_name) {
        this.name = shop_name;
    }

    public void setStock(Integer Stock) {
        currey_stock -= Stock;
    }

//    public void buy_currey() {
//            System.out.println("在庫" + currey_stock);
//            System.out.println("A: 大阪店　B: 名古屋店 C: 北海道店");
//            Scanner store_name = new Scanner(System.in);
//            String order_store_name = store_name.next();

//        }
//        Integer currey_stock = 10;
//        String A = "大阪店";
//        String B = "名古屋店";
//        String C = "北海道店";
//        while(true) {
//            System.out.println("在庫" + currey_stock);
//            System.out.println("A:" + A + "B:" + B + "C:" + C);
//            Scanner store_name = new Scanner(System.in);
//            String name = store_name.next();
//            switch (name) {
//                case "A", "B", "C" -> currey_stock--;
//                default -> System.out.println("そのような支店はございません。");
//            }
//            if (currey_stock == 0) {
//                System.out.println("在庫切れ 閉店です。");
//                break;
//            }
//        }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CurryShop storeA = new CurryShop("大阪店");
        CurryShop storeB = new CurryShop("名古屋店");
        CurryShop storeC = new CurryShop("北海道店");
        while (true) {
            System.out.println("在庫" + currey_stock);
            System.out.printf("A: %s B: %s C: %s",storeA.name,storeB.name,storeC.name);
            Scanner scanner = new Scanner(System.in);
            String store_name = scanner.next();
            System.out.println(store_name);
            switch (store_name) {
                case "A":
                    storeA.setStock(1);
                    break;
                case "B":
                    storeB.setStock(1);
                    break;
                case "C":
                    storeC.setStock(1);
                    break;
                default:
                    System.out.println("そのような支店はございません。");
            }
            if (currey_stock == 0) {
                System.out.println("在庫切れ 閉店です。");
                break;
            }
        }
    }
}
