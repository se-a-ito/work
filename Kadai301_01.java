import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
//import java.util.regex.Pattern;
/**
 * 課題 301_01 クラス変数とクラスメソッド
 * キーボードから入力した数値をどんどん足算して出力する。
 * 合計の初期値は0とする。
 * 数字以外が入力された場合は「終わります。」と出力してプログラムを終了する。
 **/
public class Kadai301_01 {
    static int num = 0;

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int addNum =  scanner.nextInt();
                num += addNum;
                System.out.println(num);
            } catch (InputMismatchException e){
                System.out.println("終わります。");
                break;
            }
        }
        scanner.close();
    }
//
//    public static void sum() {
//        Scanner scanner = new Scanner(System.in);
//        String hankakuNumPattern = "^[0-9]*$";
//        while (true) {
//            String addNumStr = scanner.next();
//            if (Pattern.matches(hankakuNumPattern, addNumStr)) {
//                num += Integer.parseInt(addNumStr);
//                System.out.println(num);
//            } else {
//                System.out.println("終わります。");
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        Kadai301_01.sum();
    }
}
