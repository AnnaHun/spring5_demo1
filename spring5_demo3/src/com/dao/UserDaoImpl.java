package com.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-2:22 下午
 * @motto: Never say die Never give up
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add .....................");
    }
}
