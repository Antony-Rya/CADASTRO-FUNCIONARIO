
package com.mycompany.cadastro.funcionarios;

public class Assistente extends Funcionario {
    public Assistente(String nome, int idade,String cargo, double salario){
        super(nome, idade, cargo, salario);

    }
    
    @Override
    public double calcularSalario(){
        this.setSalario(this.getSalario()+(this.getSalario()*0.10));
        return this.getSalario();
    }
}
