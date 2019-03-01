package com.opentrans.otms.jenkins

import java.util.Map

public class Modules {

    private static Modules instance = new Modules();

    private Map modules = [:];

    public static void register(String name, String module) {
        instance.modules.put(name, module);
    }

    public static Map getModules() {
        return instance.modules;
    }
}