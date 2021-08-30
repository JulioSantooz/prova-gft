package gftProva.questao4;

/*
 * @author Julio Henrique Diaz Viana Dos Santos
 */


public class Pessoa {

    //Atributos
    private String nome;
    private String cargo;

    int starter = 0;
    int junior = 0;
    int senior = 0;

    //Construtores

    public Pessoa(String cargo) {
        this.cargo = cargo;
        if (cargo.equalsIgnoreCase("starter")){
            starter += 1;
        }else if(cargo.equalsIgnoreCase("junior")){
            junior += 1;
        }else if(cargo.equalsIgnoreCase("sênior")){
            senior += 1;
        }
    }

    //Metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Starters: "+starter+
                "Junior: "+junior+
                "Sênior: "+senior;
    }
}
