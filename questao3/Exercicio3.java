package gftProva.questao3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digíte um número para fazer a multiplicação:");
        int mult = entrada.nextInt();

        System.out.println("Digíte o início do intervalo:");
        int inicio = entrada.nextInt();

        System.out.println("Digíte o fim do intervalo:");
        int fim = entrada.nextInt();


//        for(;inicio<fim;inicio++){
//            System.out.println(int resultado = mult * inicio);
//        }



        entrada.close();
    }
}
