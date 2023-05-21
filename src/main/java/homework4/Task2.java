package homework4;

public class Task2 {
    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        if (isEdekaOpen){
            System.out.println("Edeka Store is open!");
        }
        else {
            System.out.println("Edeka Store is closed!");
        }

        boolean isReweOpen = false;
        if (isReweOpen){
            System.out.println("Rewe Store is open!");
        }
        else {
            System.out.println("Rewe Store is closed!");
        }

        boolean canBuyFood = canBuy(isEdekaOpen,isReweOpen);
        System.out.println("Can I buy a food? " + canBuyFood);

    }


    public static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen){
        if ((isEdekaOpen == true && isReweOpen) == true){
        }
        else {
            return false;
        }
        return true;

    }
}




