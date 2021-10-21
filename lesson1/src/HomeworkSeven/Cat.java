package HomeworkSeven;

public class Cat {
    private int appetite;
    private String name;
    private boolean full;

    public Cat(int appetite, String name) {
        this.appetite = appetite;
        this.name = name;
        this.full = (appetite == 0);
    }

    public void feedingTime(Plate plate){
        System.out.println(name + " подошёл к тарелке");
        if (appetite != 0 && plate.getFood() - appetite >= 0) {
            System.out.println(name + " жрёт");
            plate.setFood(plate.getFood() - appetite);
            appetite = 0;
            System.out.println("Еды осталось: " + plate.getFood());
            setFull(appetite == 0);
        } else if (appetite == 0){
            System.out.println(name + " сыт, не корми его, хватит");
            plate.info();
        } else if (plate.getFood() - appetite < 0){
            System.out.println("Может не дразнить " + name + " и дать ему нормальное кол-во еды?");
            plate.info();
        }
        checkFull();
    }

    public void checkFull() {
        if (isFull()) System.out.println(name + " сыт");
        else System.out.println(name + " готов поесть еще");
    }


//    --------Set- и Get-методы -----------------------------

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
}
