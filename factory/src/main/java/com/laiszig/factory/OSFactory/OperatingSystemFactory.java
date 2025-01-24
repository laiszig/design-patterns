package com.laiszig.factory.OSFactory;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOS(version, architecture);
            case "LINUX":
                return new LinuxOS(version, architecture);
            default:
                throw new IllegalArgumentException("OS not supported");
        }
    }
}
