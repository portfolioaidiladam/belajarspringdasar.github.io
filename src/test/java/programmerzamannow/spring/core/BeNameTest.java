package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Foo;
// Belajar Mengubah nama bean
public class BeNameTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeName() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class);
        Foo fooSecound = applicationContext.getBean("fooSecound", Foo.class);

        Assertions.assertSame(foo, fooFirst);
        Assertions.assertNotSame(foo, fooSecound);
        Assertions.assertNotSame(fooFirst, fooSecound);
    }
}
