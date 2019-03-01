package com.opentrans.otms.jenkins

class Pipeline {

    static {
        Modules.register("Pipeline", "Pipeline");
    }

    static void print() {
        echo 'Test print'
    }
}