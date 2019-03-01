package com.opentrans.otms.jenkins

import java.util.Map

public class Modules {

    private static Map modules = [:]

    public static void register(String name, String module) {
        modules.put(name, module);
    }

    public static Map getModules() {
        return modules;
    }
}