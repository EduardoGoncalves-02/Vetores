/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.media_geral;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Media_geral {

    public static void main(String[] args) {
        String alunos[] = new String[100];
        float notas[] = new float[100];

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));

        for (int i = 0; i < n; i++) {
            alunos[i] = JOptionPane.showInputDialog((i + 1) + ". Nome do aluno: ");
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ": "));
        }
        float soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + notas[i];
        }
        float media = soma / n;
        System.out.println("A média geral dos alunos: " + media);

        for (int i = 0; i < n; i++) {
            System.out.println("Nome = " + alunos[i] + ". Nota: " + notas[i] + ".");
        }
    }
}
