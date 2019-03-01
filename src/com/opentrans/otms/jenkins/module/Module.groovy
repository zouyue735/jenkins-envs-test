package com.opentrans.otms.jenkins.module

public abstract class Module {

    static {
        System.out.println("Loaded Module")
    }

    private Map<String, Option> requirements;

    public abstract void deploy()

    public <T extends Module> void addModule(Class<T> clazz, T module) {

    }
}