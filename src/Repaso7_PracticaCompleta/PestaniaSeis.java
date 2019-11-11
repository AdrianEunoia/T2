package Repaso7_PracticaCompleta;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PestaniaSeis extends JPanel implements ActionListener, ListSelectionListener{
    // Var elementos
    JButton botonAgregar, botonRellenar, botonObtener;
    JPanel pSuperior, pInferior, pCentro;
    JList listaNormal;
    DefaultListModel modeloLista;
    ListSelectionModel modeloSeleccionLista;
    ArrayList <Persona> listaPersonas;

    public PestaniaSeis() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
        rellenarLista();
        configurarJList();
    }
    private void acciones() {
        botonAgregar.addActionListener(this);
        botonRellenar.addActionListener(this);
        botonObtener.addActionListener(this);
        listaNormal.addListSelectionListener(this);
        modeloSeleccionLista.addListSelectionListener(this);
    }
    private JPanel confifurarSuperior(){
        pSuperior.add(botonAgregar);
        pSuperior.add(botonRellenar);
        return  pSuperior;
    }
    private JPanel configurarInferior() {
        pInferior.add(botonObtener);
        return pInferior;
    }
    private void configurarPanel() {
        this.setLayout(new BorderLayout());
        this.add(confifurarSuperior(), BorderLayout.NORTH);
        this.add(configurarInferior(), BorderLayout.SOUTH);
        this.add(new JScrollPane(listaNormal), BorderLayout.CENTER);
    }
    private void configurarJList(){
        listaNormal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void instancias() {
        botonAgregar = new JButton("Agregar elemento");
        botonRellenar = new JButton("Rellenar lista");
        botonObtener = new JButton("Obtener lista");
        pSuperior = new JPanel();
        pInferior = new JPanel();
        pCentro = new JPanel();
        modeloLista = new DefaultListModel();
        listaNormal = new JList(modeloLista);
        listaPersonas = new ArrayList();
        modeloSeleccionLista = listaNormal.getSelectionModel();
    }
    private void rellenarLista(){
        listaPersonas.add(new Persona("Adrian","Garcia",692398646,12,true));
    }
    // Listener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregar){
            System.out.println("Agregando");
            modeloLista.addElement("Elemento");
        }else if(e.getSource() == botonRellenar){
            if (!listaPersonas.isEmpty()) {
                for (Persona encontrada : listaPersonas) {
                    modeloLista.addElement(encontrada);
                }
            }
        }else if(e.getSource() == botonObtener){
            System.out.println("Buscando...");
            Persona encontrada = (Persona) modeloLista.getElementAt(listaNormal.getSelectedIndex());
            System.out.println(encontrada.getApellido());
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()){
            Persona encontrada = (Persona) modeloLista.getElementAt(listaNormal.getSelectedIndex());
            System.out.println(encontrada.getApellido());
        }

    }
}