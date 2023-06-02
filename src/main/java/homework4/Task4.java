package homework4;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(28801);

        System.out.println("Do konca raboty octaloc: " + n + " sec");

        int hours = n/3600;
        if (hours > 0) {
            System.out.println("Ostalos: " + hours + " hours");
        }
        else {
            System.out.println("Do konca raboty ostalos menee hours");
        }

    }
}
