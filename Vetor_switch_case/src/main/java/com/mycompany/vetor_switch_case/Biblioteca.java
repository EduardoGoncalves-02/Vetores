/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor_switch_case;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Biblioteca {

    public static void alternativaA(int[] vetor, int n) {
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
    }

    public static void alternativaB(int[] vetor, int n) {
        int existe = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser encontrado? "));
        boolean encontrado = false;
        int posicao = 0;

        for (int i = 0; i < n; i++) {
            if (existe == vetor[i]) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        if (encontrado == true) {
            JOptionPane.showMessageDialog(null, "O valor " + existe + ", está na posição: " + vetor[posicao]);
        } else {
            JOptionPane.showMessageDialog(null, "Valor não encontrado.");
        }
    }

    public static void alternativaC(int[] vetor, int n) {
        int ocorrencia = 0;
        int existe = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser pesquisado? "));
        for (int i = 0; i < n; i++) {
            if (existe == vetor[i]) {
                ocorrencia = ocorrencia + 1;
            }
        }
        if (ocorrencia > 0) {
            JOptionPane.showMessageDialog(null, "O valor: " + existe + " ocorre " + ocorrencia + " vez(es).");
        } else {
            JOptionPane.showMessageDialog(null, "O valor: " + existe + " NÃO apareceu no vetor.");
        }
    }

    public static void alternativaD(int[] vetor, int n) {
        int menor = 0;
        for (int i = 1; i < n; i++) {
            if (vetor[menor] > vetor[i]) {
                menor = i;
            }
        }
        JOptionPane.showMessageDialog(null, "O menor vetor é: " + vetor[menor] + ", e sua posição é: " + (menor + 1));
    }

    public static void alternativaE(int[] vetor, int n) {
        int maior = 0;
        for (int i = 1; i < n; i++) {
            if (vetor[maior] < vetor[i]) {
                maior = i;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior vetor é: " + vetor[maior] + ", e sua posição é: " + (maior + 1));
    }

    public static void alternativaF(int[] vetor, int n) {
        int central = n / 2;
        if (n % 2 == 0) {
            central = (n - 1) / 2;
            JOptionPane.showMessageDialog(null, "O valor central do vetor é: " + vetor[central]);
        } else {
            JOptionPane.showMessageDialog(null, "O valor central do vetor é: " + vetor[central]);
        }
    }

    public static void alternativaG(int[] vetor, int n) {
        double multiplica = 1;
        for (int i = 0; i < n; i++) {
            multiplica = multiplica * vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Resultado do produto: " + multiplica);
    }

    public static void alternativaH(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > 0) {
                soma = soma + vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O valor somado dos números positivos: " + soma);
    }

    public static void alternativaI(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                soma = soma + vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O valor somado dos números negativos: " + soma);
    }

    public static void alternativaJ(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O valor somado dos números pares: " + soma);
    }

    public static void alternativaK(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 != 0) {
                soma = soma + vetor[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O valor somado dos números ímpares: " + soma);
    }

    public static void alternativaL(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Soma de todos os valores: " + soma);
    }

    public static void alternativaM(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Média de todos os valores: " + (soma / n));
    }

    public static void alternativaN(int[] vetor, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }
        double media = soma / n;
        int j = 0;
        double maiorQueMedia[] = new double[100];
        String texto = "| ";
        for (int i = 0; i < n; i++) {
            if (vetor[i] > media) {
                maiorQueMedia[j] = vetor[i];
                texto += maiorQueMedia[j] + " | ";
                j++;
            }
        }
        JOptionPane.showMessageDialog(null, "Valores acima da média: " + texto + ".");
    }

    public static void alternativaO(int[] vetor, int n) {
        String texto = "| ";
        for (int i = n - 1; i >= 0; i--) {
            texto += vetor[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public static void alternativaP(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }
            }
        }
        String texto = "| ";
        for (int i = 0; i < n; i++) {
            texto += vetor[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

}


