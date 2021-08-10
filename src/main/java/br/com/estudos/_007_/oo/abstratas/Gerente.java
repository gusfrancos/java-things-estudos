package br.com.estudos._007_.oo.abstratas;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    
    
    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
