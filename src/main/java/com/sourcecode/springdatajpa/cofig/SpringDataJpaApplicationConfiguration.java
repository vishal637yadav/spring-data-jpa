package com.sourcecode.springdatajpa.cofig;

import com.sourcecode.springdatajpa.model.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class SpringDataJpaApplicationConfiguration {

    @Bean
    public AuditorAware<String> getAuditAware(){
        return new AuditorAwareImpl();
    }
}
