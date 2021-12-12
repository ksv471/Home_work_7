package Home_work_7;

public class Cat {
    private String name;
    private boolean sytost; //поле сытость
    private final int Default_APPETITE = 30;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(Default_APPETITE)){
            System.out.println("Кот"+ name+ " кушает ...");
            sytost = true;
        } else {
            System.out.println("Кот"+ name+ "  не кушает ...");
        }
    }

    public String getName() {

        return name;
    }

    public boolean isSytost() {
        return sytost;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sytost=" + sytost +
                '}';
    }
}
