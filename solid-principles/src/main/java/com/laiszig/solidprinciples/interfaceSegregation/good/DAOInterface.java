package com.laiszig.solidprinciples.interfaceSegregation.good;

/**
 * Here we will include only the dao operations
 * And segregate connection and file parts so that only the necessary classes can implement them
 */
public interface DAOInterface {

    void createRecord();
    void deleteRecord();
}
