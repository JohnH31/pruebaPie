/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Palabras;
import vista.Traductor;

/**
 *
 * @author John
 */
public class Controlador implements ActionListener {

    Traductor tra = new Traductor();
    Palabras pal = new Palabras();

    public Controlador(Traductor tra, Palabras pal) {
        this.pal = pal;
        this.tra = tra;

        this.tra.btnTraducir.addActionListener(this);
    }

    public void palabra1() {
        pal.setPal1(tra.Cbpalabras.getSelectedItem().toString());
        if (pal.getPal1() == "Busca") {
            tra.JopResultado.showMessageDialog(null, "Seeks");
        }
    }

    public void palabra2() {
        pal.setPal2(tra.Cbpalabras.getSelectedItem().toString());
        if (pal.getPal2() == "Camina") {
            tra.JopResultado.showMessageDialog(null, "Walk");
        }
    }

    public void palabra3() {
        pal.setPal3(tra.Cbpalabras.getSelectedItem().toString());
        if (pal.getPal3() == "Canta") {
            tra.JopResultado.showMessageDialog(null, "Sings");
        }
    }

    public void palabra4() {
        pal.setPal4(tra.Cbpalabras.getSelectedItem().toString());
        if (pal.getPal4() == "Hola") {
            tra.JopResultado.showMessageDialog(null, "Hello");
        }
    }

    public void palabra5() {
        pal.setPal5(tra.Cbpalabras.getSelectedItem().toString());
        if (pal.getPal5() == "Elimina") {
            tra.JopResultado.showMessageDialog(null, "Remove");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tra.btnTraducir) {
            this.palabra1();
        }
        if (e.getSource() == tra.btnTraducir) {
            this.palabra2();
        }
        if (e.getSource() == tra.btnTraducir) {
            this.palabra3();
        }
        if (e.getSource() == tra.btnTraducir) {
            this.palabra4();
        }
        if (e.getSource() == tra.btnTraducir) {
            this.palabra5();
        }
    }

}
