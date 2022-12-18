public class kadai204_03 {

	public static void main(String[] args) {
		String str1 = "サクサクのクッキー";
		String str2 = "キクキクのクッサー";
		str1 = str1.replace("キ", "サ");
		str2 = str2.replace("サ", "キ");
		System.out.println(str1 + "\n" + str2);
	}
}
