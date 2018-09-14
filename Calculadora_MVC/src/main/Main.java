
package main;

import model.ModelCalcu;
import controller.ControllerCalcul;
import view.ViewCalcu;

public class Main {
    private static ModelCalcu model;
    private static ViewCalcu view;
    private static ControllerCalcul controller;
    
    public static void main(String[] args){
        view = new ViewCalcu();
        model = new ModelCalcu();
        controller = new ControllerCalcul(model, view);
    } 
}
