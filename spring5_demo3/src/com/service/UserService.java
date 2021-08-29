package com.service;

import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-1:53 下午
 * @motto: Never say die Never give up
 */
//在注解里面的value属性值可以省略不写
//默认值是类名称，首字母小写
@Component(value = "userService")  //<bean id="userService" class="........"
public class UserService {
    public void add() {
        System.out.println("service add ....................");
    }
}
