import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // combinedList'e elemanları ekliyoruz

        List<String> combinedList = new ArrayList<>();
        combinedList.add("Fenerbahçe");
        combinedList.add("Beşiktaş");
        combinedList.add("Galatasaray");
        combinedList.add("Trabzonspor");
        combinedList.add("Başakşehir");
        combinedList.add("Sivasspor");
        combinedList.add("Alanyaspor");
        combinedList.add("Rizespor");
        combinedList.add("Göztepe");
        combinedList.add("Konyaspor");
        combinedList.add("Malatyaspor");
        combinedList.add("Antalyaspor");
        combinedList.add("Gaziantepspor");
        combinedList.add("Ankaragücü");


        // Eğer listede bir takım eksikse, listeye "Bay" ekliyoruz
        if (combinedList.size() % 2 != 0) {
            combinedList.add("Bay");
        }


        // Sonradan kullanmak için bir de 2. bir listemiz oluşturuyoruz
        List<String> combinedList2 = new ArrayList<>();

        System.out.println("1. Yarı maçları:\n");
        for (int m = 0; m < (combinedList.size() / 2); m++) {

            // Listeyi karıştırıyoruz
            Collections.shuffle(combinedList);

            System.out.println("\n" + (m + 1) + ".Hafta maçları:\n");
            System.out.println("Ev Sahibi  ||  Deplasman\n");               // Ve bir for döngüsü ile takımları eşleştirip ekrana yazdırıyoruz
            System.out.println("--------------------------");
            int e = 0, f = 1;
            for (int i = 0; i < (combinedList.size() / 2); i++) {
                String home = combinedList.get(e);
                String away = combinedList.get(f);
                System.out.println(home + " vs " + away + " maçı oynanacak.");
                System.out.println();
                e += 2;
                f += 2;
                combinedList2.add(home);                  // 2. yarı maçları için yeni listemize sıralı şekilde maçları ekliyoruz
                combinedList2.add(away);
            }
            System.out.println("--------------------------");
        }
        System.out.println("2. Yarı maçları:\n");         // 2. yarı maçları için yeni listemizdeki maçları ekrana yazdırıyoruz
        int e = 0, f = 1;
        for (int m = 1; m <= (combinedList2.size() / combinedList.size()); m++) {

            System.out.println("\n" + (m + (combinedList.size() / 2)) + ".Hafta maçları:\n");
            System.out.println("Ev Sahibi  ||  Deplasman\n");
            System.out.println("--------------------------");

            for (int i = 0; i < (combinedList.size() / 2); i++) {
                String home = combinedList2.get(f);
                String away = combinedList2.get(e);
                System.out.println(home + " vs " + away + " maçı oynanacak.");
                System.out.println();

                e += 2;
                f += 2;
            }
            System.out.println("--------------------------");
        }
    }
}
