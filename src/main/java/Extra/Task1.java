package Extra;

import java.util.Arrays;

public class Task1 {

    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void main(String[] args) {

        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0 ,0};

        // я попробовала решить двумя циклами

        // первый цикл с помощью for

       for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

       // втрой цикл с помощью while

        int i = 0;
        while (i < array.length){
            if (array[i] == 0){
                array[i] = 1;

            }
            i ++;
        }
        System.out.println(Arrays.toString(array));

    }

}
