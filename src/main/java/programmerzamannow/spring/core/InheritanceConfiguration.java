package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.service.MerchanServiceImpl;
// belajar Inheritance

@Configuration
@Import(MerchanServiceImpl.class)
public class InheritanceConfiguration {

}
