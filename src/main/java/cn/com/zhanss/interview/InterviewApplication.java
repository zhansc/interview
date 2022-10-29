package cn.com.zhanss.interview;

import cn.com.zhanss.interview.config.JavaConfig;
import cn.com.zhanss.interview.entity.Monitor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InterviewApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println(ac.getBean(Monitor.class));
    }

}
