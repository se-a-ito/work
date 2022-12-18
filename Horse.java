public class Horse {
    private String name;
    protected Double weight;
    protected Double horse_speed;
    Person person;
    Jockey jockey;

    public Horse(String name, Double weight, Double speed) {
        this.name = name;
        this.weight = weight;
        this.horse_speed = speed;
        System.out.println(this.name + "(体重: " + this.weight + "kg, 速度: " + this.weight + "km/h)");
    }

    protected void run() {
        System.out.println(this.name + "走る。(速度: " + this.horse_speed + "km/h)");
    }
    protected void run_with_person(Person... persons) {
        double sum = 0;
        double decelerate = 0;
        if (persons.length >= 1) {
            for (Person person_data:persons) {
                sum += person_data.person_weight;
            }
            decelerate =  (sum / 10);
            this.horse_speed = this.horse_speed - decelerate;
        }
        try {
            if (sum > 200.0) {
                throw new Exception();
            }
            System.out.println(this.name + "走る。乗馬者" + persons.length + "名(速度: " + this.horse_speed + "km/h)");
        } catch (Exception e) {
            System.out.println("人の総体重が200Kgを超えているため、馬が走れません。");
        }
    }

    protected void run_with_jockey(Jockey... jockeys) {
        double sum = 0;
        double decelerate = 0;
        if (jockeys.length >= 1) {
            for (Jockey jockey_data:jockeys) {
                sum += jockey_data.jockey_weight;
            }
            decelerate =  (sum / 20);
            this.horse_speed = this.horse_speed - decelerate;
        }
        System.out.println(this.name + "走る。乗馬者" + jockeys.length + "名(速度: " + this.horse_speed + "km/h)");
    }

    public static void main(String[] args) {
        Horse uma = new Horse("ディープインパクト",200.5, 50.0);
        Person take = new Person("たけゆたか",50.2);
        Person tanaka = new Person("たなか",70.2);
        Person sato = new Person("さとう",60.6);
        Jockey ito = new Jockey("いとう",65.0);

        uma.run();
        uma.run_with_person(sato,tanaka,take);
        uma.run_with_jockey(ito);
    }
}

class Person {
    protected String  person_name;
    protected Double person_weight;

    public Person(String name, Double weight) {
        this.person_name = name;
        this.person_weight = weight;
        System.out.println(this.person_name + "(体重: " + this.person_weight + "kg)");
    }
}

class Jockey {
    protected String  jockey_name;
    protected Double jockey_weight;

    public Jockey(String name, Double weight) {
        this.jockey_name = name;
        this.jockey_weight = weight;
        System.out.println(this.jockey_name + "(体重: " + this.jockey_weight + "kg)");
    }
}
