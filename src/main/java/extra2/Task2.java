package extra2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    //написать метод, в который передается не пустой одномерный целочисленный массив
    // метод должен вернуть true, если в массиве есть место, в котром сумма левой и правой части массива равны.
    // Примеры:
    //checkBalance ([2, 2, 2, 1, 2, 2 || 10, 1]) -> true,
    //checkBalance ([1, 1, 1, || 2, 1]) -> true,
    //границы показаны символом || , эти символоы в массив не входят.


    public static void main(String[] args) {

        int[] array = {6, 9, 3, 2, 1, 1, 9, 5, 2, 7};
        int[] array2 = {6, 1, 2, 3, 2};
        int[] array3 = {1, 4, 2, 1, 1, 2, 1, 3, 1};


        System.out.println(checkMethod(array));
        System.out.println(checkMethod(array2));
        System.out.println(checkMethod(array3));


    }
// поначалу решала задачу этим способом, т.к думала что масссив нужно разделить на две равные части,
// но оказалось что не так все просто:)))). Так что этот вариант я просто закоментировала


  /*  public static boolean checkMethod(int[] array) {
        int middle = array.length / 2;
        int[] firstHafArray = Arrays.copyOfRange(array, 0, middle);
        int[] secondHafArray = Arrays.copyOfRange(array, middle, array.length);

        int sumFirstHafArray = 0;
        int sumSecondHafArray = 0;
        for (int i = 0; i < firstHafArray.length; i++) {
            sumFirstHafArray +=firstHafArray[i];

        }
        for (int i = 0; i < secondHafArray.length; i++) {
            sumSecondHafArray +=secondHafArray[i];

        }
        return sumFirstHafArray == sumSecondHafArray;
    }*/

    public static boolean checkMethod(int[] array) {

        int sumLeftArray = 0;
        int sumRightArray = 0;
        int split = 0; // 0 указывает что разделение на равные части пока не найдено

        // подсчитываем сумму всех элементов массива
        for (int i = 0; i < array.length; i++) {
            sumRightArray += array[i];
        }

        // ищем индекс по каторому пойдет разделение на левую и правую часть и их сумма будет равна
        for (int i = 0; i < array.length; i++) {
            sumRightArray -= array[i];
            sumLeftArray += array[i];
            if (sumRightArray == sumLeftArray) {
                split = i; // если суммы частей равны то присваевается текущее значение индекса по которому происходит разделение
                break;
            }
        }

        if (split != 0) { //если не равно 0 , то разделение удалось
            // правая чась массива до индекса split всключительно
            int[] rightHafArray = Arrays.copyOfRange(array, 0, split + 1);

            // левая чась массива до индекса split всключительно
            int[] leftHafArray = Arrays.copyOfRange(array, split + 1, array.length);
            System.out.println(Arrays.toString(rightHafArray) + Arrays.toString(leftHafArray));
            return true;
        } else {
            System.out.println("Unable to split");
        }
        return false;

    }

}


