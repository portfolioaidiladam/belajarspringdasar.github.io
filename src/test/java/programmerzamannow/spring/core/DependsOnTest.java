package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.util.AopTestUtils;
import programmerzamannow.spring.core.data.Foo;

// belajar Depends On
// Belajar Lazy Bean
public class DependsOnTest {
    private ApplicationContext applicationContext ;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        // gimana kalau kita coba access
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
