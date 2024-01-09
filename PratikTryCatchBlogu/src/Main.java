import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index;

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner inp = new Scanner(System.in);

        do {
              System.out.print("0 ve 9 arasında bir index numarası giriniz: ");
              index = inp.nextInt();
            try {
                System.out.println("Girilen indexteki eleman : " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array boyut hatası!" + e.toString());
            }finally {
                System.out.println("Program bitti!");
            }
        }while (index < 25);
    }
}