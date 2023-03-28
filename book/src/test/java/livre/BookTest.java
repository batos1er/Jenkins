package livre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class BookTest {

    @Test
    void BookTestGetter() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925");
        assertEquals("The Great Gatsby", book.getTitre());
        assertEquals("F. Scott Fitzgerald", book.getAuteur());
        assertEquals("1925", book.getDate());
    }

    @Test
    void testSetters() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925");
        book.setTitre("To Kill a Mockingbird");
        book.setAuteur("Harper Lee");
        book.setDate("1960");
        assertEquals("To Kill a Mockingbird", book.getTitre());
        assertEquals("Harper Lee", book.getAuteur());
        assertEquals("1960", book.getDate());
    }
}