package com.laiszig.factory.OSFactory;

public class LinuxOS extends OperatingSystem{

    public LinuxOS(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
