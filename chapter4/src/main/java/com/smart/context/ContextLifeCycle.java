package com.smart.context;

import com.smart.Car;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luobiao
 * @date 2017-12-14
 */
public class ContextLifeCycle {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"com/smart/context/beans.xml"});

        Car car1 = (Car)factory.getBean("car");
        car1.introduce();
        //car1.setColor("红色");
    }
}
