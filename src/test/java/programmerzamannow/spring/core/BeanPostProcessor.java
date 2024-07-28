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

// belajar Bean Post Processor
public class BeanPostProcessor {
    @Configuration
    @Import({
            Car.class,
            IdGenerartorBeanPostProcessor.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext =  new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testCar() {
        // disini kita coba ambil car
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());

    }
}
