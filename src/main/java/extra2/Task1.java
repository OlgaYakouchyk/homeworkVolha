package extra2;

public class Task1 {
    // Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void main(String[] args) {

        int[] array = {7, 5, 68, 9, 3, 87, 99, 56, 80, 67, 76, 4, 90, 1, 91};
// долго не могла понять почему код не работает. По началу я инициализировала перменные мах и мин просто 0 у меня находило мах а мин нет,
// но честно признаюсь что подсмотрела в как правильно инициализировать в Google.
        int max = array[0];
        int min = array[0];

        for (int value : array) {
            if (value > max)  {
                max = value;
            }
            if (value < min){
                min =value;
            }

        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);

    }
}
