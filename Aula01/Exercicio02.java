package Aula01;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {
        double itbi;
        double valorVenal;
        double valorTransacao;
        double imposto;
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o valor da transação: ");
        valorTransacao = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite o valor da venal: ");
        valorVenal = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a porcentagem do imposto: ");
        itbi = Double.parseDouble(leitura);

        if(valorTransacao > valorVenal){
            imposto = valorTransacao * itbi/100;
        }else{
            imposto = valorVenal * itbi/100;
        }

        JOptionPane.showMessageDialog(null, "Imposto " + imposto);
    }
}
