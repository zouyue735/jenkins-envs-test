package com.opentrans.otms.jenkins

class Modules {
    static def modules = [:]

    static void register(String name, String module) {
        modules.put(name, module)
    }
}