//testando....

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // args é a array passada como parâmetro 
        
        //criação da classe
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // cria nova classe
        // System.in -> entradas do usuário
        // usa convenção americana para decimais


        System.out.println("Insira seu nome: ");
        String nome = scanner.next(); // entrada do nome

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Insira sua altura: ");
        double altura = scanner.nextDouble();
        

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
    }
}

