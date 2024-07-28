package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    @Test
    void testApplicationContext() {
        org.springframework.context.ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // kita pastikan dia tidak null atau tidak error
        Assertions.assertNotNull(context);
    }
}
