/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject.awt;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

/**
 ;
 * @author dell
 */
public class Example2 {
    public static void main(String[] args) {
      
    Frame fr=new Frame();
    Date d=new Date();
    String str=d.toString();
    fr.setTitle(str);
    fr.setBackground(Color.green);
    fr.setBounds(50,50,500,500);
    fr.setVisible(true);
    }
    
    
    
}
