package com.opentrans.otms.jenkins

public class Modules {

    static def modules = [:]

    public static void register(String name, String module) {
        modules.put(name, module);
    }

    public static Map<String, String> getModules() {
        return modules;
    }
}