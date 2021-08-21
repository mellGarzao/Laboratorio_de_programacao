package Aula01;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        String senha;
        String login;
        Scanner scanner = new Scanner(System.in);
        boolean respostaLogin;
        boolean respostaSenha;
        int i = 3;

        do{
            System.out.println("Digite o login: ");
            login = scanner.next();
            System.out.println("Digite a senha: ");
            senha = scanner.next();
            respostaLogin =  Objects.equals(login, "java8");
            respostaSenha =  Objects.equals(senha, "java8");

            if(respostaLogin && respostaSenha){
                i = 0;
            }

            if(!respostaLogin || !respostaSenha){
                i--;
                if(i > 0){
                    System.out.println("ERRO: os dados do usuário informados não correspondem ao cadastro.");
                    System.out.println("Ainda restam: " + i + " tentativas");
                }
            }
        }while(i >= 1);

    }
}
