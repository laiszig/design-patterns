package com.laiszig.solidprinciples.interfaceSegregation.bad;

public class BadDBDaoConnection implements BadDAOInterface{


    @Override
    public void openConnection() {
        // Connection logic
    }

    @Override
    public void createRecord() {
        // Create record logic
    }

    @Override
    public void openFile() {
        // We are in the DB Connection so no need to support open file method
        throw new UnsupportedOperationException("Open file not supported.");
    }

    @Override
    public void deleteRecord() {
        // Delete record logic - this is fine for both
    }
}
