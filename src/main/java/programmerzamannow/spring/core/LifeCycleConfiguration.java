package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.core.data.Connection;
import programmerzamannow.spring.core.data.Server;

// belajar LifeCyle
@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection (){
        return new Connection();
    }

    // belajar Life Cycle Annotation

    // tidak perlu lagi memerlukan ini karena sudah bikin Annotation PostConstruct dan PreDestroy di server.java
    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server (){
        return new Server();
    }
}
