/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame5 extends Frame implements ActionListener
{
    Button b1,b2;
    int count;
    public MyFrame5(String title)
    {
         super(title);
        b1=new Button("close Frame");
        b2=new Button("click me");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setBounds(50,50,400,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            System.exit(0);
        else
        {
            ++count;
            setTitle(String.valueOf(count));
            //To change body of generated methods, choose Tools | Templates.
    }
        
    }
}
    
    
    
    
        
public class Example5 {
    public static void main(String[] args) {
        MyFrame5 mf5=new MyFrame5("0");
    }
}
    