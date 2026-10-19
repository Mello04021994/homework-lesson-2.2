public class Main {

    public static void main(String[] args) {
        printThreeWords(); // Метод задачи № 1
        checkSumSign(); // Метод задачи № 2
        printColor(); // Метод задачи № 3
        compareNumbers(); // Метод задачи № 4
        System.out.println(summaChisel(10,50)); // Метод задачи № 5
        plusOrmMinus(10); // Метод задачи № 6
        System.out.println(chisloTrueOrFalse(100)); // Метод задачи № 7
        textChislo("Влад", 5); // Метод задачи № 8
        System.out.println(visokosnyiGod(2026)); // Метод задачи № 9
        massivArray(); // Метод задачи № 10
        fullArray(); // Метод задачи № 11
        umnojaemArray(); // Метод задачи № 12
        diagonalMatrix(); // Метод задачи № 13
        int[] result = insideMethodArray(10, 50);
        System.out.println(java.util.Arrays.toString(result));
    }
    // Задача № 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Задача № 2
    public static void checkSumSign() {
        int a = 10;
        int b = 50;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задача № 3
    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // Задача № 4
    public static void compareNumbers() {
        int a = 10;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // Задача № 5
    public static boolean summaChisel(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // Задача № 6
    public static void plusOrmMinus(int chislo) {
        if (chislo >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // Задача № 7
    public static boolean chisloTrueOrFalse(int chislo) {
        if (chislo < 0) {
            return true;
        } else {
            return false;
        }
    }
    // Задача № 8
    public static void textChislo(String text, int chislo) {
        for (int i = 0; i < chislo; i++) {
            System.out.println(text);
        }
    }
    // Задача № 9
    public static boolean visokosnyiGod(int god) {
        if (god % 400 == 0) {
            return true;
        } else if (god % 100 == 0) {
            return false;
        } else if (god % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // Задача № 10
    public static void massivArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Замена 1 на 0:  " + java.util.Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println("Замена 0 на 1: " + java.util.Arrays.toString(array));
    }
    // Задача № 11
    public static void fullArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Массив заполнен значениями: " + java.util.Arrays.toString(array));
    }
    // Задача № 12
    public static void umnojaemArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до умножения: " + java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2; // Умножаем текущий элемент на 2
            }
        }
        System.out.println("Массив после умножения: " + java.util.Arrays.toString(arr));
    }
    // Задача № 13
    public static void diagonalMatrix() {
        int size = 5;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        System.out.println("Квадратный массив с двумя диагоналями:");
        for (int i = 0; i < size; i++) {
            System.out.println(java.util.Arrays.toString(matrix[i]));
        }
    }
    // Задача № 14
    public static int[] insideMethodArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
