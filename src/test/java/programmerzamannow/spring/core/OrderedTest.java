package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.data.Car;
import programmerzamannow.spring.core.processor.IdGenerartorBeanPostProcessor;
import programmerzamannow.spring.core.processor.PrefixIdGenerartorBeanPostProcessor;

// belajar Ordered
public class OrderedTest {

    @Configuration
    @Import({
            Car.class,
            IdGenerartorBeanPostProcessor.class,
            PrefixIdGenerartorBeanPostProcessor.class
    })
    public static class TestConfiguration {

    }

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void tesCar() {
        Car car = applicationContext.getBean(Car.class);
        // get IDnya gak boleh null
        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PZN-"));

    }
}
