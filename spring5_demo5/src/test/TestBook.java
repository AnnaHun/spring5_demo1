package test;

import entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

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
//        book.setUserId("3");
//        book.setUserName("PHP");
//        book.setuStatus("xiaobai");
//        bookService.addBook(book);


//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("java++");
//        book.setuStatus("zzm");
//        bookService.updateBook(book);

//        bookService.deleteBook("1");
//        int count = bookService.findCount();
//        System.out.println(count);
//        Book one = bookService.findOne("1");
//        System.out.println(one);
//        List<Book> all = bookService.findAll();
//        System.out.println(all);
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"4", "红楼梦", "曹雪芹"};
//        Object[] o2 = {"5", "西游记", "吴承恩"};
//        Object[] o3 = {"6", "三国演义", "罗贯中"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"红楼梦+1", "曹雪芹", "4"};
        Object[] o2 = {"西游记+1", "吴承恩", "5"};
        Object[] o3 = {"三国演义+1", "罗贯中", "6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);

    }


}
