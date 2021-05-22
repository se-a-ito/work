public class Kadai203_02 {

	/**
	 * 203_02 ループと演算
	 * 1から2ずつ飛ばした数値を99まで足した結果を計算式と合わせて出力する。
	 * @param args
	 */

//	whileでの処理
//	public static void main(String[] args) {
//	    int num = 0;
//	    int result = 0;
//	    int sum = 1;
//		while(sum <= 99) {
//		    result = result + sum;
//		    System.out.println(num + "+" + sum + "=" + result);
//		    result = num;
//		    sum += 2;
//		}
//	}

	//	forでの処理
	public static void main(String[] args) {
		int result = 0;
		int num = 0;
		for (int i = 1; i <= 99; i += 2) {
			result = result + i;
			System.out.println(num + "+" + i + "=" + result);
			num = result;
		}
	}

}