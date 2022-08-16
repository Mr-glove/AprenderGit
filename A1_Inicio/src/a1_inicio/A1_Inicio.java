/*
 Este programa es de Prueba
 */
package a1_inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author piero
 */
public class A1_Inicio {


    public static void main(String[] args) {
       int a = 0,b;
       
        a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        b= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero: "));
        
        JOptionPane.showMessageDialog(null,"La suma es: "+ (a+b));
        
    }
    
}
