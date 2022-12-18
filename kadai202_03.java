public class kadai202_03 {
	public static void main(String[] args) {
		char_count();
	}

	private static void char_count() {
		String[] Strings = {
			"1234567890",
			"１２３４５６７８９０",
			"飛べない豚は、ただの豚だ。"
		};
		for (String line: Strings){
  		System.out.println(line + "は" +line.length() + "文字だ。");
}
	}

}
