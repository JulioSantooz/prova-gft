package gftProva.questao1;

/*
 * @author Julio Henrique Diaz Viana Dos Santos
 */


public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }


    @Override
    public String toString() {
        return "Olá, eu sou o "+nome
                +" e consumo "+quantidadeDeRacao(peso);
    }
}
