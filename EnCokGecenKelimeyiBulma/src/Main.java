import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        String text = scanner.nextLine();

        // Metni kelimelere ayırma
        String[] words = text.split("\\s+");

        // Kelimeleri saymak için HashMap kullanma
        Map<String, Integer> numberOfWord = new HashMap<>();

        for (String word : words) {

            // HashMap'te kelimenin sayısını güncelleme
            numberOfWord.put(word, numberOfWord.getOrDefault(word, 0) + 1);
        }
        // En çok geçen kelimeyi bulma
        String mostMentionedWord = "";
        int counter = 0;

        for (Map.Entry<String, Integer> entry : numberOfWord.entrySet()) {
            if (entry.getValue() > counter) {
                mostMentionedWord = entry.getKey();
                counter = entry.getValue();
            }
        }
        // Sonucu ekrana yazdırma
        System.out.println("En Çok Geçen Kelime: " + mostMentionedWord);
    }
}