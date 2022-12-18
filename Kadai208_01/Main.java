package Kadai208_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Number num = new Number();
            Scanner scanner = new Scanner(System.in);
            System.out.println("好きな数字を半角で入力してください。");
            num.setNum1(scanner.next());
            System.out.println("最初は" + num.getNum1() + "ね");
            num.setNum2(scanner.next());
            System.out.println("次は" + num.getNum2() + "ね");
            System.out.println("足したら、" + num.addNum(num.getNum1(),num.getNum2()) + "になるよ");
        } catch (NotHankakuException e) {
            System.out.println("それは数字じゃないでしょ。");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("それは数字じゃないでしょ。");
            e.printStackTrace();
        } catch (NotNumberException e) {
            System.out.println("それは数字じゃないでしょ。");
            e.printStackTrace();
        }
    }
}
