package gftProva.questao2;

/*
 * @author Julio Henrique Diaz Viana Dos Santos
 */

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digíte um número:");
        int num = entrada.nextInt();

        if((num % 3 == 0) && (num % 6 == 0) && (num % 7 == 0)){
            System.out.println("Divisível po 3,6,7.");
        }else if(num % 3 == 0 && num % 7 == 0){
            System.out.println("Divisível por 3,7.");
        }else if(num % 3 == 0 && num % 6 == 0){
            System.out.println("Divisível por 3,6.");
        } else if(num % 3 == 0){
            System.out.println("Divisível por 3.");
        }else if(num % 6 == 0) {
            System.out.println("Divisível por 6.");
        }else if(num % 7 == 0) {
            System.out.println("Divisível por 7.");
        }else{
            System.out.println("O número informado não é divisível 3,6,7");
        }

        entrada.close();
    }
}
