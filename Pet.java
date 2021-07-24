public class Pet {
    private final String pet_name;
    private Double pet_weight;

    /**
     *　ペットクラス
     * @param pet_name "ペットの名前"
     * @param pet_weight "ペットの体重"
     */
    public Pet(String pet_name,Double pet_weight) {
        this.pet_name = pet_name;
        this.pet_weight = pet_weight;
    }

    public String getName() {
        return this.pet_name;
    }

    public Double getWeight() {
        return this.pet_weight;
    }
}