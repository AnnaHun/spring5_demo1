package com.bean;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/28-4:38 下午
 * @motto: Never say die Never give up
 */
public class Orders {
    public Orders() {
        System.out.println("第一步：执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步：调用set方法设置属性值");
    }

    //    创建执行的初始化方法
    public void initMethod() {
        System.out.println("第三步：执行初始化方法");
    }

//    创建执行销毁的方法
    public void destroyMethod(){
        System.out.println("第五步：执行销毁的方法");
    }
}
