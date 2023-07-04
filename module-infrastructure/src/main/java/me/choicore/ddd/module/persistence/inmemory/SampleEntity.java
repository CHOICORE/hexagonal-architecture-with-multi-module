package me.choicore.ddd.module.persistence.inmemory;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class SampleEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public SampleEntity(final String name) {
        this.name = name;
    }

}
