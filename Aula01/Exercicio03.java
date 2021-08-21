package Aula01;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {
        double prova1;
        double prova2;
        double trabalho;
        double media;
        String resultado;
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
        prova1 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
        prova2 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        trabalho = Double.parseDouble(leitura);

        media = (prova1 + prova2 + trabalho) / 3;
        if(media >= 6){
            resultado = "Aprovado";
        }else{
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null,resultado + " - a media é: " + media);

    }
}
