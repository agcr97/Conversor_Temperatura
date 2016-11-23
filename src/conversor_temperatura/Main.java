/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conversor_temperatura;

import Modelo.Operaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double grados;
        int opcion;
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion para convertir\n 1."
                    + " Grados centigrados a farenheit\n 2. Grados farenheit a centigrados"));
        }while(opcion>4);
        Operaciones objeto = new Operaciones(opcion);
        objeto.conversor();
    }

}
