package Practica1_Email;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v = new Ventana();
                v.initGUI();
            }
        });
    }
}