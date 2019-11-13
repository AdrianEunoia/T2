/*package Practica1_Email;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Ventana extends JFrame implements ActionListener {
    // Var elementos
    JLabel etiquetaPara, etiquetaCC, etiquetaCO, etiquetaArchivo, etiquetaPath, etiquetaTexto, etiquetaAsunto;
    JTextField txtPara, txtCO, txtCC, txtAsunto;
    JTextArea txtTexto;
    JButton btnEnviar, btnBorrar, btnArchivo;
    JPanel panelBotones;
    Container container;
    Properties properties;
    Session session;
    // InitGUI
    public void initGUI() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 500, 500);
        setVisible(true);
        instancias();
        configurarContainer();
        pack();
        acciones();
    }
    // Acciones
    private void acciones() {
        btnBorrar.addActionListener(this);
        btnEnviar.addActionListener(this);
    }
    // Metodo constraint gridbaglayout
    public void configurarConstraint(int posX, int posY,int fill, int anchor
            ,double pesX, double pesY, int tamX, int tamY, JComponent component){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = posX;
        constraints.gridy = posY;
        constraints.fill = fill ;
        constraints.anchor= anchor;
        constraints.weightx = pesX;
        constraints.weighty = pesY;
        constraints.gridwidth= tamX;
        constraints.gridheight= tamY;
        container.add(component,constraints);
    }
    // Configurar constraint gridbaglayout
    private void configurarContainer() {
        // Pongo layout que quiero en el panel o contenedor que me interesa
        container.setLayout(new GridBagLayout());
        // Fila 0 Columna 0
        configurarConstraint(0,0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0,0,1,1,etiquetaPara);
        // Fila 0 Columna 1
        configurarConstraint(1,0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0,3,1,txtPara);
        // Fila 1 Columna 0
        configurarConstraint(0,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0,0, 1,1,etiquetaCC);
        // Fila 1 Columna 1
        configurarConstraint(1,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0,1,1,txtCC);
        // Fila 1 Columno 2
        configurarConstraint(2,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0,1,1,etiquetaCO);
        // Fila 1 Columna 3
        configurarConstraint(3,1,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.8,0,1,1,txtCO);
        // Fila 2 Columna 0
        configurarConstraint(0,2,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0,0, 1,1,etiquetaArchivo);
        // Fila 2 Columna 1
        configurarConstraint(1,2,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0, 1,1,btnArchivo);
        // Fila 2 Columna 2
        configurarConstraint(2,2,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0, 1,1,etiquetaPath);
        // Fila 0 Columna 3
        configurarConstraint(0,3,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0,0, 1,1,etiquetaAsunto);
        // Fila 1 Columna 3
        configurarConstraint(1,3,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,0.2,0,3,1, txtAsunto);
        // Fila 0 Columna 4
        configurarConstraint(0,4,GridBagConstraints.HORIZONTAL,GridBagConstraints.NORTH,0,0, 1,1,etiquetaTexto);
        // Fila 1 Columna 4
        configurarConstraint(1,4,GridBagConstraints.BOTH,GridBagConstraints.CENTER,0.2,1, 3,1,new JScrollPane(txtTexto));
        configurarConstraint(0,5, GridBagConstraints.BOTH,GridBagConstraints.CENTER,1,0,4,1,panelBotones);
    }
    // Instancias
    private void instancias() {
        etiquetaAsunto = new JLabel("Asunto");
        etiquetaPara = new JLabel("Para");
        etiquetaCC = new JLabel("CC");
        etiquetaCO = new JLabel("CO");
        etiquetaArchivo = new JLabel("Archivo");
        etiquetaPath = new JLabel("");
        etiquetaTexto = new JLabel("Text");
        txtAsunto = new JTextField();
        txtCC = new JTextField();
        txtCO = new JTextField();
        txtPara = new JTextField();
        txtTexto = new JTextArea();
        btnBorrar = new JButton("Borrar");
        btnEnviar = new JButton("Enviar");
        btnArchivo = new JButton("Adjuntar...");
        container = getContentPane();
        panelBotones = new JPanel();
        panelBotones.add(btnEnviar);
        panelBotones.add(btnBorrar);
    }
    // Metodo limpiar
    public void vaciarCampos(){
        txtTexto.setText("");
        txtPara.setText("");
        txtCO.setText("");
        txtCC.setText("");
        txtAsunto.setText("");
    }
    // Metodo properties
    private void iniciarSesionGmail() {
        properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.user", "deaga30@gmail.com");
        properties.put("mail.password", "passPractica");
        Session session = Session.getInstance(properties, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnBorrar){
            vaciarCampos();
        } else if (e.getSource() == btnEnviar){
            System.out.println("Enviando correo");
            String paraCorreo = txtPara.getText();
            String copiaCorreo = txtCC.getText();
            String copiaOcultaCorreo = txtCO.getText();
            String asuntoCorreo = txtAsunto.getText();
            String textoCorreo = txtTexto.getText();
            System.out.printf("%s %s %s %s %s",paraCorreo,copiaCorreo,copiaOcultaCorreo,asuntoCorreo,textoCorreo);
            MimeMessage mimeMessage = new MimeMessage(session);
            try {
                //mimeMessage.setText(texto.getText());
                MimeMultipart mimeMultipart = new MimeMultipart();
                MimeBodyPart mimeBodyPartTexto = new MimeBodyPart();
                mimeBodyPartTexto.setText(texto.getText().toString());
                MimeBodyPart mimeBodyPartAdjunto = new MimeBodyPart();
                mimeBodyPartAdjunto.attachFile(adjunto);
                mimeMultipart.addBodyPart(mimeBodyPartAdjunto);
                mimeMultipart.addBodyPart(mimeBodyPartTexto);
                mimeMessage.setContent(mimeMultipart);

                mimeMessage.setFrom(new InternetAddress(properties.getProperty("mail.user")));
                //InternetAddress[] direcciones = new InternetAddress[]{new InternetAddress(txtPara.getText().toString())};
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(txtPara.getText()));
                mimeMessage.setRecipient(Message.RecipientType.CC,new InternetAddress(txtCC.getText()));
                mimeMessage.setRecipient(Message.RecipientType.BCC,new InternetAddress(txtCCO.getText()));
                mimeMessage.setSubject(txtAsunto.getText());
                Transport transport = session.getTransport("smtp");
                transport.connect(properties.getProperty("mail.user"), properties.getProperty("mail.password"));
                transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
                transport.close();
            } catch (MessagingException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        }
    }

    }*/