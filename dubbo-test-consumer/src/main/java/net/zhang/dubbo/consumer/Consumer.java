package net.zhang.dubbo.consumer;

import net.zhang.dubbo.test.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Administrator
 * @date 2017/12/19
 */
public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("world 88888888");
        System.out.println( hello );
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
