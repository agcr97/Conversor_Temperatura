/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Operaciones {
    private int opcion;

    public Operaciones(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    

    public void conversor(){
        String salida="";
        double grados;
        double centi;
        double faren;
        switch(opcion){
            case 1:
                //CONVIERTO GRADOS CENTRIGRADOS A FARENHEITH
                grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados que desea convertir"));
                faren = (grados *1.8000 +32);
                JOptionPane.showMessageDialog(null, "Los "+grados+" ° C a Farenheith son "+faren);
                break;
            case 2:
                //CONVIERTO GRADOS FARENHEITH A CENTRIGADOS
                grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados que desea convertir"));
                centi = (grados *1.8000 -32);
                JOptionPane.showMessageDialog(null, "Los "+grados+" ° F a Centígrados son "+centi);
                break;
            default:
                salida = "Ejecute el programa de nuevo";
                break;
            
        }
    }

}
