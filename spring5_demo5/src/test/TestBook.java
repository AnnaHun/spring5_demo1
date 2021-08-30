package test;

import entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-12:22 下午
 * @motto: Never say die Never give up
 */
public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("java");
//        book.setuStatus("1");
//        bookService.addBook(book);


//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("java++");
//        book.setuStatus("zzm");
//        bookService.updateBook(book);

//        bookService.deleteBook("1");
        int count = bookService.findCount();
        System.out.println(count);
    }


}
