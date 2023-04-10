/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frames;

import DAO.IPersonaDAO;
import DAO.PersonaDAO;
import Entidades.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan Rodriguez
 */
public class SeleccionarPersonaDialog extends javax.swing.JDialog {

    private final IPersonaDAO daopersona;

    /**
     * Creates new form SeleccionarPersonaDialog
     */
    public SeleccionarPersonaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        daopersona = new PersonaDAO();
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
        jLabel1 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        calendario = new com.github.lgooddatepicker.components.CalendarPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("RFC Persona");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));
        background.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 12, 160, -1));

        jLabel2.setText("Nombre");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, -1));

        jLabel3.setText("Fecha de nacimiento");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPersonas);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 360, 550));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        background.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        btnRegresar.setText("Regresar");
        background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));
        background.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel4.setText("Primer apellido");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setText("Segundo apellido");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        background.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));
        background.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Persona> personas = new ArrayList();
        Persona p = obtenerPersona();
        
        if (txtNombre.getText().equals("") && txtRfc.getText().equals("")
                && calendario.getSelectedDate() == null) {
            return;
        }

        boolean nombre = false, nacimiento = false;

        if (!txtRfc.getText().equals("")) {
            p = buscarPorRFC();
            if (p == null) {
                return;
            }
            personas.add(p);
            mostrarTabla(personas);
            return;
        }

        if (!txtNombre.getText().equalsIgnoreCase("")) {
            nombre = true;
        }

        LocalDate fecha = calendario.getSelectedDate();
        Calendar fecha_nacimiento = new GregorianCalendar();
        
        if (fecha != null) {
            nacimiento = true;
            fecha_nacimiento.set(fecha.getYear(), fecha.getMonthValue()-1, fecha.getDayOfMonth());
        }

        if (nombre && nacimiento) {

            personas = daopersona.buscarPorNombreNacimiento(p);

            if (personas == null || personas.isEmpty()) {
                personas = new ArrayList();
            }
            mostrarTabla(personas);
            return;
        }

        if (nombre) {
            personas = daopersona.buscarPorNombre(p);
            if(personas.isEmpty()) {
                personas = new ArrayList();
            }
            mostrarTabla(personas);
            return;
        }

        if (nacimiento) {
            personas = daopersona.buscarPorNacimiento(fecha_nacimiento);
            if(personas == null || personas.isEmpty()) {
               personas = new ArrayList();
            }
            mostrarTabla(personas);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private Persona obtenerPersona() {
        Persona p = new Persona();
        LocalDate fecha = calendario.getSelectedDate();
        
        Calendar nacimiento = new GregorianCalendar();
        
        
        if(fecha!=null){
            nacimiento.set(fecha.getYear(), fecha.getMonthValue()-1, fecha.getDayOfMonth());
            p.setFechaNacimiento(nacimiento);
        }
        p.setPrimerApellido(txtPrimerApellido.getText());
        p.setSegundoApellido(txtSegundoApellido.getText());
        p.setNombre(txtNombre.getText());
        p.setRFC(txtRfc.getText());
        return p;
    }

    private Persona buscarPorRFC() {

        Persona p = daopersona.consultarRFC(txtRfc.getText().toUpperCase());

        if (p == null) {
            return null;
        }

        return p;
    }

    private void mostrarTabla(List<Persona> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tablaPersonas.getModel();
        modelo.setRowCount(0);
        for (Persona persona : lista) {
            Object[] datos = new Object[modelo.getColumnCount()];
            datos[0] = persona.getNombre();
            datos[1] = persona.getPrimerApellido();
            datos[2] = persona.getSegundoApellido();
            datos[3] = persona.getRFC();
            modelo.addRow(datos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private com.github.lgooddatepicker.components.CalendarPanel calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables
}
