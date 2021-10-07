public class HomeworkTwo {
    public static void main(String[] args) {
        compareSum(15 , 3);
        positiveComp(-3);
        negativeComp(5);
        rowWriting("Тестовый текст", 3);
        leapYear(1998);
        leapYear(2000);
        leapYear(200);
    }

    public static boolean compareSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positiveComp(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeComp(int a){
        return a < 0;
    }

    public static void rowWriting(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year){
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

}
