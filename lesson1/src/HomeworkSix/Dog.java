package HomeworkSix;

public class Dog extends Animal{



    public Dog(int run, int jump, int swim){
       super(run, jump, swim);
    }

    public void runningQustion(){
        if (checkRun()) System.out.println("Собака пробежала " + getRun() + " метров");
        else System.out.println("Собака пробежала " + getRun() + " метров, после чего выдохлась");
    }

    public void jumpingQustion(){
        if (checkJump()) System.out.println("Собака прыгнула на " + getJump() + " метров");
        else System.out.println("Собака прыжком на " + getJump() + " метров не перелетела препятствие");
    }

    public void swimmingQustion(){
        if (checkSwim()) System.out.println("Собака проплыла " + getSwim() + " метров");
        else System.out.println("Собака не сможет проплыть такое расстояние, ее предел- " + getSwim() + " метров");
    }

    public boolean checkRun(){
        return getRun() >= 250;
    }
    public boolean checkJump(){
        return getJump() >= 1;
    }
    public boolean checkSwim(){
        return getSwim() >= 20;
    }

    public void countDown(){
        System.out.println(animalCount);
    }

}
