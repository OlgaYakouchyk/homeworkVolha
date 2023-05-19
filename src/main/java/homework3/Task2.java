package homework3;

public class Task2 {
    public static void main(String[] args) {

        float a;
        float b;
        System.out.println(additionOfNumbers(456f, 678f));
        System.out.println(subtraction(56f, 32.8f));
        System.out.println(multiplication(67f,887f));
        System.out.println(divOfNumbers(678f,56.5f));

    }

    public static float additionOfNumbers (float a, float b) {
        float result = a + b;
        return result;
    }

    public static float subtraction (float a, float b) {
        float result = a - b;
        return result;

    }
    public static float multiplication (float a, float b) {
        float result = a * b;
        return result;
    }

    public static float divOfNumbers (float a, float b) {
        float result = a / b;
        return result;
    }
}

