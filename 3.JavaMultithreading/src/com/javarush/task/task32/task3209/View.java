package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dmitry Shelemekh on 06.12.2017.
 */

public class View extends JFrame implements ActionListener {

    private Controller controller;

    public void init() {

    }

    public void exit(){
        controller.exit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}