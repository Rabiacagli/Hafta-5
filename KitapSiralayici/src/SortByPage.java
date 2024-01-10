import java.util.Comparator;
public class SortByPage implements Comparator<Book>{

    // Kitap ismine göre sıralayan metot
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberOfPage() - o2.getNumberOfPage();
    }
}