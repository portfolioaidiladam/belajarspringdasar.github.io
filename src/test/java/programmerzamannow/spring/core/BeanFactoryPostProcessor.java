package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.processor.FooBeanFactoryPostProcessor;

// Belajar Bean Factory Post Processor
public class BeanFactoryPostProcessor {
    @Configuration
    @Import(FooBeanFactoryPostProcessor.class)
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext =  new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessor() {
        Foo foo = applicationContext.getBean(Foo.class);
        // kita pastikan, karena kita registrasikan secara programmatik menggunkan bean factory post processor
        Assertions.assertNotNull(foo);
    }
}
