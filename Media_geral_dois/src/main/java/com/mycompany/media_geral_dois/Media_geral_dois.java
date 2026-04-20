/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_geral_dois;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Adri
 */
public class Media_geral_dois {

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

        String saida = "Relatório de alunos \n";
        for(int i = 0; i < n; i++){
            saida = saida + "Nome: " + alunos[i] + ".\nNota: " + notas[i] + ".\n";
        }
        JTextArea textArea = new JTextArea(3,30);
        textArea.setText(saida);
        textArea.setEditable(false);
        //Cria o painel de rolagem
        JScrollPane painelRolagem = new JScrollPane(textArea);
        //Exibe o textArea na caixa dialogo via painel de rolagem
        JOptionPane.showMessageDialog(null, painelRolagem, "Relatório de alunos", JOptionPane.WARNING_MESSAGE);
        
    }
}

