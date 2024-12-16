
package com.mycompany.cadastro.funcionarios;

public class Assistente extends Funcionario {
    public Assistente(String nome, int idade,String cargo, double salario, String nivel){
        super(nome, idade, cargo, salario, nivel);

    }
    
    @Override
    public double calcularSalario(){
        this.setSalario(this.getSalario()+(this.getSalario()*0.10));
        return this.getSalario();
    }
}
