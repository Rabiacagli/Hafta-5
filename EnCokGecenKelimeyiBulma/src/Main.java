import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için bir Scanner oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya metin girmesini söyleyip girişi 'text' değişkenine kaydediyoruz
        System.out.print("Metni giriniz: ");
        String text = scanner.nextLine();

        // Giriş metnini boşluk karakterlerine göre ayırarak kelimelere bölüyoruz
        String[] words = text.split("\\s+");

        // Her bir kelimenin frekansını tutmak için bir HashMap oluşturuyoruz
        HashMap<String, Integer> numberOfWord = new HashMap<>();

        // Her bir kelimenin frekansını sayıyor ve HashMap'e kaydediyoruz
        for (String word : words) {
            if (numberOfWord.containsKey(word)) {
                numberOfWord.put(word, numberOfWord.get(word) + 1);
            } else {
                numberOfWord.put(word, 1);
            }
        }

        // En çok geçen kelimeleri tutmak için bir liste oluşturuyoruz
        List<String> mostMentionedWords = new ArrayList<>();

        // En yüksek frekansı takip etmek için bir sayaç oluşturuyoruz
        int counter = 0;

        // Her bir kelimenin frekansını kontrol ediyor ve en çok geçen kelimeleri buluyoruz
        for (Map.Entry<String, Integer> entry : numberOfWord.entrySet()) {
            if (entry.getValue() == counter) {
                // Eğer kelimenin frekansı, şu ana kadar en yüksek frekansa eşitse
                mostMentionedWords.add(entry.getKey());
                // Bu kelimeyi en çok geçen kelimeler listesine ekliyoruz
            } else if (entry.getValue() > counter) {
                // Eğer kelimenin frekansı, şu ana kadar en yüksek frekansı geçiyorsa
                mostMentionedWords.clear();
                // En çok geçen kelimeler listesini temizliyoruz (çünkü yeni bir en yüksek frekans bulduk)
                mostMentionedWords.add(entry.getKey());
                // Bu kelimeyi en çok geçen kelimeler listesine ekliyoruz
                counter = entry.getValue();
                // Sayacı güncelliyoruz (en yüksek frekansı güncelliyoruz)
            }
        }

        // En çok geçen kelimeleri ve frekanslarını ekrana yazdırıyoruz.
        System.out.println("En çok kullanılan kelimeler: " + mostMentionedWords + " (" + counter + " kere geçiyor.)");
    }
}