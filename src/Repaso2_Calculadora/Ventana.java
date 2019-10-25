package Repaso2_Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    // Declaro contenedor
    Container container;
    // Declaro las variables de todos los botones
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, bSuma, bResta, bMultiplicacion, bDivision, bIgual, bAC, bCienti,bLog,bCos,bSen,bTag;
    // Texto input
    JTextField pantalla, pantalla2;
    // Paneles
    JPanel superior, central, derecha,centralCientifica,panelIzquierda;
    // Variables bandera, operacion, tipo de operacion
    boolean operando = false;
    int op1, op2;
    int tipoOperacion;
    double resultadoDoble;
    boolean flagNoCientifica = false;

    // Instanciar interfaz grafica
    public void initGUI() {
        instancias();
        configurarContainer();
        setSize(new Dimension(300, 370));
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);
    }
    // Meotodo configurar partes del contenedor
    private void configurarContainer() {
        container.add(configurarDerecha(), BorderLayout.EAST);
        container.add(configurarSuperior(), BorderLayout.NORTH);
        container.add(configurarCentro(), BorderLayout.CENTER);
        container.add(configIzquierda(), BorderLayout.WEST);
    }
    // Configurar primer parte del contenedor
    private JPanel configurarCentro() {
        // Configurar layout
        central.setLayout(new GridLayout(4, 3, 0, 0));
        // Botones
        //central.add(bAC);
        central.add(b1);
        central.add(b2);
        central.add(b3);
        central.add(b4);
        central.add(b5);
        central.add(b6);
        central.add(b7);
        central.add(b8);
        central.add(b9);
        central.add(b0);
        central.add(bAC);
        central.add(bIgual);
        return central;
    }
    // Configurar segunda parte del contenedor
    private JPanel configurarSuperior() {
        superior.setLayout(new BorderLayout());
        // Asignar tamaño de ventana de texto
        pantalla.setPreferredSize(new Dimension(100,100));
        pantalla2.setPreferredSize(new Dimension(100,100));
        superior.add(pantalla, BorderLayout.SOUTH);
        superior.add(pantalla2, BorderLayout.NORTH);
        return superior;
    }
    private JPanel configurarDerecha() {
        derecha.setLayout(new GridLayout(5, 1, 0, 0));
        // Botones
        derecha.add(bSuma);
        derecha.add(bSuma);
        derecha.add(bResta);
        derecha.add(bMultiplicacion);
        derecha.add(bDivision);
        derecha.add(bCienti);
        return derecha;
    }
    private JPanel configIzquierda() {
        // Por defecto tiene flowlayout
        panelIzquierda.setPreferredSize(new Dimension(100,50));
        panelIzquierda.setLayout(new GridLayout(4, 1, 0, 0));
        panelIzquierda.add(bLog);
        panelIzquierda.add(bCos);
        panelIzquierda.add(bSen);
        panelIzquierda.add(bTag);
        return panelIzquierda;
    }
    // Acciones, en este caso recorro todos los componentes del panel central
    private void acciones() {
        Component[] componentes = central.getComponents();
        for (Component item : componentes) {
            ((JButton) item).addActionListener(this);
        }
        Component[] operaciones = derecha.getComponents();
        for (Component item : operaciones) {
            ((JButton) item).addActionListener(this);
        }
        Component[] cientificos = panelIzquierda.getComponents();
        for (Component item : cientificos) {
            ((JButton) item).addActionListener(this);
        }
    }
    // Instanciamos todos los botones, les damos valor
    private void instancias() {
        bAC = new JButton("C");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bSuma = new JButton("+");
        bResta = new JButton("-");
        bMultiplicacion = new JButton("x");
        bDivision = new JButton("/");
        bIgual = new JButton("=");
        bCienti = new JButton("C/N");
        pantalla = new JTextField();
        pantalla2 = new JTextField();
        container = this.getContentPane();
        central = new JPanel();
        superior = new JPanel();
        derecha = new JPanel();
        bLog = new JButton("Ln");
        bCos = new JButton("COS");
        bTag = new JButton("TAG");
        bSen = new JButton("SEN");
        // Panel cientifica
        panelIzquierda = new JPanel();
    }
    // Action perfomed definimos qué hace cada boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "1");
            }
            else
                pantalla.setText("1");

        } else if (e.getSource() == b2) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "2");
            }
            else
                pantalla.setText("2");
        } else if (e.getSource() == b3) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "3");
            }
            else
                pantalla.setText("3");
        } else if (e.getSource() == b4) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "4");
            }
            else
                pantalla.setText("4");
        } else if (e.getSource() == b5) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "5");
            }
            else
                pantalla.setText("5");
        } else if (e.getSource() == b6) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "6");
            }
            else
                pantalla.setText("6");
        } else if (e.getSource() == b7) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "7");
            }
            else
                pantalla.setText("7");
        } else if (e.getSource() == b8) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "8");
            }
            else
                pantalla.setText("8");
        } else if (e.getSource() == b9) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "9");
            }
            else
                pantalla.setText("9");
        } else if (e.getSource() == b0) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "0");
            }
            else{
                pantalla.setText("0");
            }
        } else if (e.getSource() == bAC) {
                pantalla.setText("");
                pantalla2.setText("");
        } else if (e.getSource() == bSuma) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 1;
        } else if (e.getSource() == bResta) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 2;
        } else if (e.getSource() == bMultiplicacion) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 3;
        } else if (e.getSource() == bDivision) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 4;
        }else if (e.getSource() == bCos) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            String formateoCos = String.format("%s (%d)","COS",op1);
            pantalla2.setText(formateoCos);
            tipoOperacion = 5;
        }else if (e.getSource() == bSen) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            String formateoCos = String.format("%s (%d)","SEN",op1);
            pantalla2.setText(formateoCos);
            tipoOperacion = 6;
        }else if (e.getSource() == bTag) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            String formateoCos = String.format("%s (%d)","TAG",op1);
            pantalla2.setText(formateoCos);
            tipoOperacion = 7;
        }else if (e.getSource() == bLog) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            String formateoCos = String.format("%s (%d)","LOG10",op1);
            pantalla2.setText(formateoCos);
            tipoOperacion = 8;
        } else if (e.getSource() == bCienti) {
          // Desplegar panel cientifica
            if (panelIzquierda.isShowing()) {
                container.remove(panelIzquierda);
            } else {
                container.add(panelIzquierda, BorderLayout.WEST);
            }
            pack();
        }else if (e.getSource() == bIgual) {
            operando=false;
            op2 = Integer.valueOf(pantalla.getText());
            int resultado=0;
            switch (tipoOperacion){
                case 1:
                    resultado = op1+op2;
                    flagNoCientifica = true;
                    break;
                case 2:
                    resultado = op1-op2;
                    flagNoCientifica = true;
                    break;
                case 3:
                    resultado = op1*op2;
                    flagNoCientifica = true;
                    break;
                case 4:
                    resultado = op1/op2;
                    flagNoCientifica = true;
                    break;
                case 5:
                    double introDoble = op1;
                    resultadoDoble=Math.cos(introDoble);
                    break;
                case 6:
                    introDoble = op1;
                    resultadoDoble=Math.sin(introDoble);
                    break;
                case 7:
                    introDoble = op1;
                    resultadoDoble=Math.tan(introDoble);
                    break;
                case 8:
                    introDoble = op1;
                    resultadoDoble=Math.log10(introDoble);
                    break;
            }if(flagNoCientifica){
                pantalla2.setText(Integer.toString(resultado));
                pantalla.setText("");
            }else{
                pantalla2.setText(String.valueOf(resultadoDoble));
                pantalla.setText("");
            }
        }
    }
}