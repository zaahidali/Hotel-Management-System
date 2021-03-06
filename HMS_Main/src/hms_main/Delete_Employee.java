/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hms_main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mtari_000
 */
public class Delete_Employee extends javax.swing.JFrame {

    /**
     * Creates new form hms
     */
    public Delete_Employee() {
        initComponents();
    }
     Vector<String> header=new Vector<>();
    Vector<Vector<String>> employee_data=new Vector<Vector<String>>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Employee");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Select Employee ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 30));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 200, 30));

        jTable1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 227, 670, 240));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 690, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_main/logo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Delete Employee");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 150, 60));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_main/user.png"))); // NOI18N
        jLabel1.setText("   EMPLOYEE MANAGEMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 380, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_main/chkout.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try
        {
         int emp_id=Integer.parseInt(jTextField1.getText());   
           
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hotel_management_system;user=sa;password=sqlserver123");
            Statement st=con.createStatement();
                        
            String del=("delete from add_employee where id='"+emp_id+"'");
            String del1=("delete from log_on_to where id='"+emp_id+"'");
            
            st.execute(del);
            st.execute(del1);
            JOptionPane.showMessageDialog(this, "User Deleted");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex); 
        }
          catch (Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex); 
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
              header.clear();
        employee_data.clear();
        
        try
        {
                    int emp_id=Integer.parseInt(jTextField1.getText());   

           
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hotel_management_system;user=sa;password=sqlserver123");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from add_employee where id='"+emp_id+"'");
           
            
            
            while(rs.next())
            {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String log_on_to=rs.getString("log_on_to");
                String desig=rs.getString("designation");
                String addr=rs.getString("address");
                String email=rs.getString("email");
                String pass=rs.getString("password");
                String ac=rs.getString("account_no");
                String contact=rs.getString("contact_no");
                String salary=rs.getString("salary");
                        
                //this vector is ised for add one row into cust_data
                Vector<String> row=new Vector<>();
                row.add(""+id);
                row.add(name);
                row.add(log_on_to);
                row.add(desig);
                row.add(addr);
                row.add(email);
                row.add(pass);
                row.add(ac);
                row.add(contact);
                row.add(salary);
                
                
                employee_data.add(row);
            }            
            header.add("id");
           header.add("name");
           header.add("log_on_to");
           header.add("designation");
           header.add("address");
           header.add("email");
           header.add("password");
           header.add("account_no");
           header.add("contact_no");
           header.add("salary");
           
           
            
           jTable1.setModel(new DefaultTableModel(employee_data,header));
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
         catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

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
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
