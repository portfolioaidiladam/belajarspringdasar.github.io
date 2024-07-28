package programmerzamannow.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Connection;
import programmerzamannow.spring.core.data.Server;

// belajar LifeCycle
public class LifeCycleTest {
    private ConfigurableApplicationContext applicationContext ;

    @BeforeEach
    void setUp() {
       applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
       //untuk shutdown bisa pakai ini
       applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // untuk shutdown bisa pakai ini
       // applicationContext.close();
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

    // belajar Life Cycle Annotation
    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}
