package Repaso5_Examen;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    Container container;
    public void initGUI(){
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        instancias();
        configurarGridBagLayout();
    }
    private void instancias(){
        container = this.getContentPane();
    }
    private void configurarGridBagLayout(){
        // El container se guiara mediante ese tipo de layout
        container.setLayout(new GridBagLayout());
        // Las restricciones que le vas a dar al container (constrainst)
        GridBagConstraints constraints = new GridBagConstraints();
        // Le damos valores POS 0 0
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0;
        constraints.weighty = 0;
            // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.HORIZONTAL;
            // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
            // Pesos
        constraints.weightx = 0;
        constraints.weighty = 0;
        container.add(new JButton("Posicion 0 0"),constraints);
        // Le damos valores POS 1 0
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0;
        constraints.weighty = 0;
            // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.HORIZONTAL;
            // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
            // Pesos
        constraints.weightx = 0;
        constraints.weighty = 0;
        container.add(new JButton("Posicion 0 1"),constraints);
        // Le damos valores POS 0 1
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.HORIZONTAL;
        // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
        // Pesos
        constraints.weightx = 0;
        constraints.weighty = 0;
        container.add(new JButton("Posicion 0 1"),constraints);
        // Le damos valores POS 0 1
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.HORIZONTAL;
        // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
        // Pesos
        constraints.weightx = 0;
        constraints.weighty = 0;
        container.add(new JButton("Posicion 0 1"),constraints);
        // Le damos valores POS 0 1
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.gridheight = 2;
        constraints.weightx = 0;
        constraints.weighty = 1;
        // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.BOTH;
        // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
        // Pesos
        container.add(new JButton("Posicion 0 1"),constraints);
        // Le damos valores POS 0 1
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0;
        constraints.weighty = 0;
        // Para decir hacia donde se rellena al estirar
        constraints.fill = GridBagConstraints.HORIZONTAL;
        // Para alinear las cosas de las celdas
        constraints.anchor = GridBagConstraints.CENTER;
        // Pesos
        constraints.weightx = 0;
        constraints.weighty = 0;
        container.add(new JButton("Posicion 0 1"),constraints);
    }
}
