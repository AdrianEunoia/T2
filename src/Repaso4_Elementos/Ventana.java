package Repaso4_Elementos;

import Repaso4_Elementos.Paneles.PestanaDos;
import Repaso4_Elementos.Paneles.PestanaUno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    // Declaramos variables de los elementos
    Container container;
    // Paneles externos
    PestanaUno pestanaUno;
    PestanaDos pestanaDos;
    // Panel de pestañas
    JTabbedPane panelPestanas;

    // Iniciamos interfaz grafica
    public void initGUI() {
        setTitle("Proyecto elementos");
        setSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        instancias();
        configurarContainer();
    }

    // Instancia
    private void instancias() {
        container = getContentPane();
        pestanaUno = new PestanaUno();
        pestanaDos = new PestanaDos();
        // Para meter pestañas
        panelPestanas = new JTabbedPane(SwingConstants.TOP);
    }

    // Configurar container
    private void configurarContainer(){
        // Añadir pestaña
        container.add(panelPestanas);
        // Configurar pestaña
        panelPestanas.addTab("Botones",pestanaUno);
        panelPestanas.addTab("Checks",pestanaDos);
    }
}
