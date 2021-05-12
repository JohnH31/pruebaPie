/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocombobox;

import controlador.Controlador;
import modelo.Palabras;
import vista.Traductor;

/**
 *
 * @author John
 */
public class EjercicioComboBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Traductor tra = new Traductor();
        Palabras pal = new Palabras();
        Controlador c = new Controlador(tra, pal);
        tra.setVisible(true);
    }
    
}
