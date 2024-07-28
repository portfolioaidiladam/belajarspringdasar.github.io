package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.scope.DoubletonScope;

// Belajar Scope
@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create New Foo" );
        return new Foo();
    }
// belajar membuat scope
    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }
    @Bean
    @Scope ("doubleton")
    public Bar bar(){
        log.info("Create New Bar ");
        return new Bar();
    }
}



