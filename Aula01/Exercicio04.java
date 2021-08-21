package Aula01;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int idade;
        int anosContrib;
        String leitura;
        int faltaAnos;

        leitura = JOptionPane.showInputDialog(null,"Digite sua idade: ");
        idade = Integer.parseInt(leitura);
        Object[] sexo = { "Feminino", "Masculino" };
        Object selectedSexo = JOptionPane.showInputDialog(null,
                "Escolha: ", "Sexo: ",
                JOptionPane.INFORMATION_MESSAGE, null,
                sexo, sexo [0]);
        leitura = JOptionPane.showInputDialog(null,"Digite a quantidade de anos de contribuição");
        anosContrib = Integer.parseInt(leitura);

        if (selectedSexo == "Masculino"){
            if(idade >= 65 || anosContrib >= 35){
                JOptionPane.showMessageDialog(null,  "Você já tem o direito a aposentadoria");
            }else{
                faltaAnos = (anosContrib - 35);
                JOptionPane.showMessageDialog(null,  "Falta" + faltaAnos);
            }
        }

        if (selectedSexo == "Feminino"){
            if(idade >= 60 || anosContrib >= 30){
                JOptionPane.showMessageDialog(null,  "Você já tem o direito a aposentadoria");
            }else{
                faltaAnos = (anosContrib - 30);
                JOptionPane.showMessageDialog(null,  "Falta" + faltaAnos);
            }
        }


    }
}
