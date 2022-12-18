import java.util.LinkedHashMap;
import java.util.Map;
public class Kadai206_02 {
    public static void main(String[] args) {
        Map<String, Integer> target = new LinkedHashMap<String, Integer>();
        String text = "たったひとつのしんじつみぬく、みためはこども、ずのうはおとな";
        String[] count_texts = text.split("");
        for (String count_text:count_texts) {
            if (!target.containsKey(count_text)) {
                target.put(count_text,1);
            }else {
                target.put(count_text,target.get(count_text) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : target.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue() + "個");
        }
    }
}
