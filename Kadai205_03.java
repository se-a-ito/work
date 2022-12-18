public class Kadai205_03 {
    public static void main(String[] args) {
        int white_piece = 0;
        int black_piece = 0;
        int [][] board = {
            {1, 1, 1, 1, 1},
            {0, 0, 2, 1, 0},
            {0, 2, 1, 2, 2},
            {0, 2, 0, 2, 0},
            {0, 0, 0, 0, 2}
        };

        System.out.println("-----------");
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 1) {
                    white_piece += 1;
                    System.out.print("●|");
                } else if (board[i][j] == 2) {
                    black_piece += 1;
                    System.out.print("⭘|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
            System.out.println("-----------");
        }
        System.out.println("●:" + white_piece + "個");
        System.out.println("⭘:" + black_piece + "個");
        if (white_piece < black_piece) {
            System.out.println("黒の勝ち。");
        }else if(white_piece > black_piece) {
            System.out.println("白の勝ち。");
        }else {
            System.out.println("引き分け。");
        }
    }
}
