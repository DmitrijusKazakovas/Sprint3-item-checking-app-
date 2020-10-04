package Sprint3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfFish {
    public static void main(String[] args) {

        ArrayList<FishClass> list = new ArrayList<FishClass>();

        FishClass fish1 = new FishClass(12,5,"Carp");
        FishClass fish2 = new FishClass(6, 1, "Shrimp"); //Note! When refactoring to double this.weight in class underlined with red
        FishClass fish3 = new FishClass(15, 6, "Tuna");

        FishClass e= createFishClass();
        list.add(e);

        //Writing user input to file


    }


    //User input in console
    public static FishClass createFishClass() //This method cannot be a separate class
    {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the price of your fish in euros: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter the weight of the fish in kg: ");
        int weight = Integer.parseInt(input.nextLine());
        System.out.println("Enter the name of your fish: ");
        String name = input.nextLine();

        System.out.println(createFishClass());//Don't know how to display entered input

        FishClass FishClass = new FishClass(price, weight, name);
        return FishClass;
    }
}
