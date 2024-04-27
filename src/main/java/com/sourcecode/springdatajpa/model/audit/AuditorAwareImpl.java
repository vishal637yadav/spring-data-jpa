package com.sourcecode.springdatajpa.model.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl  implements AuditorAware<String> {

    //Here in this method we can check the Authenticity of current user
    //and return its name or id

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Checker User");
    }


}
