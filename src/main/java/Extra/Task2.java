package Extra;

import java.util.Arrays;

public class Task2 {
    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;


    // Я если честно, то не совсем поняла задачу и сделала в двух вариантах моего понимания.
    // Напишите пожалуйста какой из них правильный или не оди из них :)

    public static void main(String[] args) {
// первый вариант

        int array[] = new int[8];

        for (int i = 0; i < array.length; i++){
            array[0] = 0;
            array[1] = 3;
            array[2] = 6;
            array[3] = 9;
            array[4] = 12;
            array[5] = 15;
            array[6] = 18;
            array[7] = 21;

            System.out.print(array[i] + " ");

        }
        System.out.println();

        // второй вариант

        int value = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = value;
            value +=3;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
