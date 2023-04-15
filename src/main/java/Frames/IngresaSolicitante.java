package Frames;

import DAO.Estados;
import DAO.IPersonaDAO;
import DAO.PersonaDAO;
import Entidades.Persona;
import Excepciones.RFCExistenteException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jctri
 */
public class IngresaSolicitante extends javax.swing.JFrame {
    private Persona persona;
    /**
     * Creates new form Registro
     */
    public IngresaSolicitante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        chxDiscapacidad = new javax.swing.JCheckBox();
        txtFecha = new com.github.lgooddatepicker.components.DatePicker();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baner.setBackground(new java.awt.Color(16, 49, 43));
        baner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos Personales");
        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        baner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 70));

        jPanel1.add(baner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 64));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("RFC: ");
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setText("Nombres:");
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel4.setText("Apellido Paterno:");
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setText("Apellido Materno:");
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));

        jLabel6.setText("Fecha de Nacimiento:");
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setText("Telefono:");
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));
        background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 230, -1));
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 230, -1));
        background.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, -1));
        background.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, -1));
        background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, -1));

        botonAgregar.setText("Agregar");
        botonAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        background.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        background.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        chxDiscapacidad.setText("¿ Es discapacitado ?");
        background.add(chxDiscapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 221, -1));
        background.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        //Verificar que los campos no esten nulos
        if(txtFecha.getDate() == null || txtMaterno.getText().isBlank() || 
                txtNombre.getText().isBlank() || txtPaterno.getText().isBlank() ||
                txtRFC.getText().isBlank() || txtTelefono.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "NO DEBE DE HABER CAMPOS VACIOS", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        byte discapacidad;
        
        if(chxDiscapacidad.isSelected()){
            discapacidad = Estados.PERSONA_DISCAPACITADA;
        }else{
            discapacidad = Estados.PERSONA_NO_DISCAPACITADA;
        }
        
        Calendar fecha = new GregorianCalendar();
        LocalDate date = txtFecha.getDate();
        fecha.set(date.getYear(), date.getMonthValue()-1, date.getDayOfMonth());
        
        Persona p = new Persona(txtTelefono.getText(), txtRFC.getText().toUpperCase(), discapacidad, txtNombre.getText().toUpperCase(),
                txtPaterno.getText().toUpperCase(), txtMaterno.getText().toUpperCase(), fecha);
        IPersonaDAO dao = new PersonaDAO();
        
        try {
            p = dao.agregarPersona(p);
        } catch (RFCExistenteException e) {
            JOptionPane.showMessageDialog(this, "ESTE RFC YA ESTA REGISTRADO", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if(p != null) {
            Principal principal = new Principal(true, p);
            principal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar al cliente");
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if(txtRFC.getText().isBlank()) {
            JOptionPane.showConfirmDialog(this, "No se puede buscar sin el rfc de la persona", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        buscarPersonaRfc();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Principal p = new Principal(false, null);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void buscarPersonaRfc(){
        IPersonaDAO dao = new PersonaDAO();
        persona = dao.consultarRFC(txtRFC.getText().toUpperCase());
        if(persona == null){
            JOptionPane.showMessageDialog(this, "Persona no encontrada");
        }else{
            JOptionPane.showMessageDialog(this, "Persona encontrada");
            Principal principal = new Principal(true, persona);
            principal.setVisible(true);
            this.dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JPanel background;
    private javax.swing.JPanel baner;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chxDiscapacidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.github.lgooddatepicker.components.DatePicker txtFecha;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
