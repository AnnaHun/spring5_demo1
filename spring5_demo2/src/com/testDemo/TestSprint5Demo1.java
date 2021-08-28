package com.testDemo;

import com.code.collectiontype.Book;
import com.code.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/28-2:16 下午
 * @motto: Never say die Never give up
 */
public class TestSprint5Demo1 {
    @Test
    public void testCollectoin() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/resource/bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }

    @Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/resource/bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
