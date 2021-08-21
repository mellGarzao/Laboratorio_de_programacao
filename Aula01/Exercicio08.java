package Aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int i;
        int num;
        int resposta;

        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for(i = 1; i < 11; i++){
           resposta = num * i;
            System.out.println(num + "X" + i + "=" + resposta);
        }
    }
}
