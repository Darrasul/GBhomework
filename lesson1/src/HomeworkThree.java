import java.util.Arrays;

public class HomeworkThree {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 0, 1, 0, 1, 0}; // #1
        changeNumbersOfArray(firstArray);
        int[] secondArray = new int[100]; // #2
        sequentialFilling(secondArray);
        int[] thirdArray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // #3
        lowNumberMultiplication(thirdArray);
        int[][] fourthArray = new int[5][5];    // #4
        squareCross(fourthArray);
        System.out.println(Arrays.toString(returnArray(5, 15))); // #5
        int[] fifthArray = new int[] {1, 4, 6, 9, 2}; // #6
        searchForMinMax(fifthArray);
          int[] sixthArray = new int[] {4, 5, 7, 1, 2};
          System.out.println(compareSumOfPieces(sixthArray)); // #7
          int[] seventhArrayV1 = new int[] {1, 2, 3, 4};
          int[] seventhArrayV2 = new int[] {1, 2, 3, 4};
          int n = 1;
          int m = -1;
        clockwiseArrayV2(seventhArrayV1, n); // #8
        counterclockwiseV2(seventhArrayV2, m); // #8

        System.out.println(Arrays.toString(seventhArrayV1));
        System.out.println(Arrays.toString(seventhArrayV2));

    }


    private static void clockwiseArrayV2(int[] seventhArray, int n) {
        for (int i = 1; i <= n; i++) {
            int first = seventhArray[0];
            for (int j = seventhArray.length - 1; j > 0; j--) {
                if (seventhArray[j] < seventhArray.length){
                    seventhArray[j + 1] = seventhArray[j];
                } else {
                    seventhArray[0] = seventhArray[j];
                }
            }
            seventhArray[1] = first;

        }
    }

    private static void counterclockwiseV2(int[] seventhArray, int m) {
        for (int i = -1; i >= m; i--) {
            int first = seventhArray[0];
            for (int j = 0; j < seventhArray.length - 1; j++) {
                if (seventhArray[j + 1] < seventhArray.length){
                    seventhArray[j] = seventhArray[j + 1];
                } else {
                    seventhArray[j] = seventhArray[seventhArray.length - 1];
                }
            }
            seventhArray[seventhArray.length - 1] = first;

        }
    }

    private static boolean compareSumOfPieces(int[] sixthArray) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < sixthArray.length / 2; i++) {
            a += sixthArray[i];
        }
        for (int i = sixthArray.length / 2; i >= sixthArray.length / 2 && i < sixthArray.length; i++) {
            b += sixthArray[i];
        }
        return a == b;
    }

    private static void searchForMinMax(int[] fifthArray) {
        int min = fifthArray[0];
        int max = fifthArray[0];
        for (int i = 1; i < fifthArray.length; i++) {
            if (max < fifthArray[i]){
                max = fifthArray[i];
            }
        }
        for (int i = 1; i < fifthArray.length; i++) {
            if (min > fifthArray[i]){
                min = fifthArray[i];
            }
        }
        System.out.println(min + " " + max);
    }

    private static int[] returnArray(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = initialValue;
        }
        return a;
    }

    private static void squareCross(int[][] fourthArray) {
        for (int i = 0; i <= fourthArray.length - 1; i++) {
            for (int j = 0; j <= fourthArray[i].length - 1; j++) {
                if (i == j){
                    fourthArray[i][j] = 1;
                } else {
                    fourthArray[i][j] = 0;
                }
            }
        }
        for (int i = fourthArray.length - 1; i >= 0 ; i--) {
            for (int j = fourthArray[i].length - 1; j >= 0; j--) {
                if (i + j == fourthArray.length - 1){
                    fourthArray[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray[i].length; j++) {
                System.out.print(fourthArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void lowNumberMultiplication(int[] thirdArray) {
        for (int i = 0; i < thirdArray.length; i++) {
           if (thirdArray[i] < 6){
               thirdArray[i] = thirdArray[i] * 2;
           }
        }
        System.out.println(Arrays.toString(thirdArray));
    }

    private static void sequentialFilling(int[] secondArray) {
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(secondArray));
    }

    private static void changeNumbersOfArray(int[] firstArray) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 1){
                firstArray[i] = 0;
            } else {
                firstArray[i] = 1;
            }

        } System.out.println(Arrays.toString(firstArray));
    }
}
