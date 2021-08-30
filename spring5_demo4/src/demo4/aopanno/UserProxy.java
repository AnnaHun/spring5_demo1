package demo4.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description 增强类
 * @date 2021/8/30-9:37 上午
 * @motto: Never say die Never give up
 */
@Component
@Aspect //生成代理对象
@Order(1)
public class UserProxy {

    //    相同切入点抽取
    @Pointcut(value = "execution(* demo4.aopanno.User.add(..))")
    public void pointdemo() {

    }


    //    前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before...............");
    }


}
