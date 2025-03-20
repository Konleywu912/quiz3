/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leimanwu_quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Leimanwu_quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Aqui pedimos al usuario que registre el tamaño de las columnas
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de columna; "));
        int llenarArreglo[][] = new int[7][tamanio];

        //Registramos los dias, productos, cantidad
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < llenarArreglo.length; j++) {
                String dias = JOptionPane.showInputDialog("Digite el dia" + (i + 1));
                String n = JOptionPane.showInputDialog("Digite el nombre del producto del dia" + dias);
                int c = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad vendida del dia") + dias);
            }
        }
        JOptionPane.showMessageDialog(null, llenarArreglo);
    }

}
