package programmerzamannow.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.aware.IdAware;

import java.util.UUID;

// belajar Bean Post Processor
@Slf4j
@Component
public class IdGenerartorBeanPostProcessor implements BeanPostProcessor, Ordered {
    // Belajar Ordered tambahkan di implementsnya Ordered
    @Override
    public int getOrder() {
        // ingin jadi yang pertama
        return 1;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    // disini kita cek dulu bila idnya merupakan turunan dari Idware maka kita konfersi menjadi Idware lalu kita set
        // idnya jadi UUI
        log.info("Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware){
            log.info("Set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
