package Home_work_7;

public class Home_work_7 {
    public static void main(String[] args) {

        Cat[] cats = new Cat[]{
                new Cat (" Барсик"),
                new Cat (" Мурзик"),
                new Cat (" Персик"),
                new Cat (" Борис"),
                new Cat (" Морис"),
        };

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
