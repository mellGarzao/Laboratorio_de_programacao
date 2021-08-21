package Aula01;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        float r1;
        float r2;
        float r3;
        float r4;
        float RE = 0;
        int i;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da resistência 1");
        r1 = scanner.nextFloat();
        System.out.println("Digite o valor da resistência 2");
        r2 = scanner.nextFloat();
        System.out.println("Digite o valor da resistência 3");
        r3 = scanner.nextFloat();
        System.out.println("Digite o valor da resistência 4");
        r4 = scanner.nextFloat();

        float [] valoresR = {r1,r2,r3,r4};
        String [] nomesR = {"r1","r2","r3","r4"};

        for(i = 0; i < 4; i++){
            RE = RE + valoresR[i] ;
        }

        float maiorValor = r1;
        String nomeRMaior = nomesR[0];

        for(i = 0; i < 4; i++){
            if(valoresR[i] > maiorValor){
                maiorValor = valoresR[i];
                nomeRMaior = nomesR[i];
            }
        }

        float menorValor = r1;
        String nomeRMenor = nomesR[0];

        for (i = 0; i < 4; i++){
            if(valoresR[i] < menorValor){
                menorValor = valoresR[i];
                nomeRMenor = nomesR[i];
            }
        }

        System.out.println("A resistência equivalente:" + RE);
        System.out.println("A resistência maior é a " + nomeRMaior + " que vale " + maiorValor);
        System.out.println("A resistência menor é a " + nomeRMenor + " que vale " + menorValor);
    }
}
