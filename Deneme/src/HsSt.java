import java.util.LinkedHashSet;

public class HsSt {
    public static void main(String[] args) {
        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Pazartesi");
        days.add("Salı");
        days.add("Çarşamba");
        days.add("Perşembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        days.remove("Cumartesi");

        for (String day : days) {
            System.out.println(days.contains("Cuma"));
        }

    }
}
