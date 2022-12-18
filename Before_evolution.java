public class Before_evolution {
    protected String p_name;
    protected Integer HP;
    protected Integer attack_p;
    protected Integer defense_p;
    protected Integer agility;

    public Before_evolution(String p_name, Integer HP, Integer attack_p, Integer defense_p, Integer agility) {
        this.p_name = p_name;
        this.HP = HP;
        this.attack_p = attack_p;
        this.defense_p = defense_p;
        this.agility = agility;
    }


    public void denkousekka() {
        System.out.println("さとし" + this.p_name + "が電光石火をした。(ダメージ:" + this.attack_p + ")");
    }

    public void hundred_thousand_bolt() {
        System.out.println("さとし" + this.p_name + "が10万ボルトをした。(ダメージ:" + Math.round(this.attack_p * 1.5) + ")");
    }

    public void iron_tail() {
        System.out.println("さとし" + this.p_name + "がアイアンテールをした。(ダメージ:" + Math.round(this.attack_p * 1.2) + ")");
    }


    public static void main(String[] args) {
        Before_evolution picochu = new Before_evolution("ピコチュウ",320,100,75,125);
        picochu.denkousekka();
        picochu.hundred_thousand_bolt();
        picochu.iron_tail();
        After_evolution raochu = new After_evolution("ラオチュウ",320,100,75,125);
        raochu.denkousekka();
        raochu.hundred_thousand_bolt();
        raochu.iron_tail();
        raochu.skull_bash();
        raochu.kamiari_punch();
        raochu.kaminari();
    }
}

class After_evolution extends Before_evolution
{
    public After_evolution(String p_name, Integer HP, Integer attack_p, Integer defense_p, Integer agility) {
        super(p_name, HP * 2, attack_p * 2, defense_p * 2, agility * 2);
    }

    public void skull_bash() {
        int technique_p = 100;
        System.out.println("さとし" + this.p_name + "がロケット頭突きをした。(ダメージ:" + (this.attack_p + technique_p) + ")");
    }

    public void kamiari_punch() {
        int technique_p = 75;
        System.out.println("さとし" + this.p_name + "がかみなりパンチをした。(ダメージ:" + (this.attack_p +technique_p) * 2 + ")");
    }

    public void kaminari() {
        int technique_p = 120;
        System.out.println("さとし" + this.p_name + "がかみなりをした。(ダメージ:" + (this.attack_p +technique_p) * 2 +  ")");
    }
}
