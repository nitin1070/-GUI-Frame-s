/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author dell
 */
class MyFrame4 extends Frame implements ActionListener
{
    Random rnd;
    Button b1,b2;
    
    public MyFrame4(String title)
    {
        b1=new Button("close Frame");
        b2=new Button("change color");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        rnd=new Random();
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            System.exit(0);
      else
        { 
            int red=rnd.nextInt(256);
            int green=rnd.nextInt(256);
            int blue=rnd.nextInt(256);
            Color c=new Color(red,green,blue);
            setBackground(c);
        }
            
    }
}
    
        
        
public class RandomDemo {
    public static void main(String[] args) {
        MyFrame4 fr4=new MyFrame4("Nitin Meena");
    }
    
}
   
