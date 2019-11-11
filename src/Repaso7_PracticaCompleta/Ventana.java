package Repaso7_PracticaCompleta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    Container container;
    // panel personalizado
    PestaniaUno pestaniaUno;
    PestaniaDos pestaniaDos;
    PestaniaTres pestaniaTres;
    PestaniaCuatro pestaniaCuatro;
    PestaniaCinco pestaniaCinco;
    PestaniaSeis pestaniaSeis;
    JTabbedPane panelPestanias;
    JMenuBar barraMenu;
    JMenu menuIr;
    JMenuItem itemPestania1, itemPestania2, itemPestania3, itemPestania4, itemPestania5, itemPestania6;

    public void initGUI(){
        instancias();
        configurarContainer();
        this.setSize(new Dimension(800,800));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        configurarBarraMenu();
        acciones();
    }
    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Botones",pestaniaUno);
        panelPestanias.addTab("Check y radios",pestaniaDos);
        panelPestanias.addTab("Textos",pestaniaTres);
        panelPestanias.addTab("TextosRespaso",pestaniaCuatro);
        panelPestanias.addTab("Elementos datos",pestaniaCinco);
        panelPestanias.addTab("Elementos lista",pestaniaSeis);
    }
    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaUno = new PestaniaUno();
        pestaniaDos = new PestaniaDos();
        pestaniaTres = new PestaniaTres();
        pestaniaCuatro = new PestaniaCuatro();
        pestaniaCinco = new PestaniaCinco();
        pestaniaSeis = new PestaniaSeis();
        barraMenu = new JMenuBar();
        menuIr = new JMenu("Ir a");
        itemPestania1 = new JMenuItem("Pestania1");
        itemPestania2 = new JMenuItem("Pestania2");
        itemPestania3 = new JMenuItem("Pestania3");
        itemPestania4 = new JMenuItem("Pestania4");
        itemPestania5 = new JMenuItem("Pestania5");
        itemPestania6 = new JMenuItem("Pestania6");
    }
    private void configurarBarraMenu(){
        barraMenu.add(menuIr);
        menuIr.add(itemPestania1);
        menuIr.add(itemPestania2);
        menuIr.add(itemPestania3);
        menuIr.add(itemPestania4);
        menuIr.add(itemPestania5);
        menuIr.add(itemPestania6);
        this.setJMenuBar(barraMenu);
    }
    private void acciones(){
        itemPestania1.addActionListener(this);
        itemPestania2.addActionListener(this);
        itemPestania3.addActionListener(this);
        itemPestania4.addActionListener(this);
        itemPestania5.addActionListener(this);
        itemPestania6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemPestania1){
            panelPestanias.setSelectedIndex(0);
        }else if(e.getSource() == itemPestania2){
            panelPestanias.setSelectedIndex(1);
        }else if(e.getSource() == itemPestania3){
            panelPestanias.setSelectedIndex(2);
        }else if(e.getSource() == itemPestania4){
            panelPestanias.setSelectedIndex(3);
        }else if(e.getSource() == itemPestania5){
            panelPestanias.setSelectedIndex(4);
        }else if(e.getSource() == itemPestania6){
            panelPestanias.setSelectedIndex(5);
        }
    }
}