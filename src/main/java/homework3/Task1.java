package homework3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you  first world: ");
        String world1 = scanner.nextLine();
        System.out.println("Enter you  second world:");
        String world2 = scanner.nextLine();

        if (world1.length() % 2 !=0 || world2.length() % 2 !=0){
            System.out.println("Incorrect world ");

        }

        int hafWorld = world1.length() / 2;
        int hafWord2 = world2.length() / 2;
        String firstHafWorld = world1.substring(0, hafWorld);
        String secondHafWorld = world2.substring(hafWord2);

        System.out.println(firstHafWorld+secondHafWorld);


        scanner.close();

    }
}
