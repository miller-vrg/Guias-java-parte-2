package unisinu.desarrollo1.mvg.guia43;

import java.sql.*;
import coneccion.Conector;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIler vargas mola
 *
 */
public class Ventana extends javax.swing.JFrame {

    Conector ObjConec;
    Connection cone;
    ResultSet rs;
    Statement consulta;

    public Ventana() {
        getContentPane().setBackground(Color.black);
        setLocationRelativeTo(null);
        initComponents();
        prepararBaseDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerTodos = new javax.swing.JButton();
        etiNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiApellido = new javax.swing.JLabel();
        etiSalario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTrabajadores1 = new javax.swing.JButton();
        btnServicios1 = new javax.swing.JButton();
        btnVerTodosServicios = new javax.swing.JButton();
        btnVerTodosClientes = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        btnVerTodos.setBackground(new java.awt.Color(255, 255, 51));
        btnVerTodos.setText("Todos los trabajadores");
        btnVerTodos.setBorder(null);
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });

        etiNombre.setForeground(new java.awt.Color(255, 255, 51));
        etiNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Nombre:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Apellido:");

        etiApellido.setForeground(new java.awt.Color(255, 255, 51));
        etiApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        etiSalario.setForeground(new java.awt.Color(255, 255, 51));
        etiSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Salario:");

        btnTrabajadores1.setBackground(new java.awt.Color(255, 255, 51));
        btnTrabajadores1.setText("Ver trabajador");
        btnTrabajadores1.setBorder(null);
        btnTrabajadores1.setPreferredSize(new java.awt.Dimension(144, 30));
        btnTrabajadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadores1ActionPerformed(evt);
            }
        });

        btnServicios1.setBackground(new java.awt.Color(255, 255, 51));
        btnServicios1.setText("Ver servicio");
        btnServicios1.setBorder(null);
        btnServicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicios1ActionPerformed(evt);
            }
        });

        btnVerTodosServicios.setBackground(new java.awt.Color(255, 255, 51));
        btnVerTodosServicios.setText("Todos los servicios");
        btnVerTodosServicios.setBorder(null);
        btnVerTodosServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosServiciosActionPerformed(evt);
            }
        });

        btnVerTodosClientes.setBackground(new java.awt.Color(255, 255, 51));
        btnVerTodosClientes.setText("Todos los clientes");
        btnVerTodosClientes.setBorder(null);
        btnVerTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosClientesActionPerformed(evt);
            }
        });

        btnclientes.setBackground(new java.awt.Color(255, 255, 51));
        btnclientes.setText("Ver cliente");
        btnclientes.setBorder(null);
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnVerTodosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrabajadores1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnServicios1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(btnVerTodosServicios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclientes, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(etiSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(etiApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(etiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTrabajadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnServicios1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerTodosServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(etiApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(btnVerTodosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed

        String info = "";
        double total = 0.0;
        
        try {
            ResultSet resul = consulta.executeQuery("SELECT * FROM trabajadores");

            //resul.next();
            etiNombre.setText("");
            etiApellido.setText("");
            etiSalario.setText("");

            while (resul.next()) {
                info += "El trabajador se llama " + resul.getString("nombre") + " " + resul.getString("apellido")
                        + " y cobra " + resul.getString("saldo") + "\n";
                total += resul.getDouble("saldo") ;
            }
            info += "Total salarios: " + total;
            Icon icon = new ImageIcon(getClass().getResource("/img/exito.png"));
            JOptionPane.showMessageDialog(null, info, "Consulta", JOptionPane.INFORMATION_MESSAGE, icon);

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnVerTodosActionPerformed

    private void btnTrabajadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadores1ActionPerformed

        try {
            ResultSet resul = consulta.executeQuery("SELECT * FROM trabajadores");
            resul.next();
       
            jLabel1.setText("Nombre: ");
            jLabel2.setText("Apellido: ");
            jLabel3.setText("Salario: ");
                    
            etiNombre.setText("           " + resul.getString("nombre"));
            etiApellido.setText("         " + resul.getString("apellido"));
            etiSalario.setText("         " + resul.getString("saldo"));

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }

    }//GEN-LAST:event_btnTrabajadores1ActionPerformed

    private void btnServicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicios1ActionPerformed


        try {
            ResultSet resul = consulta.executeQuery("SELECT * FROM servicios");
            resul.next();
            
           
            jLabel1.setText("Fecha: ");
            jLabel2.setText("Tipo: ");
            jLabel3.setText("Cantidad: ");
            
            String fecha =  resul.getString("fecha");
            String year =  fecha.substring(0,4);
            String mes =  fecha.substring(5,7);
            String dia =  fecha.substring(8,10);
            fecha = dia + "/" + mes + "/"+ year;
            
            etiNombre.setText("      " + fecha);
            etiApellido.setText("    " + resul.getString("tipo"));
            etiSalario.setText("           " + resul.getString("cantidad"));

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }

    }//GEN-LAST:event_btnServicios1ActionPerformed

    private void btnVerTodosServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosServiciosActionPerformed
              
        String info = "";
        try {
            
            ResultSet resul = consulta.executeQuery("SELECT * FROM servicios");
            //resul.next();
            etiNombre.setText("");
            etiApellido.setText("");
            etiSalario.setText("");

            while (resul.next()) {
                
            String fecha =  resul.getString("fecha");
            String year =  fecha.substring(0,4);
            String mes =  fecha.substring(5,7);
            String dia =  fecha.substring(8,10);
            fecha = dia + "/" + mes + "/"+ year;
                
                info += "Fecha: " + fecha 
                        + ", Tipo: " + resul.getString("tipo") 
                        + ", Cantidad: " + resul.getString("cantidad") + "\n";
               // total += resul.getDouble("saldo") ;
            }

            Icon icon = new ImageIcon(getClass().getResource("/img/exito.png"));
            JOptionPane.showMessageDialog(null, info, "Consulta", JOptionPane.INFORMATION_MESSAGE, icon);

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnVerTodosServiciosActionPerformed

    private void btnVerTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosClientesActionPerformed

         String info = "";
         String tele1 = "";
         String tele2 = "";
         
        try {
            
            ResultSet resul = consulta.executeQuery("SELECT * FROM clientes");
            //resul.next();
            etiNombre.setText("");
            etiApellido.setText("");
            etiSalario.setText("");
            
            while (resul.next()) {
                
                if(resul.getString("tfNum1")  == null ){
                   tele1 = "no tiene";
                } else{ 
                    tele1 = resul.getString("tfNum1");
                }
                
                    if(resul.getString("tfNum2")  == null ){
                   tele2 = "no tiene";
                } else{ 
                    tele2 = resul.getString("tfNum2");
                }
                
                info += "Nombre: " + resul.getString("nombre")
                        + ", Telefono: " + tele1
                        + ", Telefono: " + tele2 + "\n";
               // total += resul.getDouble("saldo") ;
            }

            Icon icon = new ImageIcon(getClass().getResource("/img/exito.png"));
            JOptionPane.showMessageDialog(null, info, "Consulta", JOptionPane.INFORMATION_MESSAGE, icon);

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }

    }//GEN-LAST:event_btnVerTodosClientesActionPerformed

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed

        String tele1 = "";
        String tele2 = "";

        try {
            ResultSet resul = consulta.executeQuery("SELECT * FROM clientes");
            resul.next();

            jLabel1.setText("Nombre: ");
            jLabel2.setText("Telefono: ");
            jLabel3.setText("Telefono: ");

            tele1 = (resul.getString("tfNum1") != null) ? resul.getString("tfNum1") : "no tiene";
            tele2 = (resul.getString("tfNum2") != null) ? resul.getString("tfNum2") : "no tiene";

            etiNombre.setText("      " + resul.getString("nombre"));
            etiApellido.setText("       " + tele1);
            etiSalario.setText("     " + tele2);

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }

    }//GEN-LAST:event_btnclientesActionPerformed

    void prepararBaseDatos() {

        try {
            ObjConec = new Conector();
            cone = ObjConec.getConexion();
            Icon icon = new ImageIcon(getClass().getResource("/img/exito.png"));
            JOptionPane.showMessageDialog(null, "La conección fue exitoza", "EXITO!", JOptionPane.INFORMATION_MESSAGE, icon);

        } catch (SQLException ex) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }
        try {
            consulta = cone.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException exception) {
            Icon icon = new ImageIcon(getClass().getResource("/img/error.png"));
            JOptionPane.showMessageDialog(null, "Error al crear un objeto sentencia", "ERROR!", JOptionPane.ERROR_MESSAGE, icon);
        }
        /*finally{
        
        cone.close();
        consulta.close();
        
        }*/

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnServicios1;
    private javax.swing.JButton btnTrabajadores1;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JButton btnVerTodosClientes;
    private javax.swing.JButton btnVerTodosServicios;
    private javax.swing.JButton btnclientes;
    private javax.swing.JLabel etiApellido;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
