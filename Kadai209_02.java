import java.io.*;
import java.util.Scanner;

public class Kadai209_02 {
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("work/input.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            Scanner scanner = new Scanner(System.in);

            while(true) {
                String text = scanner.next();
                if (text.equals("exit")) {
                    break;
                }
                bw.write(text);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
