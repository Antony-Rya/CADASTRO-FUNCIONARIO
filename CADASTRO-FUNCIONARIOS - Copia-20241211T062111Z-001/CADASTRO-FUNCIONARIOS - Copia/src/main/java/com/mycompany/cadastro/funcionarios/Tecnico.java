
package com.mycompany.cadastro.funcionarios;

public class Tecnico extends Funcionario {
    
    
    public Tecnico(String nome, int idade,String cargo, double salario){
        super(nome, idade, cargo, salario);
    }
    @Override
    public double calcularSalario(){
        this.setSalario(this.getSalario()+(this.getSalario()*0.20));
        return this.getSalario();
    }
}
