package com.opentrans.otms.jenkins

import java.util.Map

public class Modules {
    private static Modules instance
        
    private static Modules getInstance() { 
        if (!instance) instance = new Modules()
        return instance
    }

    private Map modules = [:];

    public static void register(String name, String module) {
        getInstance().modules.put(name, module);
    }

    public static Map getModules() {
        return getInstance().modules;
    }
}