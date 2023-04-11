/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frames;

import Excepciones.FechaDisparejaException;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Rodriguez
 */
public class SeleccionarPeriodo extends javax.swing.JDialog {

    /**
     * Creates new form SeleccionarPeriodo
     */
    private Calendar fecha1, fecha2;

    public SeleccionarPeriodo(java.awt.Frame parent, boolean modal, Calendar fecha1, Calendar fecha2) {
        super(parent, modal);
        initComponents();

        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        calendario1 = new com.github.lgooddatepicker.components.DatePicker();
        calendario2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(calendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        background.add(calendario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel1.setText("Desde");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Hasta");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        ponerLasFechas();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ponerLasFechas() {
        try {
            LocalDate desde = calendario1.getDate();
            LocalDate hasta = calendario2.getDate();
            fecha1.set(desde.getYear(), desde.getMonthValue() - 1, desde.getDayOfMonth());
            fecha2.set(hasta.getYear(), hasta.getMonthValue() - 1, hasta.getDayOfMonth());
            
            if(desde.isAfter(hasta)){
                throw new FechaDisparejaException("Las fecha hasta esta antes de la fecha desde");
            }
            
            this.dispose();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Desde o Hasta esta vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(FechaDisparejaException fde) {
            JOptionPane.showMessageDialog(this, fde.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private com.github.lgooddatepicker.components.DatePicker calendario1;
    private com.github.lgooddatepicker.components.DatePicker calendario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
