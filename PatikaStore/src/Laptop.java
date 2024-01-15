import java.util.ArrayList;
import java.util.Scanner;

public class Laptop extends Products {
    public Laptop(int id, String name, Double price, String brand, int memory, Double screenSize, int ram, int stock) {
        super(id, name, price, brand, memory, screenSize, ram, stock);
    }

    static Scanner input = new Scanner(System.in);

    static ArrayList<Laptop> laptops = new ArrayList<>();

    static {
        laptops.add(new Laptop(1, "Vivobook", 35000.0, "Asus", 512,
                14.0, 16, 35));
        laptops.add(new Laptop(2, "Macbook Air", 38999.0, "Apple", 512,
                13.0, 6, 26));
        laptops.add(new Laptop(3, "ASUS Rog Strix", 32999.0, "HP", 1024,
                15.6, 16, 41));
    }


    public static void showLaptops(){
        System.out.format("%-8s %-25s %-12s %-16s %-10s %-6s %-6s %-6s", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama",
                "Ekran", "RAM", "Stok");
        System.out.println();
        for (Laptop laptop: laptops) {
            System.out.format("%-8s %-25s %-12s %-16s %-10s %-6s %-6s %-6s", laptop.getId(), laptop.getName(),
                    laptop.getPrice(), laptop.getBrand(), laptop.getMemory(), laptop.getScreenSize(), laptop.getRam(),
                    laptop.getStock());
            System.out.println();
        }

    }

    public static void showLaptopMenu(){
        boolean isRunning = true;

        do {
            System.out.println("=======LAPTOP OPERATIONS=======");
            System.out.println("1 - Show all products");
            System.out.println("2 - Add new product");
            System.out.println("3 - Remove a product");
            System.out.println("0 - Previous Menu");
            System.out.print("Please select your operation: ");

            int selection = input.nextInt();

            switch (selection){
                case 1:
                    showLaptops();
                    break;
                case 2:
                    addLaptop(laptops);
                    break;
                case 3:
                    deleteProduct(laptops);
                    break;
                case 0:
                    System.out.println("Exiting to previous menu.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }while (isRunning);

    }

    public static void addLaptop(ArrayList<Laptop> laptop){
        ArrayList<Integer> laptopIDList = new ArrayList<>();
        for (Laptop laptops: laptop) {
            laptopIDList.add(laptops.getId());
        }
        System.out.println("Please enter new ID: ");
        int newLaptopID = input.nextInt();
        input.nextLine();
        if (!laptopIDList.contains(newLaptopID)) {
            System.out.println("Please enter the name: ");
            String newLaptopName = input.nextLine();

            System.out.println("Please enter the price: ");
            Double newLaptopPrice = Double.parseDouble(input.nextLine());

            System.out.println("Please enter the brand: ");
            String newLaptopBrand = input.nextLine();

            System.out.println("Please enter the size of the memory: ");
            int newLaptopMemory = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the size of the screen: ");
            Double newLaptopScreenSize = Double.parseDouble(input.nextLine());

            System.out.println("Please enter the RAM: ");
            int newLaptopRAM = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the stock: ");
            int newLaptopStock = Integer.parseInt(input.nextLine());

            laptops.add(new Laptop(newLaptopID, newLaptopName, newLaptopPrice, newLaptopBrand, newLaptopMemory,
                    newLaptopScreenSize, newLaptopRAM, newLaptopStock));

            System.out.println("New laptop added.");
            System.out.println("================");
            showLaptops();
        }
        else {
            System.out.println("ID already exists. Please try again.");

        }

    }

    public static void deleteProduct(ArrayList<Laptop> laptop){
        showLaptops();
        ArrayList<Integer> laptopIDList = new ArrayList<>();
        for (Laptop laptops: laptop) {
            laptopIDList.add(laptops.getId());
        }
        System.out.println("Please select the id of the product you want to delete: ");
        int deletionSelection = input.nextInt();
        if (laptopIDList.contains(deletionSelection)){
            laptop.removeIf(laptops -> deletionSelection == laptops.getId());
            System.out.println("Product removed.");
            showLaptops();
        } else {
            System.out.println("ID not found.");
        }
    }

}