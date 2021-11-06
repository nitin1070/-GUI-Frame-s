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


class MyFrame1 extends Frame implements ActionListener
{
    Button b1,b2;
    public MyFrame1(String title)
    {
        super(title);
        b1=new Button("close Frame");
        b2=new Button("change color");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        setBounds(50,50,500,500);
        add(b1);
        add(b2);
        CloseFrame obj=new CloseFrame();
        b1.addActionListener(obj);
        b2.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
            setBackground(Color.green);//To change body of generated methods, choose Tools | Templates.
    }
}
    class CloseFrame implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
         System.exit(0);     //To change body of generated methods, choose Tools | Templates.
        }
        
    }
        

public class Example4 {
    public static void main(String[] args) {
        MyFrame1 mf1=new MyFrame1("Nitin's Frame");
        
    }
}
    

