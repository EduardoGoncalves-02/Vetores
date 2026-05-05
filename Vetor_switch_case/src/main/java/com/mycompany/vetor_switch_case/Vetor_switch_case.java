/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vetor_switch_case;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Vetor_switch_case {

    static int vetor[] = new int[100];
    static int n = Integer.parseInt(JOptionPane.showInputDialog("Quantida de números do vetor: "));

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Número: "));
        }
        String opcao = JOptionPane.showInputDialog("""
                                                   a) Verificar se um determinado valor existe no vetor.
                                                   b) Informar a posição de um determinado valor no vetor.
                                                   c) Apresentar a quantidade de ocorrências de um valor específico no vetor.
                                                   d) Identificar o menor valor do vetor e sua respectiva posição.
                                                   e) Identificar o maior valor do vetor e sua respectiva posição.
                                                   f) Determinar o valor central do vetor. Caso N seja par, considerar o primeiro elemento da metade esquerda.
                                                   g) Calcular o produto de todos os valores do vetor.
                                                   h) Calcular a soma de todos os valores positivos do vetor.
                                                   i) Calcular a soma de todos os valores negativos do vetor.
                                                   j) Calcular a soma de todos os valores pares do vetor.
                                                   k) Calcular a soma de todos os valores ímpares do vetor.
                                                   l) Calcular a soma de todos os valores do vetor.
                                                   m) Calcular a média aritmética dos valores do vetor.
                                                   n) Exibir os valores do vetor que são maiores que a média.
                                                   o) Mostrar os valores do vetor em ordem inversa.
                                                   p) Ordenar o vetor em ordem crescente e exibir o resultado.
                                                   """);
        char opcaoCHAR = opcao.charAt(0);

        switch (opcaoCHAR) {
            case 'a':
                Biblioteca.alternativaA(vetor, n);
                break;

            case 'b':
                Biblioteca.alternativaB(vetor, n);
                break;

            case 'c':
                Biblioteca.alternativaC(vetor, n);
                break;

            case 'd':
                Biblioteca.alternativaD(vetor, n);
                break;

            case 'e':
                Biblioteca.alternativaE(vetor, n);
                break;

            case 'f':
                Biblioteca.alternativaF(vetor, n);
                break;

            case 'g':
                Biblioteca.alternativaG(vetor, n);
                break;

            case 'h':
                Biblioteca.alternativaH(vetor, n);
                break;

            case 'i':
                Biblioteca.alternativaI(vetor, n);
                break;

            case 'j':
                Biblioteca.alternativaJ(vetor, n);
                break;

            case 'k':
                Biblioteca.alternativaK(vetor, n);
                break;

            case 'l':
                Biblioteca.alternativaL(vetor, n);
                break;

            case 'm':
                Biblioteca.alternativaM(vetor, n);
                break;

            case 'n':
                Biblioteca.alternativaN(vetor, n);
                break;

            case 'o':
                Biblioteca.alternativaO(vetor, n);
                break;

            case 'p':
                Biblioteca.alternativaP(vetor, n);
                break;
        }

    }
}
