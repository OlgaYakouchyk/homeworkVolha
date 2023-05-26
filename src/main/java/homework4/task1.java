package homework4;

public class task1 {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        //я нашла два варианта
        /*boolean canWalk;
        if (isWeekend != isRain){
            System.out.println("you can walk");
        }
        else {
            System.out.println("you can not walk");
        }*/
        boolean canWalk = isWeekend && ! isRain;
        System.out.println("I can walk! " + canWalk);

    }
}
