package com.testDemo;

import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-1:57 下午
 * @motto: Never say die Never give up
 */
public class TestSpring5Demo1 {
    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
