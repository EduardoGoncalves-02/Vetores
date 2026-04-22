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

    public static void main(String[] args) {
        int vetor[] = new int[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantida de números do vetor: "));
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
            case 'a': {
                int existe = Integer.parseInt(JOptionPane.showInputDialog("Qual valor gostaria de procurar no vetor? "));
                boolean encontrado = false;

                for (int i = 0; i < n; i++) {
                    if (existe == vetor[i]) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    JOptionPane.showMessageDialog(null, existe + " existe no vetor.");
                } else {
                    JOptionPane.showMessageDialog(null, existe + " NÃO existe no vetor.");
                }
                break;
            }
            case 'b': {
                int existe = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser encontrado? "));
                boolean encontrado = false;
                int posicao = 0;

                for (int i = 0; i < n; i++) {
                    if (existe == vetor[i]) {
                        posicao = posicao + 1;
                        encontrado = true;
                        break;
                    } else {
                        posicao = posicao + 1;
                    }

                }
                if (encontrado == true) {
                    JOptionPane.showMessageDialog(null, "O valor " + existe + ", está na posição: " + posicao);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor não encontrado.");
                }
                break;
            }
            case 'c': {
                int ocorrencia = 0;
                int existe = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser pesquisado? "));
                for (int i = 0; i < n; i++) {
                    if (existe == vetor[i]) {
                        ocorrencia = ocorrencia + 1;
                    }
                }
                if (ocorrencia > 0) {
                    JOptionPane.showMessageDialog(null, "O valor: " + existe + ", ocorre " + ocorrencia + " vezes.");
                } else {
                    JOptionPane.showMessageDialog(null, "O valor: " + existe + ", NÃO apareceu no vetor.");
                }
                break;
            }
            case 'd': {
                int menor = 0;
                for (int i = 1; i < n; i++) {
                    if (vetor[menor] > vetor[i]) {
                        menor = i;
                    }
                }
                JOptionPane.showMessageDialog(null, "O menor vetor é: " + vetor[menor] + ", e sua posição é: " + (menor + 1));
            }
            case 'e': {
                int maior = 0;
                for (int i = 1; i < n; i++) {
                    if (vetor[maior] < vetor[i]) {
                        maior = i;
                    }
                }
                JOptionPane.showMessageDialog(null, "O maior vetor é: " + vetor[maior] + ", e sua posição é: " + (maior + 1));
                break;
            }
            case 'f': {
                int central = n / 2;
                if (n % 2 == 0) {
                    central = (n - 1) / 2;
                    JOptionPane.showMessageDialog(null, "O valor central do vetor é: " + vetor[central]);
                } else {
                    JOptionPane.showMessageDialog(null, "O valor central do vetor é: " + vetor[central]);
                }
                break;
            }
            case 'g': {
                double multiplica = 1;
                for (int i = 0; i < n; i++) {
                    multiplica = multiplica * vetor[i];
                }
                JOptionPane.showMessageDialog(null, "Resultado do produto: " + multiplica);
                break;
            }
            case 'h': {
                int soma = 0;
                for (int i = 0; i < n; i++) {
                    if (vetor[i] > 0) {
                        soma = soma + vetor[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "O valor somado dos números positivos: " + soma);
                break;
            }
            case 'i': {
                int soma = 0;
                for (int i = 0; i < n; i++) {
                    if (vetor[i] < 0) {
                        soma = soma + vetor[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "O valor somado dos números negativos: " + soma);
                break;
            }
            case 'j': {
                int soma = 0;
                for (int i = 0; i < n; i++) {
                    if (vetor[i] % 2 == 0) {
                        soma = soma + vetor[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "O valor somado dos números pares: " + soma);
                break;
            }
            case 'k': {
                int soma = 0;
                for (int i = 0; i < n; i++) {
                    if (vetor[i] % 2 != 0) {
                        soma = soma + vetor[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "O valor somado dos números ímpares: " + soma);
                break;
            }
            case 'l':{
            int soma = 0;
            for (int i = 0; i < n; i++){
                soma = soma + vetor[i];
            }
            JOptionPane.showMessageDialog(null, "Soma de todos os valores: " + soma);
            break;
            }
        }
    }
}
