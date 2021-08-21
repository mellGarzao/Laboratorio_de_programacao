package Aula01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String nome;
        double valor;
        double novoValor = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        nome = scanner.next();
        System.out.println("Digite o valor do produto:");
        valor = scanner.nextDouble();

        if(valor >= 50 && valor < 200){
            novoValor = valor - (0.05 * valor);
        }
        else if(valor >= 200 && valor < 500){
            novoValor = valor - (0.06 * valor);

        }else if(valor >= 500 && valor < 1000){
            novoValor = valor - (0.07 * valor);

        }else if(valor >= 1000){
            novoValor = valor - (0.08 * valor) ;

        }else if(valor < 0){
            System.out.println("O valor é inválido.");
        }

        System.out.println("Nome do produto:" + nome);
        System.out.println("Valor do produto:" + valor);
        System.out.println("Valor do produto com desconto:" + novoValor);


    }
}
