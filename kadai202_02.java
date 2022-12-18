import java.text.NumberFormat;

public class kadai202_02 {
	public static void main(String[] args) {
		buy();
	}

	private static void buy() {
		int banana_val = 25;
		int peach_val = 25;
		int banana_price = 100;
		int peach_price = 300;
		int total = banana_val * banana_price + peach_val * peach_price;
		NumberFormat nfNum = NumberFormat.getNumberInstance();

		System.out.println(banana_price + "円のバナナを" + banana_val + "個、" + peach_price + "円の桃を" + peach_val + "個買ったら、合計" + nfNum.format(total) + "円になりました。");
	}

}
