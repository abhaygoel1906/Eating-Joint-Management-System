/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_menu.java
 *
 * Created on Aug 5, 2015, 2:34:10 AM
 */

package IP_HHW;

import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class View_menu extends javax.swing.JFrame {

    /** Creates new form View_menu */
    public View_menu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setText("View details of a customer");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Price");

        jLabel1.setText("Item Code");

        jLabel2.setText("Name");

        jLabel8.setText("Serves");

        t4.setEditable(false);

        t3.setEditable(false);

        t2.setEditable(false);

        t1.setEditable(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jButton1.setText("Get item Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dish Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel6.setText("View details of a menu item");

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Done");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t4)
                            .addComponent(t3)
                            .addComponent(t2)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cb1.removeAllItems();
        DefaultComboBoxModel cb=(DefaultComboBoxModel)cb1.getModel();
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ip_hhw", "root", "qwert123");
            Statement stmt=con.createStatement();
            String sql="select icode from menu;";
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()) {
                String a=rs.getString(1);
                cb.addElement(a);}
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a=(String)cb1.getSelectedItem();
        t1.setText(a);

        DefaultComboBoxModel cb=(DefaultComboBoxModel)cb1.getModel();
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ip_hhw", "root", "qwert123");
            Statement stmt=con.createStatement();
            String sql="select * from menu where icode='"+t1.getText()+"';";
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()) {
                String b=rs.getString(2); t2.setText(b);
                String c=rs.getString(3); t3.setText(c);
                String d=rs.getString(4); t4.setText(d);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); 
        cb1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables

}
