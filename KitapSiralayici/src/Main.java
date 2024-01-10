
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSetleri oluşturuyoruz
     TreeSet<Book> book1 = new TreeSet<> (new SortByName());

     book1.add(new Book("Lord Of The Rings",500, "J.R.R. Tolkien",1963 ));
     book1.add(new Book("Game Of Thrones",400,"George R. R. Martin",1996));
     book1.add(new Book("The 100",450, "Kass Morgan",2014));
     book1.add(new Book("1984", 300, "George Orwell",1949));

        //Kitapları isme göre sıralıp ekrana yazdırıyoruz.

        System.out.println("Kitabın Adı\n-----------");
        for (Book book : book1) {
            System.out.println(book.getBookName() +"\n");
        }
        System.out.println("\n================\n");

        //TreeSeti Başka Bir TreeSete Kopyalıyoruz

        TreeSet<Book> books2 = new TreeSet<>(new SortByPage());
        books2.addAll(book1);

        // //Kitapları sayfa sayısına göre sıralıp ekrana yazdırıyoruz.

        System.out.println("Kitabın Adı || Sayfa Sayısı\n--------------------------");
        for (Book book : books2) {
            System.out.println(book.getBookName() + "\nSayfa : " + book.getNumberOfPage() +"\n-------------");
        }
    }
}

