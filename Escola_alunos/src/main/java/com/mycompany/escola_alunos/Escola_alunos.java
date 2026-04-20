/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escola_alunos;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Escola_alunos {

    public static void main(String[] args) {
        String  alunos[] = new String[100];
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));
        
        for (int i = 0; i < n; i++){
            alunos[i] = JOptionPane.showInputDialog((i + 1) + ". Digite o nome: ");
        }
        for (int i = 0; i < n; i++){
            System.out.println(alunos[i]);
        }
    }
}
