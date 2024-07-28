package programmerzamannow.spring.core.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.EventListenerTest;
import programmerzamannow.spring.core.data.Foo;

// belajar Startup failure

public class WithoutSpringBootTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFoo() {
        Foo foo = applicationContext.getBean(Foo.class);
        // kita cek errornya seperti apa
    }
}
