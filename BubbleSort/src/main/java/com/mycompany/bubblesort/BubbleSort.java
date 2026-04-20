/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class BubbleSort {

    public static void main(String[] args) {
        int qtd = 5;
        int vetor[] = new int[qtd];
        
        for(int n = 0; n < qtd; n++){
            vetor[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite números para ordenarmos: "));
        }
        
        for(int i = 0; i < qtd - 1 ; i++){
            for(int j = 0; j < qtd - i - 1; j++){
                if(vetor [j] > vetor [j + 1]){
                    int troca = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = troca;
                }
            }
        } 
        
        JOptionPane.showMessageDialog(null, Arrays.toString(vetor));
    }
}
