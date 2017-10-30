/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static resources.view_QusC.rs;
import static resources.view_Qusjavanew.Bind;


/**
 *
 * @author Gaurav
 */
public class view_QusCCnew extends javax.swing.JFrame {

   Connection con=null;
  public static  PreparedStatement pst=null;
public static    ResultSet rs=null;
String timecheck=null;
   int pos=0,sop=0,rt=0,pi;
   Timer timer,timer1;
   int attempt=0,right=0,wrong=0;
   int count;
   
    public view_QusCCnew() {
        initComponents();
        con=connection.Connect.getconnection();
        jLabel9.setVisible(false);
        Ans.setVisible(false);
        showinfo(pos);
        showtimer();
        
        
    }
    public void showtimer()
    {
         jLabel14.setVisible(true);
         jLabel6.setVisible(true);
       count=10;
       if(timer!=null)
       {
           timer.stop();
       }
       jLabel14.setText(count+"");
       timer=new Timer(1000,new ActionListener()
       {
           public void actionPerformed(ActionEvent evt)
           {
               count--;
               if(count>=0)
               {
                   
                    jLabel14.setText(count+"");
                    if(count==0)
                    {
                         jLabel14.setVisible(false);
                          jLabel6.setVisible(false);
                           JOptionPane.showMessageDialog(null,"Sorry Times up!");
                            nextquestion();
                          
                    }
                    
               }
           }
       });
       timer.start();
       
    }
     public void nextdifficult()
    {
       sop++;
        if(sop<Bind().size())
        {
            show(sop);
            showtimer();
              jRadioButton1.setSelected(false);
        jRadioButton1.setForeground(Color.white);
        jRadioButton2.setSelected(false);
        jRadioButton2.setForeground(Color.white);
        jRadioButton3.setSelected(false);
        jRadioButton3.setForeground(Color.white);
        jRadioButton4.setSelected(false);
        jRadioButton4.setForeground(Color.white);
         jRadioButton5.setSelected(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Thanku for Playing");
            this.dispose();
            new lastform(attempt,right,wrong).setVisible(true);
        }
    }
    public void nextquestion()
    {
        pos++;
        if(pos<BindList().size())
        {
            showinfo(pos);
            showtimer();
              jRadioButton1.setSelected(false);
        jRadioButton1.setForeground(Color.white);
        jRadioButton2.setSelected(false);
        jRadioButton2.setForeground(Color.white);
        jRadioButton3.setSelected(false);
        jRadioButton3.setForeground(Color.white);
        jRadioButton4.setSelected(false);
        jRadioButton4.setForeground(Color.white);
         jRadioButton5.setSelected(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Thanku for Playing");
            this.dispose();
            new lastform(attempt,right,wrong).setVisible(true);
        }
    }
   
    public void calculate()
    {
        if(jRadioButton1.isSelected()||jRadioButton2.isSelected()||jRadioButton3.isSelected()||jRadioButton4.isSelected())
        {
            attempt++;
            Enumeration <AbstractButton> allradiobutton=buttonGroup3.getElements();
            while(allradiobutton.hasMoreElements())
            {
                AbstractButton button=allradiobutton.nextElement();
                if(button.isSelected())
                {
                    switch(Ans.getText())
                    {
                        case "A":
                            if(button==jRadioButton1)
                            {
                                right++;
                            }
                        else
                            {
                                wrong++;
                            }
                        break;
                       case "B":
                            if(button==jRadioButton2)
                            {
                                right++;
                            }
                        else
                            {
                                wrong++;
                            }
                        break;
                       case "C":
                            if(button==jRadioButton3)
                            {
                                right++;
                            }
                        else
                            {
                                wrong++;
                            }
                        break;
                        case "D":
                            if(button==jRadioButton4)
                            {
                                right++;
                            }
                        else
                            {
                                wrong++;
                            }
                        break;
                        default:
                                                        
                    }
                }
            }
            
        }
    }
    
   public static List<user> BindList()
   {
       try
       {
       Connection con=connection.Connect.getconnection();
       String sql="select * from c";
       pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        List<user> list1=new ArrayList<user>();
        while(rs.next())
        {
            user u=new user(rs.getString("question"),rs.getString("a"),rs.getString("b"),rs.getString("c"),rs.getString("d"),rs.getString("ans"),rs.getString("id"));
            list1.add(u);
        }
        return list1;
        
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return null;
        
       
       
   }
   public void showinfo(int index)
   {
       jTextArea1.setText(BindList().get(index).getqus());
       jRadioButton1.setText(BindList().get(index).geta());
        jRadioButton2.setText(BindList().get(index).getb());
        jRadioButton3.setText(BindList().get(index).getc());
        jRadioButton4.setText(BindList().get(index).getd());
        jRadioButton1.setText(BindList().get(index).geta());
        jLabel9.setText(BindList().get(index).getid());
        Ans.setText(BindList().get(index).getans());
   }
    public static List<user> Bind()
   {
       try
       {
       Connection con=connection.Connect.getconnection();
       String sql="select * from difficultcc";
       pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        List<user> list1=new ArrayList<user>();
        while(rs.next())
        {
            user u=new user(rs.getString("question"),rs.getString("a"),rs.getString("b"),rs.getString("c"),rs.getString("d"),rs.getString("ans"),rs.getString("id"));
            list1.add(u);
        }
        return list1;
        
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return null;
        
       
       
   }
   public void show(int index)
   {
       jTextArea1.setText(Bind().get(index).getqus());
       jRadioButton1.setText(Bind().get(index).geta());
        jRadioButton2.setText(Bind().get(index).getb());
        jRadioButton3.setText(Bind().get(index).getc());
        jRadioButton4.setText(Bind().get(index).getd());
        jRadioButton1.setText(Bind().get(index).geta());
        jLabel9.setText(Bind().get(index).getid());
        Ans.setText(Bind().get(index).getans());
   }
    /*public void ID()
    {
        long num=(long)Math.floor(Math.random()*90L)+10L;
      String num1= String.valueOf(num);
        jLabel9.setText(num1);
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        nxt = new javax.swing.JLabel();
        pre = new javax.swing.JLabel();
        fst = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ans = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Quiz Qusetion");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qus :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("A");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 140, 20, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        buttonGroup3.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 220, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("B");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 20, -1));

        buttonGroup3.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setOpaque(false);
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, -1));

        buttonGroup3.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setOpaque(false);
        jRadioButton1.setRolloverEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("D");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 20, 20));

        buttonGroup3.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 690, 70));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 120, 30));

        last.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastMouseClicked(evt);
            }
        });
        getContentPane().add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 60, 20));

        nxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxtMouseClicked(evt);
            }
        });
        getContentPane().add(nxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 60, 20));

        pre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preMouseClicked(evt);
            }
        });
        getContentPane().add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, 20));

        fst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fstMouseClicked(evt);
            }
        });
        getContentPane().add(fst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 70, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("C");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 20, 20));

        Ans.setForeground(new java.awt.Color(255, 255, 255));
        Ans.setText("ans");
        getContentPane().add(Ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 60, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time Left :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 100, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/templates/ggg.PNG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 String ID=jLabel9.getText();
String ans=Ans.getText();
int i=0;
if(jRadioButton1.isSelected())
{
    if(ans.equals("A"))
    {
        jRadioButton1.setForeground(Color.green);
       
        i=i++;
    }
    else
    if(i==0)
    {
        jRadioButton1.setForeground(Color.red);
         if(ans.equals("D"))
            jRadioButton4.setForeground(Color.green);
            if(ans.equals("B"))
                jRadioButton2.setForeground(Color.green);
                if(ans.equals("C"))
                    jRadioButton3.setForeground(Color.green);
              
    }
    
}else if(jRadioButton2.isSelected())
        {
             if(ans.equals("B"))
    {
        jRadioButton2.setForeground(Color.green);
     
        i=i++;
    }
             else
    if(i==0)
    {
        jRadioButton2.setForeground(Color.red);
         if(ans.equals("A"))
            jRadioButton1.setForeground(Color.green);
            if(ans.equals("D"))
                jRadioButton2.setForeground(Color.green);
                if(ans.equals("C"))
                    jRadioButton3.setForeground(Color.green);
               
                
    }
        }
else if(jRadioButton3.isSelected())
{
   if(ans.equals("C"))
    {
        jRadioButton3.setForeground(Color.green);
       
        i=i++;
    }
   else
    if(i==0)
    {
        jRadioButton3.setForeground(Color.red);
         if(ans.equals("A"))
            jRadioButton1.setForeground(Color.green);
            if(ans.equals("B"))
                jRadioButton2.setForeground(Color.green);
                if(ans.equals("D"))
                    jRadioButton4.setForeground(Color.green);
               
    }  
}
else if(jRadioButton4.isSelected())
{
   if(ans.equals("D"))
    {
        jRadioButton4.setForeground(Color.green);
       
        i=i++;
    }
   else
    if(i==0)
    {
        jRadioButton4.setForeground(Color.red);
        if(ans.equals("A"))
            jRadioButton1.setForeground(Color.green);
            if(ans.equals("B"))
                jRadioButton2.setForeground(Color.green);
                if(ans.equals("C"))
                    jRadioButton3.setForeground(Color.green);
              
                
    }  
    
}
 rt=right;
calculate();
timer.stop();
timecheck=jLabel14.getText();



timer=null;
timer1=new Timer(2000,new ActionListener()
{
    public void actionPerformed(ActionEvent evt)
    {
        int timing=Integer.parseInt(timecheck);
        if((timing>5)&&(right>rt))
{
    if(pi==0)
    {
    show(sop);
    pi++;
    showtimer();
    
               jRadioButton1.setForeground(Color.white);
               jRadioButton2.setForeground(Color.white);
               jRadioButton3.setForeground(Color.white);
                jRadioButton5.setSelected(true);
                jRadioButton4.setForeground(Color.white);
    
    }
    else
    {
        nextdifficult();
    }
     
}
else
{
        nextquestion();
}
        timer1.stop();
    }
    
});
timer1.start();

    }//GEN-LAST:event_jLabel2MouseClicked

    
    private void fstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fstMouseClicked
        // TODO add your handling code here:
        pos=0;
        showinfo(pos);
        showtimer();
    }//GEN-LAST:event_fstMouseClicked

    private void preMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preMouseClicked
        // TODO add your handling code here:
        pos--;
       if(pos>=0)
       {
          showinfo(pos); 
          showtimer();
       }
       else
       {
           
           JOptionPane.showMessageDialog(null,"end");
       }
    }//GEN-LAST:event_preMouseClicked

    private void nxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtMouseClicked
        // TODO add your handling code here:
        pos++;
        if(pos<BindList().size())
        {
            showinfo(pos);
            showtimer();
        jRadioButton1.setSelected(false);
        jRadioButton1.setForeground(Color.white);
        jRadioButton2.setSelected(false);
        jRadioButton2.setForeground(Color.white);
        jRadioButton3.setSelected(false);
        jRadioButton3.setForeground(Color.white);
        jRadioButton4.setSelected(false);
        jRadioButton4.setForeground(Color.white);
            
        }
        else
        {
           pos=BindList().size()-1;
            showinfo(pos);
           JOptionPane.showMessageDialog(null,"end");
            new lastform(attempt,right,wrong).setVisible(true);
            
        }
        
        
    }//GEN-LAST:event_nxtMouseClicked

    private void lastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastMouseClicked
        // TODO add your handling code here:
        pos=BindList().size()-1;
             showinfo(pos);
             showtimer();
    }//GEN-LAST:event_lastMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        timer.stop();
       
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(view_QusCCnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_QusCCnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_QusCCnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_QusCCnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_QusCCnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ans;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel fst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel last;
    private javax.swing.JLabel nxt;
    private javax.swing.JLabel pre;
    // End of variables declaration//GEN-END:variables
}
