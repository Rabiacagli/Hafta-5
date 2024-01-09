import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

        hSet.remove(20);

        System.out.println(hSet.contains(10));
        //System.out.println(hSet.isEmpty());
        for (Integer sayi : hSet){
           // System.out.println(sayi);

        }


    }
}