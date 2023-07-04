package me.choicore.ddd.module.persistence.inmemory;

import me.choicore.ddd.module.Application;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = Application.class)
class SampleRepositoryTest {

    @Autowired
    SampleRepository sampleRepository;


    @Test
    @DisplayName("test")
    void test() throws Exception {
        // given
        sampleRepository.findById(1L);

        // when

        // then

    }

}