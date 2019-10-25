package Repaso4_Elementos.Paneles;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestanaUno extends JPanel implements ActionListener, ChangeListener {
    JButton bNormal;
    JButton bImagen;
    JToggleButton tImagen;
    // Metodo para que este panel sea accesible
    public PestanaUno(){
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
        bNormal = new JButton("Pulsar");
        bImagen = new JButton();
        tImagen = new JToggleButton("Activado",false);
    }
    // Acciones
    private void acciones(){
        bNormal.addActionListener(this);
        tImagen.addChangeListener(this);
    }
    private void configurarPanel(){
        this.add(bNormal);
        this.add(bImagen);
        this.add(tImagen);
    }
    private void configurarImagen(){
        // Tipos de iconos
        bImagen.setIcon(new ImageIcon("src/Repaso4_Elementos/Recursos/button_ok.png"));
        bImagen.setPressedIcon(new ImageIcon("src/Repaso4_Elementos/Recursos/button_cancel.png"));
        bImagen.setRolloverIcon(new ImageIcon("src/Repaso4_Elementos/Recursos/dices.png"));
        tImagen.setIcon(new ImageIcon("src/Repaso4_Elementos/Recursos/switch_on.png"));
        tImagen.setSelectedIcon(new ImageIcon("src/Repaso4_Elementos/Recursos/switch_off.png"));
        tImagen.setBackground(null);
        tImagen.setBorderPainted(false);
        tImagen.setFocusPainted(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bNormal){
            System.out.println("Boton pulsado");
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==tImagen) {
            if(tImagen.isSelected()) {
                System.out.println("El elemmento está seleccionado");
                tImagen.setText("Desactivado");
            }
            else {
                System.out.println("El elemmento no está seleccionado");
                tImagen.setText("Activado");
            }
        }
    }
}