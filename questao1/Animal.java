package gftProva.questao1;

/*
 * @author Julio Henrique Diaz Viana Dos Santos
 */


public abstract class Animal {

    //Estado (atributos) - Dados do usuario
    String nome;
    double peso;

    //Construtor(es) - Valores iniciais para os atributos
    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        quantidadeDeRacao(this.peso);
    }

    //Comportamento (metodos) - Saida esperada
    String som(String som){

        return som;
    }

    double quantidadeDeRacao(double peso){
        if(peso <= 3){
            return peso * 0.1;
        }else if(peso > 3){
            return peso * 0.1;
        }else if(peso <= 4){
            return peso * 0.4;
        }else if(peso > 4 || peso <= 12){
            return peso * 0.45;
        }
        return 0;
    }


}
