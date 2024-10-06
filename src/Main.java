import java.util.Arrays;

public class Main {
    // Выполнение задач по теме массивы из блока повышенной сложности
    public static void main(String[] args) {

        //(Задача 5) Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        // Постарайтесь заполнить обе диагонали в одном цикле.
        int n = 3;
        int[][] arrs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arrs[i][j] = 1;
                } else if ((i == 0 && j == arrs.length - 1) || (j == 0 && i == arrs.length - 1)) {
                    arrs[i][j] = 1;
                }
            }

        }
        printArray(arrs);
        System.out.println();


        //(Задача 6) У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        //
        //Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        //
        //Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        //
        //Нам дан массив чисел: {5, 4, 3, 2, 1}
        //
        //Необходимо привести его к виду: {1, 2, 3, 4, 5}
        //
        //Решите задачу с использованием дополнительного массива.
        //
        //Напечатайте массив до преобразования и после
        int[] marks = {1, 2, 3, 4, 5};
        int[] marks2 = new int[marks.length];
        for (int i = marks.length - 1; i > 0; ) {
            for (int j = 0; j < marks.length; j++) {
                marks2[j] = marks[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(marks2));
        System.out.println();


        //(Задача 7) Решите предыдущее задание, но без использования дополнительного массива.
        //
        //Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        //
        //Выведите результат программы в консоль тем же способом.
        int[] array = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(array));
        System.out.println();


        //(Задача 8) Задача, которая используется/бывает/встречается на собеседованиях.
        //
        //Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        //
        //Необходимо найти все пары чисел, сумма которых равна −2.
        //
        //Напечатать эти числа в консоль.
        int[] mass = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(mass);
        for (int i = 0; i < mass.length-1; i++) {
            for (int j = i; j < mass.length-1; j++) {
                if (i==j) {
                    continue;
                }
                if (mass[i] + mass[j] == -2) {
                    System.out.println(mass[i] + " + " + mass[j] + " = -2");
                }
            }
        }

    }

    private static void printArray(int[][] arrs) {  //Печать массива в виде матрицы
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println();
        }
    }
}