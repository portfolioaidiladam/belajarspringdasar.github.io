package programmerzamannow.spring.core;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.service.MerchanServiceImpl;
import programmerzamannow.spring.core.service.MerchantService;

// belajar Inheritance
public class InheritanceTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritanc() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchanServiceImpl merchanServiceImpl = applicationContext.getBean(MerchanServiceImpl.class);

        Assertions.assertSame(merchantService,merchanServiceImpl);
    }
}
