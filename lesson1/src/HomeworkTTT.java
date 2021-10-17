import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTTT {

    private static final int MAP_SIZE = 5;
    private static final int WIN_CON = 4;
    private static final char EMPTY_SPACE = '+';
    private static final char CROSS_TYPE = 'X';
    private static final char ROUND_TYPE = 'O';

    private static int column = 0;
    private static int row = 0;

    private static final Scanner scanner = new Scanner(System.in);
    private static final char[][] map = new char[MAP_SIZE][MAP_SIZE];


    public static void main(String[] args) {

        initializationStartMap();
        initializationOfMap();

        while (true) {
            turnOfPlayer();
            initializationOfMap();

            if (mapOverflow()){
                System.out.println("Поле заполнено, ничья!");
                break;
            } else if (winObj(CROSS_TYPE)){
                System.out.println("Победил игрок!");
                break;
            }

            turnOfAI();
            initializationOfMap();

            if (mapOverflow()){
                System.out.println("Поле заполнено, ничья!");
                break;
            } else if (winObj(ROUND_TYPE)){
                System.out.println("Победил AI!");
                break;
            }

        }
        System.out.println("Игра окончена, благодарим за участие!");

    }

//    Данный метод "переваривает" всю доску и передает методу ниже на проверку каждого значения доски
//    отдельно. Если метод objectiveMaxima передает true, то уже этот метод перестает проверку полей на предмет
//    оставшихся ячеек и завершает игру победой одного из игроков.
    private static boolean winObj(char sign) {
        for (int column = 0; column < map.length; column++) {
            for (int row = 0; row < map[column].length; row++) {
                if (objectiveMaxima(sign, column, row)) return true;

            }
        }
        return false;
    }
//    Забавно, как хорошие мысли приходят в последнюю очередь: на момент, как я догадался, уже прошло 6 часов
//    с момента, как я дописал последнюю строчку урокоподобного кода. Прошу простить за офф-топ.
//    Данный метод прогоняет наши значения доски через примитивный калькулятор: значениям типа int,
//    в случае, если линия выстраивается нормально(по любому из направлений), прибавляется единичка.
//    Если же этого не происходит - система сбрасывает счетчик. Если счетчик доходит до значения необходимых для
//    победы - метод передает в winObj значение true
    private static boolean objectiveMaxima(char sign, int column, int row){
        int horizontal = 0;
        int diagonalLeftUpToRightDown = 0;
        int diagonalLeftDownToRightUp = 0;
//        Вертикальная проверка
        for (int columnCheck = 0; column + columnCheck < MAP_SIZE; columnCheck++) {
            int vertical = 0;
            if (map[column + columnCheck][row] == sign) {
                horizontal++;
                if (horizontal == WIN_CON) return true;

            } else if (map[column + columnCheck][row] != sign && horizontal > 0){
                horizontal = 0;
            }
//            Горизонтальная проверка
            for (int rowCheck = 0; row + rowCheck < MAP_SIZE; rowCheck++) {
                if (map[column + columnCheck][row + rowCheck] == sign){
                    vertical++;
                    if (vertical == WIN_CON) return true;

                } else if (map[column + columnCheck][row + rowCheck] != sign && vertical > 0){
                    vertical = 0;
                }

            }
        }
//            Проверка из левого верхнего угла в правый нижний по диагонали
        for (int columnCheck = 0; columnCheck < MAP_SIZE; columnCheck++) {
            for (int rowCheck = 0; rowCheck < MAP_SIZE; rowCheck++) {
                   if(columnCheck == rowCheck){
                       if (map[columnCheck][rowCheck] == sign) {
                           diagonalLeftUpToRightDown++;
                           if (diagonalLeftUpToRightDown == WIN_CON) return true;

                       } else if (map[columnCheck][rowCheck] != sign && diagonalLeftUpToRightDown != 0) {
                           diagonalLeftUpToRightDown = 0;
                       }
                   }
//                   Проверка из левого нижнего угла в правый верхний по диагонали
                    if(columnCheck + rowCheck == MAP_SIZE - 1){
                        if (columnCheck + rowCheck == MAP_SIZE - 1 && map[columnCheck][rowCheck] == sign){
                            diagonalLeftDownToRightUp++;
                            if (diagonalLeftDownToRightUp == WIN_CON) return true;
                        } else if (map[columnCheck][rowCheck] != sign && diagonalLeftDownToRightUp != 0){
                            diagonalLeftDownToRightUp = 0;
                        }
                    }

            }
        }

        return false;
    }
//    Проверка, не переполнена ли доска
    private static boolean mapOverflow() {
        for (int column = 0; column < MAP_SIZE; column++) {
            for (int row = 0; row < MAP_SIZE; row++) {
                if (checkEmptySpace(column, row)){
                    return false;
                }
            }
        }
        return true;
    }
//     К сожалению, задача с ходом ИИ, блокирующим ход игрока у меня не вышла.
//     Я пытался сделать через отдельный метод, повторяющий проверку победы с уменьшением на 1,
//     но в таком случае бот всеми силами пытался поставить ноль на место уже стоящего креста (что для
//     проверки я ему и дал разок сделать, убрав проверку пустой клетки). Затем пробовал просто увеличивать
//     и уменьшать координаты, заявленные как победные(хотя он по-прежнему видел предпоследнюю точку), но
//     это лишь создавало лишние баги, ведь бот в трех из четырех случаев научился ставить круги мимо поля.
//     Я попытался ввести указатели, чтобы бот учитывал, в какую сторону ему давать сдвиг по координатам,
//     но просто не смог понять, как внедрить их в мой метод(едва измененный objectiveMaxima), поэтому
//     оставил старого болванчика. Лучше код без последнего задания, чем код неработающий и полный багов
    private static void turnOfAI() {
        int column, row;
        Random random = new Random();
            do {
                column = random.nextInt(MAP_SIZE);
                row = random.nextInt(MAP_SIZE);
            } while (!checkEmptySpace(column, row));

            map[column][row] = ROUND_TYPE;
    }


//    Метод отвечает за запрос и обработку хода игрока
//    В случае, если игрок выходит за заданные критерии, метод запрашивает новые данные
//    Главное отличие от урока - наличие отдельной строчки, сообщающей, что место занято
    private static void turnOfPlayer() {
        do {
            System.out.println("Задайте координату номера в колонке для символа");
            column = readNextInt();
            if(!checkRange(column)){
                System.out.println("Координаты должны быть в диапазоне от 1 до " + MAP_SIZE);
                continue;
            }
            System.out.println("Задайте координату расположенную по линии для символа");
            row = readNextInt();
            if(!checkRange(row)){
                System.out.println("Координаты должны быть в диапазоне от 1 до " + MAP_SIZE);
                continue;
            }
            if (checkEmptySpace((column - 1),(row - 1))){
                break;
            } else {
                System.out.println("Место занято");
            }

        } while (true);

        map[column - 1][row - 1] = CROSS_TYPE;
    }

//    Метод проверяет, пуста ли точка для установки
    private static boolean checkEmptySpace(int column, int row) {
        return map[column][row] == EMPTY_SPACE;
    }

//    Метод проверяет, находится ли координата в допустимых пределах
    private static boolean checkRange(int coordinate) {
        return coordinate >= 1 && coordinate <= MAP_SIZE;
    }

//    Метод проверяет, является ли число целым, т.е. подпадает под критерии int-категории
    private static int readNextInt() {
        while (!scanner.hasNextInt()){
            System.out.println("Координаты не могут быть не целым числом");
            System.out.println("Введите целое число");
            scanner.next();
        }
        return scanner.nextInt();
    }

//    Метод отображает карту и ее наполнение
    private static void initializationOfMap() {
        initializationOfMapColumn();
        initializationOfMapsFilling();
    }

//    Метод отвечает за отображение элементов на линии, входит в initializationOfMap
    private static void initializationOfMapsFilling() {
        for (int column = 0; column < MAP_SIZE; column++) {
            System.out.print((column + 1) + " ");
            for (int row = 0; row < map[column].length; row++) {
                System.out.print(map[column][row] + " ");
            }
            System.out.println();
        }
    }

//    Метод отвечает за отображение колонок, входит в initializationOfMap
    private static void initializationOfMapColumn() {
        for (int column = 0; column <= MAP_SIZE; column++) {
                System.out.print(column + " ");
        }
        System.out.println();
    }

//    Метод инициализирует карту для обработки последующими методами
    private static void initializationStartMap() {
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], EMPTY_SPACE);
        }
    }
}
