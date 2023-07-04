package me.choicore.ddd.module.domain;

import me.choicore.ddd.module.domain.usecase.Usecase;

public class Service implements Usecase {
    @Override
    public String getUsecaseName() {
        return "Service";
    }
}
