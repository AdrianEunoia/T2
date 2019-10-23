package Repaso3_GridLayOut;

import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Repaso3_GridLayOut.Ventana ventanaPrincipal = new Ventana();
                ventanaPrincipal.initGUI();
            }
        });
    }
}
