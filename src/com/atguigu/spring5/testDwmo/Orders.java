package com.atguigu.spring5.testDwmo;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/28-10:08 上午
 * @motto: Never say die Never give up
 */
public class Orders {
    private String oName;
    private String address;

//    有参构造
    public Orders(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oName+"::"+address);
    }
}
