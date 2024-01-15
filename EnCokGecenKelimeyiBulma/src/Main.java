import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kelimeler = null;
        int maxNumb = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin Giriniz.");
        String[] strings = scanner.nextLine().split(" ");
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        for (String element : strings) {
            element = element.toLowerCase();
            if (stringIntegerHashMap.containsKey(element)) {
                Integer count = stringIntegerHashMap.get(element);
                stringIntegerHashMap.put(element, count + 1);

            } else {
                stringIntegerHashMap.put(element, 1);
            }

        }

        for (String eleman : stringIntegerHashMap.keySet()) {
            System.out.println("Key : " + eleman + " Value : " + stringIntegerHashMap.get(eleman));
        }
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();

            if (count > maxNumb) {
                kelimeler = word;
                maxNumb = count;
            }
        }
        System.out.println(" En çok Geçen Kelime : " + kelimeler);
        System.out.println(" Count Değeri " + maxNumb);
    }

}