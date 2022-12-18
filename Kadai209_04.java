//import java.io.File;
//import java.io.IOException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//public class Kadai209_04 {
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        try {
//            File file = new File("work/data.json");
//            ObjectMapper mapper = new ObjectMapper();
//            JsonNode root = mapper.readTree(file);
//            for (JsonNode program_list: root.get("program_list")) {
//                String language = program_list.get("language").asText();
//                String type = program_list.get("type").asText();
//                String use = program_list.get("use").asText();
//                System.out.println(language + "\t" + type  + "\t" + use);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
