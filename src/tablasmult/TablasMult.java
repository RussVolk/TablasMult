//Pide un número n e imprime por consola su tabla de multiplicar
package tablasmult;

import javax.swing.JOptionPane;

public class TablasMult {

    public static void main(String[] args) {
        int numero, prod;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número: "));
        
        for (int i=0; i<=10; i++){
            
            prod =i*numero;
            System.out.println(numero+"X"+i+"="+prod);
        }
    }
    
}
