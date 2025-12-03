public class MyClass {
    public static void main(String[] args) {
        printThreeWords();  // Вызов метода 1
        checkSumSign(); // 2
        printColor(); // 3
        compareNumbers(); // 4
        System.out.println(isSumBetween(15, 30)); // 5
        printPolojOtriz(-1000);   // 6
        System.out.println(isNegative(56)); // 7
        printStr("qwerty", 3); // 8
        System.out.println(isYearVisokosniy(2024)); // 9
        massiv(); // 10
        massiv100(); // 11
        arraySixOnTwo(); //12
        diagonal(); // 13
        generateArray(5,10); //14
    }

    public static void printThreeWords() {  //
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { // 2
        int a = -1;
        int b = -2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 300;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {

        int a = 5;
        int b = 300;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean isSumBetween(int a, int b) { //5
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    public static void printPolojOtriz(int a) {   // 6
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {  // 7
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStr(String str, int n) {  // 8
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearVisokosniy(int year) { // 9
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void massiv() { // 10
        int[] a = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    }

    public static void massiv100() { // 11
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

    }

    public static void arraySixOnTwo() {   //12
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }

    }

    public static void diagonal() { // 13
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
            }
        }
    }
    public static int[] generateArray(int len, int initialValue ){
        int [] a = new int[len];
        for ( int i = 0 ; i < len; i++) {  a[i] = initialValue;}
        return a;
    }

}