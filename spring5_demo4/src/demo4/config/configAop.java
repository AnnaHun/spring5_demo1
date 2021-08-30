package demo4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-11:18 上午
 * @motto: Never say die Never give up
 */
@Configuration
@ComponentScan(basePackages = {"demo4"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class configAop {
}
