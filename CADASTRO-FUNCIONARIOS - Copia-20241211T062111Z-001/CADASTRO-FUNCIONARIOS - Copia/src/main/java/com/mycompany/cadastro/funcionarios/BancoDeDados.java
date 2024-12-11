package com.mycompany.cadastro.funcionarios;

import java.util.ArrayList;

final class BancoDeDados {
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    static public String listarFuncionarios(){
        String lista = "";
        if (funcionarios.size() == 0){
            return "Lista de funcionários está vazia.";
        }else{
            for(Funcionario funcionario: funcionarios){
                lista += "Nome: "+funcionario.getNome()+"\n"+ "Cargo: "+ funcionario.getCargo()+"\n"+"Salário: "+funcionario.getSalario()+"\n";
            }
            return "#########################\n"+lista+"\n#########################";
        }
        



    }
    static public double folhaPagamento(){
        double soma = 0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.getSalario();
        
        }
        return soma;
        
    }
}
