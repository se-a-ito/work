import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * 206_01 辞書・マップ
 * キーは先頭の文字、値はことわざを入れる。
 * キーボード入力で入力された先頭の文字をもとにことわざを取り出し出力する。
 * 3回入力できるようにする。
 * かるたとして存在しない文字を入力された場合は"そんなのないよ！"と出力しプログラムを終了する。
 * 「かるた」の内容はwikipedia - かるたを参照
 */
public class Kadai206_01 {
    public static void main(String[] args) {
        Map<String, String> karuta = new HashMap<String, String>();
        String iroha_uta = "いろはにほへとちりぬるをわかよたれそつねならむうゐのおくやまけふこえてあさきゆめみしゑひもせす京";
        String[] sayings = {
            "犬も歩けば棒に当たる",
            "論より証拠",
            "花より団子",
            "憎まれっ子世にはばかる",
            "骨折り損のくたびれ儲け",
            "屁をひって尻すぼめる",
            "年寄りの冷や水",
            "ちりも積もれば山となる",
            "律義者の子沢山",
            "盗人の昼寝",
            "瑠璃も玻璃も照らせば光る",
            "老いては子に従え",
            "破れ鍋に綴じ蓋",
            "かったいの瘡(かさ)うらみ",
            "葦（よし）のずいから天井のぞく",
            "旅は道連れ世は情け",
            "れうやく（良薬）は口に苦し",
            "総領の甚六",
            "月とすっぽん",
            "念には念を入れよ",
            "泣きっ面に蜂",
            "楽あれば苦あり",
            "無理が通れば道理引っ込む",
            "嘘から出た真",
            "芋の煮えたもご存じない",
            "喉元過ぎれば熱さを忘れる",
            "鬼に金棒",
            "臭いものに蓋をする",
            "安物買いの銭失い",
            "負けるが勝ち",
            "芸は身を助く",
            "文はやりたし書く手は持たぬ",
            "子は三界の首枷",
            "えてに帆を上ぐ",
            "亭主の好きな赤烏帽子",
            "頭隠して尻隠さず",
            "三遍回って煙草にしょ",
            "聞いて極楽見て地獄",
            "油断大敵",
            "目の上のこぶ",
            "身から出た錆",
            "知らぬが仏",
            "縁は異なもの味なもの",
            "貧乏暇なし",
            "門前の小僧習わぬ経を読む",
            "急いては事を仕損じる",
            "粋は身を食う",
            "京の夢大阪の夢",
        };
        String[] initials = iroha_uta.split("");
        int i = 0;
        for (String say : sayings) {
            karuta.put(initials[i], say);
            if (i < initials.length - 1) {
                i++;
            }
        }
        Scanner scanner = new Scanner(System.in);
        for (int repeat = 1; repeat <= 3; repeat++) {
            String initial = scanner.next();
            System.out.println(karuta.getOrDefault(initial, "そんなのないよ！"));
        }
    }
}