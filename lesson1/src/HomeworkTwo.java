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
        boolean compare;
        int sum = a + b;
        compare = sum >= 10 && sum <= 20;
        return compare;
    }

    public static void positiveComp(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeComp(int a){
        boolean negativeNum;
        negativeNum = a < 0;
        return negativeNum;
    }

    public static void rowWriting(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year){
        boolean leap;
        if (year % 4 == 0){
            if (year % 400 == 0){
                leap = true;
            } else leap = year % 100 != 0;
        } else {
            leap = false;
        }
        return leap;
    }
}
