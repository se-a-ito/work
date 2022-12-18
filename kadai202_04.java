import java.util.Scanner;

class kadai202_04{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("あなたの名前を入力してください。");
    String name = scanner.next();

    System.out.println(name + "さん、こんにちは。");
	System.out.println("あなたは何歳ですか？");
	String old = scanner.next();

	System.out.println(old + "歳なんですね。よろしくお願いします。");
	scanner.close();
  }
}