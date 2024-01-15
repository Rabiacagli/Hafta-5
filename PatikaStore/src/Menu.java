import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    public static void runMenu(){
        boolean isRunning = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Stock Management System");

        while(isRunning){
            System.out.println("=======Control Panel=======");
            System.out.println("1 - Show Brands");
            System.out.println("2 - Laptop Operations");
            System.out.println("3 - Phone Operations");
            System.out.println("0 - Exit Program");
            System.out.print("Please select your operation: ");

            int selection = input.nextInt();

            switch (selection){
                case 1:
                    TreeSet<String> brands = Brands.generateBrands();
                    Brands.showBrands(brands);
                    break;
                case 2:
                    Laptop.showLaptopMenu();
                    break;
                case 3:
                    Phones.showPhoneMenu();
                    break;
                case 0:
                    System.out.println("GoodBye.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }

    }
}