package com.testDemo;

import com.bean.Orders;
import com.code.collectiontype.Book;
import com.code.collectiontype.Course;
import com.code.collectiontype.Stu;
import com.factoryBean.MyBean;
import com.sun.tools.corba.se.idl.constExpr.Or;
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
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/resource/bean3.xml");
        Course myBean = context.getBean("MyBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void testBean3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/resource/bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(orders);

//        手动让Bean实例销毁
        context.close();
    }
}
