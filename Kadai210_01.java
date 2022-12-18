import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class Kadai210_01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("./bible.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = "";
            boolean output_enable = false;
            Scanner scanner = new Scanner(System.in);
            List<String> word;
            Map<String, Integer> map = new HashMap<String, Integer>();

            while (str != null) {
                str = br.readLine();
//                str.replaceAll("[^a-zA-Z]", "");
                System.out.println(str);
//                for (String text : word) {
//                    text = text.replaceAll("[^a-zA-Z]", "");
//                    if (!map.containsKey(text)) {
//                        map.put(text, 1);
//                    } else {
//                        map.put(text, map.get(text) + 1);
//                    }
//                }
            }
//            map.remove("");
//            List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
//            list_entries.sort(new Comparator<Entry<String, Integer>>() {
//                public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
//                    //降順
//                    return obj2.getValue().compareTo(obj1.getValue());
//                }
//            });
//            System.out.println("探したい単語を入力:");
//            String scanner_text = scanner.next();
//            if (map.get(scanner_text) != null) {
//                System.out.println(map.get(scanner_text));
//            } else {
//                System.out.println("その単語はありません。");
//            }
//            System.out.println("単語出現ランキングの表示順位を入力:");
//            String ranking_num = scanner.next();
//            int count_num = 0;
//            String hankaku_num = "^[0-9]*$";
//            if (Pattern.matches(hankaku_num, ranking_num)) {
//                for (Entry<String, Integer> entry : list_entries) {
//                    if (Integer.parseInt(ranking_num) > count_num) {
//                        System.out.println(count_num +1 + "位" + "\t" + entry.getKey() + " : " + entry.getValue() + "回");
//                    }
//                    count_num++;
//                }
//            } else {
//                System.out.println("ランキングは半角数字で入力してください。");
//            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}