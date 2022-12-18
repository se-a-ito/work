public class Kadai207_02 {
    String name;
    String power;
    String mp;
    String charm;

    /**
     *
     *"キャラクター名" @param name
     *"力" @param power
     *"魔力" @param mp
     *"魅力" @param charm
     */
    public Kadai207_02(String name, String power, String mp, String charm) {
        this.name = name;
        this.power = power;
        this.mp = mp;
        this.charm = charm;
    }

    /**
     *
     *"キャラクター名" @param name
     *"力" @param power
     *"魔力" @param mp
     *"魅力" @param charm
     */
    public void status(String name,String power, String mp, String charm) {
        double status =  ((Double.parseDouble(power) * 1.5 + Double.parseDouble(mp) * 1.7) * (Double.parseDouble(charm) / 10));
        System.out.println(name + ": " + status);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Kadai207_02 yoshihiko =  new Kadai207_02("ヨシヒコ","70","30","50");
        Kadai207_02 danjo = new Kadai207_02("ダンジョ","90","0","45");
        Kadai207_02 murasaki = new Kadai207_02("ムラサキ","10","80","90");
        Kadai207_02 merebu = new Kadai207_02("メレブ","20","50","5");
        yoshihiko.status(yoshihiko.name,yoshihiko.power,yoshihiko.mp,yoshihiko.charm);
        danjo.status(danjo.name,danjo.power,danjo.mp,danjo.charm);
        murasaki.status(murasaki.name,murasaki.power,murasaki.mp,murasaki.charm);
        merebu.status(merebu.name,merebu.power,merebu.mp,merebu.charm);
    }
}
