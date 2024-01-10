import java.util.Comparator;
public class SortByName implements Comparator<Book>{

    // Kitap ismine göre sıralayan metot
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}