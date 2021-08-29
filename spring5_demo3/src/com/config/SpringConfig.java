package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/29-2:46 下午
 * @motto: Never say die Never give up
 */
@Configuration   //作为配置类，替代xml配置文件
@ComponentScan(basePackages = "com")
public class SpringConfig {
}
