package Ejercicio1;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.initGUI();
            }
        });

    }
}