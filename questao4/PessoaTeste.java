package gftProva.questao4;

/*
 * @author Julio Henrique Diaz Viana Dos Santos
 */


import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Controle de funcionarios");

        System.out.print("Informe o nome da 1° pessoa:");
        String nomePessoa1 = entrada.next();
        System.out.print("Informe o cargo da 1° pessoa(Starter, Junior, Sênior):");
        String cargoPessoa1 = entrada.next();

        System.out.print("Informe o nome da 2° pessoa:");
        String nomePessoa2 = entrada.next();
        System.out.print("Informe o cargo da 2° pessoa(Starter, Junior, Sênior):");
        String cargoPessoa2 = entrada.next();

        System.out.print("Informe o nome da 3° pessoa:");
        String nomePessoa3 = entrada.next();
        System.out.print("Informe o cargo da 3° pessoa(Starter, Junior, Sênior):");
        String cargoPessoa3 = entrada.next();

        System.out.print("Informe o nome da 4° pessoa:");
        String nomePessoa4 = entrada.next();
        System.out.print("Informe o cargo da 4° pessoa(Starter, Junior, Sênior):");
        String cargoPessoa4 = entrada.next();

        System.out.print("Informe o nome da 5° pessoa:");
        String nomePessoa5 = entrada.next();
        System.out.print("Informe o cargo da 5° pessoa(Starter, Junior, Sênior):\n");
        String cargoPessoa5 = entrada.next();

        Pessoa pessoa1 = new Pessoa(cargoPessoa1);
        Pessoa pessoa2 = new Pessoa(cargoPessoa2);
        Pessoa pessoa3 = new Pessoa(cargoPessoa3);
        Pessoa pessoa4 = new Pessoa(cargoPessoa4);
        Pessoa pessoa5 = new Pessoa(cargoPessoa5);


        System.out.println("Total de pessoas");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);
        System.out.println(pessoa5);

        entrada.close();
    }

}
