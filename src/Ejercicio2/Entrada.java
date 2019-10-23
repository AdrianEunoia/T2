package Ejercicio2;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaCorreo v = new VentanaCorreo();
                v.initGUI();
            }
        });
    }
}