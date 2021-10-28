package HomeworkSeven;

public class FeedingCat {

        public static void main(String[] args) {
                Cat cat = new Cat(10, "Tomas");
                Cat cat2 = new Cat(0, "Henry");
                Cat cat3 = new Cat(50, "Big boy");
                Plate plate1 = new Plate(15);
                Plate plate2 = new Plate(1);
                Plate plate3 = new Plate(35);
                Cat[] littleCats = new Cat[3];
                littleCats[0] = new Cat(5, "Timmy");
                littleCats[1] = new Cat(3, "Arny");
                littleCats[2] = new Cat(55, "Cunning Big Boy");

                System.out.println("Вы заглянули в тарелку");
                System.out.println("В первой");
                plate1.info();
                System.out.println("Во второй");
                plate2.info();
                System.out.println("В третьей");
                plate3.info();
                System.out.println("Покормим больших котов");
                cat.feedingTime(plate1);
                cat2.feedingTime(plate2);
                cat3.feedingTime(plate3);
                System.out.println("Доложим корма в большую тарелку и попробуем еще");
                plate3.putFood(50);
                cat3.feedingTime(plate3);
                System.out.println("А теперь покормим мелочь");
                for (int i = 0; i < littleCats.length; i++) {
                        littleCats[i].feedingTime(plate3);
                }

        }

}
