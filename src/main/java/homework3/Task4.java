package homework3;

public class Task4 {
    public static void main(String[] args) {

        int diameter1 = 28;
        int diameter2 = 24;
        int caloriesSquareCentimeter = 40;

        double pizzaArea1 = calculeteAreaPizza(diameter1);
        double pizzaArea2 = calculeteAreaPizza(diameter2);

        int differentCalories = (int) calculeteDiferenceCalories(pizzaArea1, pizzaArea2, caloriesSquareCentimeter);
        System.out.println("If you will buy a pizza diameter 28 instead 24 you get more  " + differentCalories + " calories");

    }
    public static double calculeteAreaPizza (double diameter){
        double radios = diameter / 2.0d;
        double areaOfPizza = Math.PI * Math.pow(radios,2);
        return areaOfPizza;

    }
    public static double calculeteDiferenceCalories (double areaOfPizza1, double areaOfPizza2, int caloriesSquareCentimeter){
        double diferenceAreaOfPizza = areaOfPizza1 - areaOfPizza2;
        int Calories = (int) (caloriesSquareCentimeter * diferenceAreaOfPizza);
        return Calories;
    }
}
