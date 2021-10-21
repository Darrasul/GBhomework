package HomeworkSix;


public class Cat extends Animal{


    public Cat(int run, int jump, int swim){
        super(run, jump, swim);
    }

    public void runningQustion(){
        if (checkRun()) System.out.println("Кошка пробежала " + getRun() + " метров");
        else System.out.println("Кошка пробежала " + getRun() + " метров, после чего выдохлась");
    }

    public void jumpingQustion(){
        if (checkJump()) System.out.println("Кошка прыгнула на " + getJump() + " метров");
        else System.out.println("Кошка прыжком на " + getJump() + " метров не перелетела препятствие");
    }

    public void swimmingQustion(){
        if (checkSwim()) System.out.println("Кошка проплыла " + getSwim() + " метров");
        else System.out.println("Кошка не сможет проплыть такое расстояние, ее предел- " + getSwim() + " метров");
    }

    public boolean checkRun(){
        return run >= 100;
    }
    public boolean checkJump(){
        return jump >= 2;
    }
    public boolean checkSwim(){
        return swim >= 40;
    }

    public void countDown(){
        System.out.println(animalCount);
    }
}
