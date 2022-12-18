import java.io.*;
public class Kadai209_01 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("work/test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while (str !=  null) {
                System.out.println(str);
            }
            System.out.println(str);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
