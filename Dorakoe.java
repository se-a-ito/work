public class Dorakoe extends Game {
    private String title = "ドラコエ";
    private String character = "勇者";

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharacterName() {
        return this.character;
    }

    public void setCharacterName(String characterName) {
        this.character = characterName;
    }

    public void btnTop() {
        System.out.println(getCharacterName() + "が上に進む");
    }
    public void btnUnder() {
        System.out.println(getCharacterName() + "が下に進む");
    }
    public void btnLeft() {
        System.out.println(getCharacterName() + "が左に進む");
    }
    public void btnRight() {
        System.out.println(getCharacterName() + "が右に進む");
    }


    public Dorakoe() {
        new Game().gameStart(getTitle());
        btnTop();
        btnUnder();
        btnLeft();
        btnRight();
    }
}