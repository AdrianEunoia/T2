package Practica2_Datos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    // Var elementos
    Container container;
    CardLayout cardLayout;
    JPanel panelNorte, panelSur, panelCentro;
    JButton botonIr, botonBuscar;
    JPanel panelCentroIr, panelCentroBuscar;
    JButton botonAñadir;
    JLabel nombre, dni, notadi, notapmdm, notapsp, notaad;
    JTextField nombreT, dniT;
    JSpinner notadiT, notapmdmT, notapspT, notaadT;
    SpinnerNumberModel modeloSpinnerNumerico;

    // InitGUI
    public void initGUI() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        instancias();
        acciones();
        configurarContainer();
        this.setBounds(50, 50, 500, 500);
    }
    // Instancias
    public void instancias(){
        modeloSpinnerNumerico = new SpinnerNumberModel(0,0,10,1);
        container = this.getContentPane();
        panelNorte = new JPanel();
        panelSur = new JPanel();
        panelCentro = new JPanel();
        cardLayout = new CardLayout();
        botonIr = new JButton("Ir a registro");
        botonBuscar = new JButton("Ir a buscar");
        panelCentroBuscar = new JPanel();
        panelCentroIr = new JPanel();
        botonAñadir.setIcon(new ImageIcon(getClass().getResource("/recursos/switch_on.png")));
        nombre = new JLabel("Nombre");
        nombreT = new JTextField("",10);
        dni = new JLabel("DNI");
        dniT = new JTextField("",10);
        notadi = new JLabel("Nota DI");
        notadiT = new JSpinner(modeloSpinnerNumerico);
        notapmdm = new JLabel("Nota PMDM");
        notapmdmT = new JSpinner(modeloSpinnerNumerico);
        notapsp = new JLabel("Nota PSP");
        notapspT = new JSpinner(modeloSpinnerNumerico);
        notaad = new JLabel("Nota AD");
        notaadT = new JSpinner(modeloSpinnerNumerico);
    }
    // Acciones
    private void acciones() {
        botonBuscar.addActionListener(this);
        botonIr.addActionListener(this);
        botonAñadir.addActionListener(this);
    }
    // Configurar container
    private void configurarContainer() {
        container.add(configSuperior(), BorderLayout.NORTH);
        container.add(configInferior(), BorderLayout.SOUTH);
        container.add(configurarCentro(), BorderLayout.CENTER);
    }
    // Configurar paneles
    private JPanel configSuperior(){
        panelNorte.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        panelNorte.add(botonIr);
        panelNorte.add(botonBuscar);
        return  panelNorte;
    }
    private JPanel configInferior(){
        return  panelSur;
    }
    private JPanel configurarCentro(){
        panelCentro.setLayout(cardLayout);
        panelCentro.add(configurarCentroBuscar(), Constantes.TAG_P1);
        panelCentro.add(configurarCentroIr(), Constantes.TAG_P2);
        return  panelCentro;
    }
    // Configurar paneles centro
    private JPanel configurarCentroIr(){
        setLayout(new GridLayout(6,2,10,0));
        panelCentroIr.add(nombre);
        panelCentroIr.add(dni);
        panelCentroIr.add(dniT);
        panelCentroIr.add(nombreT);
        panelCentroIr.add(notadi);
        panelCentroIr.add(notadiT);
        panelCentroIr.add(notapmdm);
        panelCentroIr.add(notapmdmT);
        panelCentroIr.add(notapsp);
        panelCentroIr.add(notapspT);
        panelCentroIr.add(notapsp);
        panelCentroIr.add(notapspT);
        return panelCentroIr;
    }
    private JPanel configurarCentroBuscar(){
        panelCentroBuscar.add(botonAñadir);
        return panelCentroBuscar;
    }

    // Action
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonBuscar){
            System.out.println("Boton buscar");
            cardLayout.show(panelCentro,Constantes.TAG_P1);
        }else if(e.getSource() == botonIr) {
            System.out.println("Boton ir");
            cardLayout.show(panelCentro, Constantes.TAG_P2);
        }else if(e.getSource() == botonAñadir){
            System.out.println("Panel 1");
        }
    }
}
// Acciones