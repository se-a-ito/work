public class StreetFoiter extends Game implements Controller {
    private String title = "ストリートフォイター";
    private String character = "春香";

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
        System.out.println(getCharacterName() + "がジャンプする");
    }
    public void btnUnder() {
        System.out.println(getCharacterName() + "がしゃがむ");
    }
    public void btnLeft() {
        System.out.println(getCharacterName() + "が後に進む");
    }
    public void btnRight() {
        System.out.println(getCharacterName() + "が前に進む");
    }


    public StreetFoiter() {
        new Game().gameStart(getTitle());
        btnTop();
        btnUnder();
        btnLeft();
        btnRight();
    }
}
