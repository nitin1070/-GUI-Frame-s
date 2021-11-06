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

class ButtonFrame extends Frame
{
    Button b1;
    public ButtonFrame()
    {
        b1=new Button("close frame");
        setTitle("Nitin's Frame");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        setSize(400,400);
       
        setBackground(Color.green);
        add(b1);
        setVisible(true);
    }
}
public class Example3 {
    public static void main(String[] args) {
        ButtonFrame fr=new ButtonFrame();
    }
}
    
        

