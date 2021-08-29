package com.service;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
@Service //<bean id="userService" class="........"
public class UserService {
    @Value(value = "abc")
    private String name;

    //    定义dao类型属性
//    不需要添加set方法
//    @Autowired  //根据类型进行注入
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;
    @Resource(name = "userDaoImpl")  //根据类型进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add ...................." + name );
        userDao.add();
    }
}
