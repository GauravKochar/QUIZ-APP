/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaurav
 */
public class Add_Qusjava extends javax.swing.JFrame {

    /**
     * Creates new form Add_Qus
     */
    public Add_Qusjava() {
        initComponents();
        jLabel9.setVisible(true);
    }
    
    
    public void ID()
    {
        Double num=(Double)Math.floor(Math.random()*90)+10;
      String num1= String.valueOf(num);
        jLabel9.setText(num1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        C = new javax.swing.JRadioButton();
        A = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Quiz Qusetion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Difficult" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 90, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Questions Here..");
        jLabel2.setToolTipText("Add Qusetions here");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correct Answer :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Option A");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Option B");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Option C");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Option D");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qus :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonGroup1.add(C);
        C.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C");
        C.setOpaque(false);
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        buttonGroup1.add(A);
        A.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A");
        A.setOpaque(false);
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        buttonGroup1.add(D);
        D.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("D");
        D.setOpaque(false);
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        buttonGroup1.add(B);
        B.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("B");
        B.setOpaque(false);
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-close-circled-128.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 110, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        jButton2.setText("Add This Qusetion");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/templates/add.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 360));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       
        jLabel4.setForeground(Color.green);
        
               
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

        jLabel4.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String mode=(String)jComboBox1.getSelectedItem();
        String que=jTextArea1.getText();
      
      String a=jTextField1.getText();
      String b=jTextField2.getText();
      String c=jTextField3.getText();
      String d=jTextField4.getText();
      ID();
      String id=jLabel9.getText();
      
      String ans=null;
      if(A.isSelected())
      {
          ans="A";
      }
      else
          if(B.isSelected())
      {
          ans="B";
      }
      else
              if(C.isSelected())
      {
          ans="C";
      }
      else
             if(D.isSelected())
      {
          ans="D";
      }
      try
      {
         Connection Con = connection.Connect.getconnection();
         if(mode.equals("Easy"))
         {
         
        String sql="insert into java values('"+que+"','"+a+"','"+b+"','"+c+"','"+d+"','"+ans+"','"+id+"')";
        PreparedStatement pst=Con.prepareStatement(sql);
        pst.execute();
         }
         else if(mode.equals("Difficult"))
         {
              String sqll="insert into difficultjava values('"+que+"','"+a+"','"+b+"','"+c+"','"+d+"','"+ans+"','"+id+"')";
        PreparedStatement pstt=Con.prepareStatement(sqll);
        pstt.execute();
         }
        JOptionPane.showMessageDialog(null,"ADD SUCCESSFULLY");
        jTextArea1.setText("");
         jTextField1.setText("");
          jTextField2.setText(""); 
           jTextField3.setText("");
            jTextField4.setText("");
            jTextArea1.setText("");
          
          
        
        
        
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Qusjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Qusjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Qusjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Qusjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Qusjava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
