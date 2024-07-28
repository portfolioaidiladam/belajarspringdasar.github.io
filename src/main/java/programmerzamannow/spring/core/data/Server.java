package programmerzamannow.spring.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
// belajar Life Cycle Annotation
@Slf4j
public class Server {
    @PostConstruct
    public void start(){
        log.info("Start Server");
    }
    @PreDestroy
    public void stop (){
        log.info("Stop Server");
    }
}
