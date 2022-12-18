public class Kadai204_05 {
    public static  void  main(String[] args) {
        int i = 1;
        while(i < 100) {
            String str = String.valueOf(i);
            StringBuffer strb = new StringBuffer(str);
            String reverse_str = strb.reverse().toString();
            if(i % 10 == 0) {
                System.out.println(i + "->" + strb.replace(0,1,""));
            }else if(i < Integer.parseInt(reverse_str)) {
                System.out.println(i + "->" + reverse_str +  "ピコン!");
            }else {
                System.out.println(i + "->" + reverse_str);
            }
            i++;
        }
    }
}
