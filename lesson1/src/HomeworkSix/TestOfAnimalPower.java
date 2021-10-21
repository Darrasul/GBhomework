package HomeworkSix;


public class TestOfAnimalPower {

    public static void main(String[] args) {
        Dog goodDoggie = new Dog(500, 3, 25);
        Dog poorDoggie = new Dog(100, 1, 5);
        Cat cat = new Cat(100, 5, 40);
//        Проверка бега
        goodDoggie.runningQustion();
        poorDoggie.runningQustion();
        cat.runningQustion();
//        Проверка заплыва
        goodDoggie.swimmingQustion();
        poorDoggie.swimmingQustion();
        cat.swimmingQustion();
//        Проверка прыжков
        goodDoggie.jumpingQustion();
        poorDoggie.jumpingQustion();
        cat.jumpingQustion();
//        Проверка количества зверей
        System.out.println("Всего животных было " + Animal.returnCount());
    }



}
