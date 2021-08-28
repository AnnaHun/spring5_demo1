package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/28-11:19 上午
 * @motto: Never say die Never give up
 */
public class UserService {
//    创建userdao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add..............");
        userDao.update();
    }
}
