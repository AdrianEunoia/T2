package Repaso7_PracticaCompleta;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class Ventana extends JFrame implements ActionListener, ChangeListener, MouseListener {

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
    JMenu menuIr, menuCompuestos;
    JMenuItem itemPestania1, itemPestania2, itemPestania3, itemPestania4, itemPestania5, itemPestania6;
    JCheckBoxMenuItem itemCheck;
    JRadioButtonMenuItem itemRadio1, itemRadio2;
    ButtonGroup grupoBotones;
    JPopupMenu menuContextual;

    public void initGUI(){
        instancias();
        configurarContainer();
        this.setSize(new Dimension(800,800));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        configurarPopUp();
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
        menuCompuestos = new JMenu("Compuestos");
        itemPestania1 = new JMenuItem("Pestania1", KeyEvent.VK_1);
        itemPestania2 = new JMenuItem("Pestania2", KeyEvent.VK_2);
        itemPestania3 = new JMenuItem("Pestania3", KeyEvent.VK_3);
        itemPestania4 = new JMenuItem("Pestania4", KeyEvent.VK_4);
        itemPestania5 = new JMenuItem("Pestania5", KeyEvent.VK_5);
        itemPestania6 = new JMenuItem("Pestania6", KeyEvent.VK_6);
        itemCheck = new JCheckBoxMenuItem("Seleccionado", new ImageIcon("../recursos/switch_on.png"), false);
        itemRadio1 = new JRadioButtonMenuItem("Opcion 1", false);
        itemRadio2 = new JRadioButtonMenuItem("Opcion 2", false);
        grupoBotones = new ButtonGroup();
        grupoBotones.add(itemRadio1);
        grupoBotones.add(itemRadio2);
        menuContextual = new JPopupMenu();
    }
    private void configurarBarraMenu(){
        barraMenu.add(menuIr);
        menuIr.add(itemPestania1);
        menuIr.add(itemPestania2);
        menuIr.add(itemPestania3);
        menuIr.addSeparator();
        menuIr.add(itemPestania4);
        menuIr.add(itemPestania5);
        menuIr.add(itemPestania6);
        this.setJMenuBar(barraMenu);
        itemPestania1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.ALT_DOWN_MASK));
        itemPestania2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.ALT_DOWN_MASK));
        itemPestania3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.ALT_DOWN_MASK));
        itemPestania4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.ALT_DOWN_MASK));
        itemPestania5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, InputEvent.ALT_DOWN_MASK));
        itemPestania6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, InputEvent.ALT_DOWN_MASK));
        barraMenu.add(menuCompuestos);
        menuCompuestos.add(itemRadio1);
        menuCompuestos.add(itemRadio2);
        menuCompuestos.add(itemCheck);
    }
    private void configurarPopUp(){
        menuContextual.add(itemPestania1);
        menuContextual.add(itemPestania2);
        menuContextual.add(itemPestania3);
        menuContextual.add(itemPestania4);
        menuContextual.add(itemPestania5);
        menuContextual.add(itemPestania6);
    }
    private void acciones(){
        itemPestania1.addActionListener(this);
        itemPestania2.addActionListener(this);
        itemPestania3.addActionListener(this);
        itemPestania4.addActionListener(this);
        itemPestania5.addActionListener(this);
        itemPestania6.addActionListener(this);
        itemCheck.addChangeListener(this);
        menuContextual.addMouseListener();
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

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(itemCheck.isSelected());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}