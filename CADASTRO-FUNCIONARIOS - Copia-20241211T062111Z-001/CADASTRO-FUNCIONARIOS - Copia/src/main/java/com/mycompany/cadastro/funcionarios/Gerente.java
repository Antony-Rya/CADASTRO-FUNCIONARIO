
package com.mycompany.cadastro.funcionarios;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, int idade, String cargo, double salario, String nivel){
        super(nome, idade, cargo, salario, nivel);
        
    }

    
    @Override
    public double calcularSalario(){
        this.setSalario(this.getSalario()+(this.getSalario()*0.30));
        return getSalario();
    }
}
