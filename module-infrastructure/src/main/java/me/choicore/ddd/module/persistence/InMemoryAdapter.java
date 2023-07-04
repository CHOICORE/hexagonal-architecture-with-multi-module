package me.choicore.ddd.module.persistence;

import lombok.RequiredArgsConstructor;
import me.choicore.ddd.module.domain.OutPort;
import me.choicore.ddd.module.persistence.inmemory.SampleRepository;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class InMemoryAdapter implements OutPort {

    private final SampleRepository sampleRepository;

    @Override
    public Object findById(final Long id) {


        return sampleRepository.findById(id);


    }


}


