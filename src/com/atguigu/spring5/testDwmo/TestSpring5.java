package com.atguigu.spring5.testDwmo;

import com.bean.Emp;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/27-6:02 下午
 * @motto: Never say die Never give up
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
//        加载spring的配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("com/been1.xml");
//        获取配置创建的文件
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/been1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/been1.xml");
        Orders order=context.getBean("orders",Orders.class);
        System.out.println(order);
        order.ordersTest();
    }

    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/been2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
        System.out.println(emp);


    }
}
