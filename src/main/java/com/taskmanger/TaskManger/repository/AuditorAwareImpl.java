package com.taskmanger.TaskManger.repository;

/**
 * Created by satis on 5/20/2021
 */
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor(){
        return Optional.of("Admin");
    }
}
