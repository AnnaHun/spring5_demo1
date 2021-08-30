package demo4.aopanno;

import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description 被增强类
 * @date 2021/8/30-9:36 上午
 * @motto: Never say die Never give up
 */
@Component
public class User {
    public void add(){
        System.out.println("add ....................");
    }
}
