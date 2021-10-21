package HomeworkSix;

abstract class Animal {

    protected int run;
    protected int jump;
    protected int swim;
    public static int animalCount = 0;

    public Animal(int run, int jump, int swim) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
        animalCount++;
    }

    public static int returnCount(){
        return animalCount;
    }

    abstract void runningQustion();
    abstract void jumpingQustion();
    abstract void swimmingQustion();

    abstract boolean checkRun();
    abstract boolean checkJump();
    abstract boolean checkSwim();



//    ----------Get- и Set-методы ------------------------------------------

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
