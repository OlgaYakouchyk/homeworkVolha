package homework4;

public class Task3 {
    public static void main(String[] args) {

        int temperature1;
        int temperature2;

        boolean checkDiv = checkDevice(110, 50);
        System.out.println("Device is - " + checkDiv);


    }

    public static boolean checkDevice (int temperature1, int temperature2){
        if (temperature1 > 100 && temperature2 < 100){
            return true;
        }
        else {
            return false;
        }
    }
}
