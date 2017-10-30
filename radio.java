/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Gaurav
 */
public class radio  extends JFrame implements ActionListener{
    JButton button;
     ButtonGroup btngroup;
    radio()
    {
    setLayout(new FlowLayout());
    setBounds(200,300,400,400);
    
    
    JRadioButton firstRadioButton=new JRadioButton("Female");  
    firstRadioButton.setBounds(30,30,100,20);
    add(firstRadioButton);
 JRadioButton secondRadioButton=new JRadioButton("Male");  
 secondRadioButton.setBounds(230,30,100,20);
 //Create a radio button group using ButtonGroup  
  btngroup=new ButtonGroup();  
 btngroup.add(firstRadioButton);  
 btngroup.add(secondRadioButton); 
 
add(secondRadioButton);
 //Create a button with text ( What i select )  
  button=new JButton("What i select");  
  button.setBounds(230,170,50,20);
add(button);

 //Add action listener to created button  
 button.addActionListener(this);  

 
    }
 //Get selected JRadioButton from ButtonGroup  
  public void actionPerformed(ActionEvent event)  
  {  
     if(event.getSource()==button)  
     {  
        Enumeration<AbstractButton> allRadioButton=btngroup.getElements();  
        while(allRadioButton.hasMoreElements())  
        {  
           JRadioButton temp=(JRadioButton)allRadioButton.nextElement();  
          // JOptionPane.showMessageDialog(null,"You extra select : "+temp.getText());  
           if(temp.isSelected())  
           {  
            JOptionPane.showMessageDialog(null,"You select : "+temp.getText());  
           }  
        }            
     }
  }

  public static void main(String []args)
  {
      new radio().setVisible(true);
  }
}
