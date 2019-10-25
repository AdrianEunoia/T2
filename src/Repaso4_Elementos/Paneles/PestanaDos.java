package Repaso4_Elementos.Paneles;

import javax.swing.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestanaDos extends JPanel implements ActionListener, ChangeListener {
    // Metodo para que este panel sea accesible
    JCheckBox cNormal, cUnoG, cDosG;
    ButtonGroup gChecks, gRadios;
    JRadioButton rUnoG, rDosG, rTresG;
    public PestanaDos(){
        initGUI();
    }
    public void initGUI(){
        instancias();
        configurarPanel();
        configurarImagen();
        acciones();
    }
    // Instancio
    private void instancias(){
        cNormal = new JCheckBox("Seleccionado", false);
        cUnoG = new JCheckBox("Opcion 1", false);
        cDosG = new JCheckBox("Opcion 2", true);
        // Grupo de checks
        gChecks = new ButtonGroup();
        gChecks.add(cUnoG);
        gChecks.add(cDosG);
        // Radio button y grupo de buttons
        rUnoG = new JRadioButton("Seleccionado",true);
        rDosG = new JRadioButton("Seleccionado",false);
        rTresG = new JRadioButton("Seleccionado",false);
        gRadios = new ButtonGroup();
        gRadios.add(rUnoG);
        gRadios.add(rDosG);
        gRadios.add(rTresG);
    }
    // Acciones
    private void acciones(){
        // Accionar el check
        cNormal.addChangeListener(this);
    }
    private void configurarPanel(){
        this.add(cNormal);
        this.add(cDosG);
        this.add(cUnoG);
        this.add(rUnoG);
        this.add(rDosG);
        this.add(rTresG);
    }
    private void configurarImagen(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==cNormal) {
            if(cNormal.isSelected()) {
                System.out.println("El elemmento está seleccionado");
                cDosG.setEnabled(true);
                cUnoG.setEnabled(true);
            }
            else {
                System.out.println("El elemmento no está seleccionado");
                cNormal.setText("Activado");
                cDosG.setEnabled(false);
                cUnoG.setEnabled(false);
            }
        }
    }
}