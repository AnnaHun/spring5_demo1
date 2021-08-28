package com.factoryBean;

import com.code.collectiontype.Course;
import org.hamcrest.Factory;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/28-3:24 下午
 * @motto: Never say die Never give up
 */
public class MyBean implements FactoryBean {
    //    定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("English");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
