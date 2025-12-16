package example.com;


class MyArraySizeException extends Exception {
    public MyArraySizeException(String s) {
        super(s);
    }
}

class MyArrayDataException extends Exception{
    public MyArrayDataException(String s){
        super(s);
    }
}

public class MyException {
    public static void myMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) { // количество строк
            throw new MyArraySizeException("Не 4 строки");
        }

        for (int i = 0; i < array.length; i++) { // количесвто столбцов
            if (array[i].length != 4) {
                throw new MyArraySizeException("Не 4 столбца в строке " + i);
            }
        }

        System.out.println("Размер массива 4x4");


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum = sum + value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "][" + j + "] лежит не целое число: " + array[i][j]);
                }
            }
        }
        System.out.println("Сумма элементов массива равна " + sum);

    }

    public static void main(String[] args) {

        String[][] array = {

                {"1", "A", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            myMethod(array);
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
            System.out.println(e.getMessage());
        } catch (MyArrayDataException d) {
            System.out.println("Неправильный элемент в массиве");
            System.out.println(d.getMessage());

        }

        // генерация ArrayIndexOutOfBoundsException
        try {
    String cell = array [0] [4];}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Генерация и обработка ArrayIndexOutOfBoundsException");
            System.out.println("Выход за пределы массива");
            e.printStackTrace();
        }

    }
}




