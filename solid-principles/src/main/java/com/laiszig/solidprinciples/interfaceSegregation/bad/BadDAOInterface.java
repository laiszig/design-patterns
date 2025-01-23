package com.laiszig.solidprinciples.interfaceSegregation.bad;

/**
 * This interface is designed to support data access using a file system
 * or a database system.
 * We have here methods to be used by both types of access.
 * The interface is being implemented by concrete classes,
 * we have a violation of the interface segregation principle, since we are
 * accommodating all operations in a single interface/
 */
public interface BadDAOInterface {

    void openConnection();
    void createRecord();
    void openFile();
    void deleteRecord();
}
