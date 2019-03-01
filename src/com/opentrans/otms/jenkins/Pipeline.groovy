package com.opentrans.otms.jenkins

public class Pipeline {

    static {
        System.out.println 'Loaded Pipeline'
    }

    public static void print() {
        echo 'Test print'
    }
}