package cn.com.zhanss.interview.enbale;

import cn.com.zhanss.interview.entity.Monitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhansc
 * @date
 **/
@Configuration
public class MonitorService {

    @Bean
    public Monitor getMonitor() {
        return new Monitor("bantou");
    }
}
