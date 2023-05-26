package homework4;

import javax.swing.text.DateFormatter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 0;
        int max = 28800;
        int n = random.nextInt(max - min + 1);

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
