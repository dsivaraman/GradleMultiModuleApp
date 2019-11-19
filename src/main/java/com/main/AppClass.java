package com.main;

import com.controller.ControllerClass;
import com.services.ServicesClass;

public class AppClass {
    public static void main(String[] args) {
        System.out.println("I am root app...");
        ControllerClass controllerClass = new ControllerClass();
        ServicesClass servicesClass = new ServicesClass();

        controllerClass.showController();
        controllerClass.showRepository();
        servicesClass.showService();
    }
}
