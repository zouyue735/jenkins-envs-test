package com.opentrans.otms.jenkins

public class Modules {

    private static Map<String, String> modules = new HashMap<>();

    public static void register(String name, String module) {
        modules.put(name, module);
    }

    public static Map<String, String> getModules() {
        return modules;
    }
}