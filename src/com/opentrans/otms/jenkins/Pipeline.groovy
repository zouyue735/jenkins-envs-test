package com.opentrans.otms.jenkins

public class Pipeline {

    static {
        Modules.register("Pipeline", "Pipeline");
    }

    public static void print() {
        echo 'Test print'
    }
}