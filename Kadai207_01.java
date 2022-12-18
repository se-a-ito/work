import java.util.Scanner;
public class Kadai207_01 {
    String head;
    String standUp;
    String walk;
    String open;

    /**
     *
     * "【玄関に向かう】" @param head
     * "立ち上がる" @param standUp
     * "廊下を歩く" @param walk
     * "扉を開ける" @param open
     */
    public Kadai207_01(String head, String standUp, String walk, String open) {
        this.head = head;
        this.standUp = standUp;
        this.walk = walk;
        this.open = open;
        System.out.println(this.head + "\n" + this.standUp + "\n" + this.walk + "\n" + this.open);
    }

    private static void walking() {
        System.out.println("【買いに行く】\n道を歩く\nお金を入れる\n飲み物を選択する");
    }

    private static void walking_back() {
        System.out.println("【戻る】\n道を歩く\n扉を開ける\n廊下を歩く");
    }

    private static void riding() {
        System.out.println("【買いに行く】\n自転車に乗る\nコンビニに向く\n自転車を走らせる\nコンビニに入る\n飲み物を選択する\nレジに向かう\nお金を払う");
    }

    private static void riding_back() {
        System.out.println("【戻る】\n自転車に乗る\n自宅に向く\n自転車を走らせる\n扉を開ける\n廊下を歩く");
    }

    private static void drink() {
        System.out.println("【飲む】\n栓を開ける\n飲む");
    }

    /**
     * @param args "実行"
     */
    public static void main(String[] args) {
        System.out.println("なにを飲みますか？1: コーラ 2: ポーション");
        Scanner scanner = new Scanner(System.in);
        int menu  = scanner.nextInt();
        new Kadai207_01("【玄関に向かう】", "立ち上がる", "廊下を歩く", "扉を開ける");
        if (menu == 1) {
            walking();
            walking_back();
        } else {
            riding();
            riding_back();
        }
        drink();
    }
}