public class kadai202_05 {

	public static void main(String[] args) {
		String str = "1234567890\n1234567890";
		System.out.println(str);
		String str_ =  str.replaceAll("\n", "");
		int str_count = str_.length();
		System.out.println(str_count);
	}

}
