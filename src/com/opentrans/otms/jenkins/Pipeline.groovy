package com.opentrans.otms.jenkins

public class Pipeline {

    static {
        script {
            echo 'Loaded Pipeline'
        }
    }

    public static void print() {
        echo 'Test print'
    }
}