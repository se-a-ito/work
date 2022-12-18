public class Kadai205_01 {
    public static void main(String[] args) {
        int[] scores = {
            89,
            30,
            10,
            67,
            43,
            98,
            100,
            78
        };
        int sum = 0;
//        for(int i = 0; i < scores.length; i++){
//            sum += scores[i];
//        }
        for (int score: scores) {
            sum += score;
        }
        float average = (float)sum / scores.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
