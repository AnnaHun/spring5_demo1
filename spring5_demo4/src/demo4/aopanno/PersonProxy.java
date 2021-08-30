package demo4.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-11:04 上午
 * @motto: Never say die Never give up
 */
@Component
@Aspect
@Order(3)
public class PersonProxy {

    //    前置通知
    @Before(value = "execution(* demo4.aopanno.User.add(..))")
    public void before() {
        System.out.println("before...............");
    }
}
