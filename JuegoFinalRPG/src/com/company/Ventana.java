package com.company;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); // termina el programa automaticamente
        setTitle("WarriorFarmer");
        setSize(800,500); // tamanio de la ventana
        setLocationRelativeTo(null); // centra la ventana a la pantalla
        iniciarComp();
    }

    private void iniciarComp(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel); //agrega panel a la ventana para trabajar en el

    }
}
