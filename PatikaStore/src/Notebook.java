import java.util.ArrayList;

public class Notebook extends Product implements Operation{
    private static int id = 1;
    private static ArrayList<Notebook> notebookList = new ArrayList<>();
    public Notebook(String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }

    public Notebook() {
    }

    @Override
    public void runMenu() {
        System.out.println("Notebook Yönetim Paneli ");
        System.out.println("1- Notebook ekleme \n" +
                "2- Notebook silme \n" +
                "3- İd'ye göre filtreleme \n" +
                "4- Markaya göre filtreleme \n" +
                "5- Notebook listeleme \n" +
                "0- Çıkış Yap");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        // switch-case
    }

    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
