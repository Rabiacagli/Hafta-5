import java.util.ArrayList;
import java.util.Scanner;

public class Phones extends Products {
    private int batterySize;
    private int camera;
    private String color;
    static Scanner input = new Scanner(System.in);


    public Phones(int id, String name, Double price, String brand, int memory, Double screenSize, int ram, int stock,
                  int batterySize, int camera, String color) {
        super(id, name, price, brand, memory, screenSize, ram, stock);
        this.batterySize = batterySize;
        this.camera = camera;
        this.color = color;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCameraMP() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static ArrayList<Phones> phones = new ArrayList<>();

    static {
        phones.add(new Phones(1, "SAMSUNG GALAXY A71", 6200.0, "Samsung", 256,
                6.5, 8, 20, 4000,64, "Mavi"));
        phones.add(new Phones(2, "iPhone 14 ProMax", 73379.0, "Apple", 256,
                6.7, 8, 25, 4500,48, "Mor"));
        phones.add(new Phones(3, "Huawei P60", 6000.0, "Huawei", 128,
                6.5, 12, 17, 4000,35, "Siyah"));
    }

    public static void showPhoneMenu(){
        boolean isRunning = true;

        do {
            System.out.println("=======TELEPHONE OPERATIONS=======");
            System.out.println("1 - Show all products");
            System.out.println("2 - Add new product");
            System.out.println("3 - Delete product");
            System.out.println("0 - Previous Menu");
            System.out.print("Please select your operation: ");

            int selection = input.nextInt();

            switch (selection){
                case 1:
                    showPhones();
                    break;
                case 2:
                    addPhone(phones);
                    break;
                case 3:
                    deleteProduct(phones);
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

    public static void showPhones(){
        System.out.format("%-8s %-25s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s", "ID", "Ürün Adı", "Fiyat",
                "Marka", "Depolama", "Ekran", "RAM", "Pil", "Kamera", "Renk", "Stok");
        System.out.println();
        for (Phones phone: phones) {
            System.out.format("%-8s %-25s %-12s %-16s %-10s %-6s %-6s %-6s %-6s %-6s %-6s", phone.getId(), phone.getName(),
                    phone.getPrice(), phone.getBrand(), phone.getMemory(), phone.getScreenSize(), phone.getRam(),
                    phone.getBatterySize(), phone.getCameraMP(), phone.getColor(), phone.getStock());
            System.out.println();
        }
    }

    public static void addPhone(ArrayList<Phones> phone){
        ArrayList<Integer> phoneIDList = new ArrayList<>();
        for (Phones phones: phone) {
            phoneIDList.add(phones.getId());
        }
        System.out.println("Please enter new ID: ");
        int newPhoneID = input.nextInt();
        input.nextLine();
        if (!phoneIDList.contains(newPhoneID)) {
            System.out.println("Please enter the name: ");
            String newPhoneName = input.nextLine();

            System.out.println("Please enter the price: ");
            Double newPhonePrice = Double.parseDouble(input.nextLine());

            System.out.println("Please enter the brand: ");
            String newPhoneBrand = input.nextLine();

            System.out.println("Please enter the size of the memory: ");
            int newPhoneMemory = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the size of the screen: ");
            Double newPhoneScreenSize = Double.parseDouble(input.nextLine());

            System.out.println("Please enter the RAM: ");
            int newPhoneRAM = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the size of the battery: ");
            int newPhoneBatterySize = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the camera MP: ");
            int newPhoneCameraMP = Integer.parseInt(input.nextLine());

            System.out.println("Please enter the color: ");
            String newPhoneColor = input.nextLine();

            System.out.println("Please enter the stock: ");
            int newPhoneStock = Integer.parseInt(input.nextLine());

            phones.add(new Phones(newPhoneID, newPhoneName, newPhonePrice, newPhoneBrand, newPhoneMemory,
                    newPhoneScreenSize, newPhoneRAM, newPhoneStock, newPhoneBatterySize, newPhoneCameraMP, newPhoneColor));

            System.out.println("New phone added.");
            System.out.println("================");
            showPhones();
        }
        else {
            System.out.println("ID already exists. Please try again.");

        }

    }

    public static void deleteProduct(ArrayList<Phones> phone){
        showPhones();
        ArrayList<Integer> phoneIDList = new ArrayList<>();
        for (Phones phones: phone) {
            phoneIDList.add(phones.getId());
        }
        System.out.print("Please select the id of the product you want to delete: ");
        int deletionSelection = input.nextInt();
        if (phoneIDList.contains(deletionSelection)){
            phone.removeIf(phones -> deletionSelection == phones.getId());
            System.out.println("Product removed.");
            showPhones();
        } else {
            System.out.println("ID not found.");
        }
    }
}