package HomeworkSeven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Еды в миске осталось: " + getFood());
    }

    public void putFood(int addFood){
        this.food = food + addFood;
    }

//    --------Set- и Get-методы -----------------------------
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
