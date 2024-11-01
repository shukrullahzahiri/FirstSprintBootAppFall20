package keyin.librarymanagement.controller;

import keyin.librarymanagement.entity.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookControllerTest {

    @Test
    public void testBookController() {
        // Basic test to ensure the Book class is recognized
        Book book = new Book();
        book.setTitle("Test Book");
        System.out.println("Book Title: " + book.getTitle());
    }
}
