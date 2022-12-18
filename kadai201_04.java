/**
 *
 */

/**
 * @author attun
 *
 */
public class kadai201_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1.1を3回足した結果と1.1を3回かけた結果を出力する。

		double decimal = 1.1;
		double tmp_number = decimal * 10; //先に整数の11にする。

		//3.3
		double add_tmp_number = tmp_number + tmp_number + tmp_number;
		double add_org_nmber = add_tmp_number / 10;
		System.out.println(add_org_nmber);

		//1.331
		double mltpl_tmp_number =  tmp_number * tmp_number * tmp_number;
		double mltpl_org_number =  mltpl_tmp_number / 1000;
		System.out.println(mltpl_org_number);

	}
}
