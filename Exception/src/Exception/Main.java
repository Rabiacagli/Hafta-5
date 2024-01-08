package Exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Başladı!");

        int a = 0;
        int b = 20;

        try{
            System.out.println("Bölme işlemi başladı.");
            System.out.println(b/a);
            System.out.println("Bölme işlemi bitti.");
        }catch(ArithmeticException e){
            System.out.println("Aritmetik hata alındı.");
            System.out.println("Program Bitti !" + e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kısım kesinlikle çalışacak.");
        }
        System.out.println("Program bitti.");

    }
}
