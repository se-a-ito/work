import java.io.*;
import java.util.Arrays;

public class Kadai209_03 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("./testcsv.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int line_number = 0;
            String[] column = new String[0];
            String[] data = new String[0];
            while ((line = br.readLine()) != null) {
                if (line_number == 0) {
                    column  = line.split(",", 0);
                    line_number++;
                    for (String column_name: column ) {
                        System.out.print(column_name.replace("\"", "") + "\t");
                    }
                    System.out.println();
                    System.out.println("---------------------------");
                }else {
                    data = line.split(",", 0);
                    for (String data_column: data ) {
                        System.out.print(data_column.replace("\"", "") + "\t");
                    }
                    System.out.println();
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}