package Home_work_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    //Проверка на отрицательное кол-во еды
    public boolean decreaseFood(int amount) {
        if(food >= amount){
            food -= amount;
            return true;
        } else {
            return false;
        }
    }
    //Добавляем еду в тарелку
    public boolean aFood(int amount) {
        if (amount < 0){
            food += amount;
            return true;
        }else {
            return false;
        }
    }

    public int getFood() {
        return food;
    }
}
