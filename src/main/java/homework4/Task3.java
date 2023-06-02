package homework4;

public class Task3 {
    public static void main(String[] args) {

        int temperature1 = 107;
        int temperature2 = 67;

        boolean checkDiv = checkDevice(temperature1, temperature2);
        System.out.println("Device is working well - " + checkDiv);


    }

    public static boolean checkDevice(int temperature1, int temperature2) {

        return temperature1 > 100 && temperature2 < 100;
    }
}

