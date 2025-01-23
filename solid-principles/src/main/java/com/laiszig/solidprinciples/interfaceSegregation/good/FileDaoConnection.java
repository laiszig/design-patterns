package com.laiszig.solidprinciples.interfaceSegregation.good;

/**
 * Implements only what is actually being used by this class
 * We don't have to deal wth the db operations, since the interfaces are now segregated
 */
public class FileDaoConnection implements FileInterface, DAOInterface{

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
