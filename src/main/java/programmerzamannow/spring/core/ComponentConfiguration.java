package programmerzamannow.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.data.MultiFoo;

// belajar Component
// belajar Constructor-based Dependency Injection
// belajar Setter-based Dependency Injection
// belajar Field-based Dependency Injection
// belajar Qualifier
// belajar Object Provider
@Configuration
@ComponentScan(basePackages = {
        "programmerzamannow.spring.core.repository",
        "programmerzamannow.spring.core.service",
        "programmerzamannow.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
