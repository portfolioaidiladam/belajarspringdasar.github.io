package programmerzamannow.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.aware.IdAware;

// belajar Bean Post Processor
@Slf4j
@Component
public class PrefixIdGenerartorBeanPostProcessor implements BeanPostProcessor, Ordered {
    // Belajar Ordered tambahkan di implementsnya Ordered
    @Override
    public int getOrder() {
        // ingin jadi no.2
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    // disini kita cek dulu bila idnya merupakan turunan dari Idware maka kita konfersi menjadi Idware lalu kita set
        // idnya jadi UUI
        log.info("Prefix Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware){
            log.info("Prefix Set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-" + idAware.getId());
        }
        return bean;
    }
}
