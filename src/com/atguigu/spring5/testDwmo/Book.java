package com.atguigu.spring5.testDwmo;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description set方法进行注入属性
 * @date 2021/8/28-9:54 上午
 * @motto: Never say die Never give up
 */
public class Book {
    private String bName;
    private String bauthor;
    private String address;

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bName+"::"+bauthor+"::"+address);
    }


}
