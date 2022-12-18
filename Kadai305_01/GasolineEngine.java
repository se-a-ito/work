package Kadai305_01;

public class GasolineEngine implements RollingPower {
    private Integer fule;

    public Integer getFule() {
        return this.fule;
    }

    public void Refueling(Integer fule) {
        this.fule = fule;
    }

    public Integer rolling() {
       return getFule() * 100;
    }
}
