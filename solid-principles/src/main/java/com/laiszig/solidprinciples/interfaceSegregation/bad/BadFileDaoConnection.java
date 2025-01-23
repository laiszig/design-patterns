package com.laiszig.solidprinciples.interfaceSegregation.bad;

public class BadFileDaoConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        // We can't open connection in a file system
        throw new UnsupportedOperationException("Open connection not supported.");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
