package me.whiteship;

import junit.framework.TestCase;
import org.junit.Test;

public class ContainerServiceTest extends TestCase {

    @Test
    public void test_GetObject_bookRepository() {
        final BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertNotNull(bookRepository);
    }

    @Test
    public void test_getObject_bookService() {
        final BookService bookService = ContainerService.getObject(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }

}