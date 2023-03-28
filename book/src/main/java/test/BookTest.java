package test;
import livre.Book;

import org.junit.jupiter.params.provider.MethodSource;
import static org.testng.AssertJUnit.assertEquals;

public class BookTest {
        @MethodSource
        public void testBook() {
            Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925");
            assertEquals("The Great Gatsby", book.getTitre());
            assertEquals("F. Scott Fitzgerald", book.getAuteur());
            assertEquals("1925", book.getDate());
        }

}
