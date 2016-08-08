package com.cfmshine.accuals.utils;

import lombok.extern.log4j.Log4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

@Log4j
public class ApplicationContextUtils {

    private static ApplicationContext ctx = null;

    static {
        try {
            ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        } catch (Throwable throwable) {
            log.info("Spring容器初始化失败");
        }

    }

    public static <T> T getBean(String beanName) {
        if (!StringUtils.isEmpty(beanName)) {
            return (T) ctx.getBean(beanName);
        } else {
            throw new RuntimeException("beanName名称不合法");
        }
    }
}
