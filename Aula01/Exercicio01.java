package Aula01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        double valorProduto;
        double desconto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();

        System.out.println("Digite o desconto: ");
        desconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (desconto/100);
        double novoValorProduto = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor do produto com o desconto: " + novoValorProduto);

    }
}
