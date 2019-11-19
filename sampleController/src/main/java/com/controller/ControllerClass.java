package com.controller;

import com.repository.RepositoryClass;

public class ControllerClass {

    public void showController() {
        System.out.println("I am Controller class...");
    }

    public void showRepository() {
        RepositoryClass repositoryClass = new RepositoryClass();
        repositoryClass.showRepository();
    }
}
