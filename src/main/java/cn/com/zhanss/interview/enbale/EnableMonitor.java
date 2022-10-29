package cn.com.zhanss.interview.enbale;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启班长
 *  注解@Import和 注解@Enable配置使用
 * @author zhanss
 * @date
 **/
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MonitorService.class)
public @interface EnableMonitor {

}
