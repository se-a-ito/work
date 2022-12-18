import java.util.Scanner;
/**
 * 課題 204_04 正規表現
 */
public class Kadai204_04 {
    public static void main(String[] args) {
        System.out.println("キーボードから入力してください");
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.next();
        if (inputValue.matches("\\d+")) {
            //すべて半角数字
            System.out.println("The character strings are all half-width numbers.");
        }else if(inputValue.matches("\\w+")) {
            //すべて半角英数字
            System.out.println("The character strings are all alphanumeric characters.");
        }else if(inputValue.matches("^(?!\\..*$)[a-zA-Z_ .']*$")) {
            //半角英文(一部の記号含む)
            System.out.println("The character string is half-width English.");
        }else if(inputValue.matches("0\\d{1,4}-\\d{1,4}-\\d{4}")) {
            //電話番号
            System.out.println("The string is a phone number.");
        }else {
            //上記以外
            System.out.println("The string is neither.");
        }
    }
}
