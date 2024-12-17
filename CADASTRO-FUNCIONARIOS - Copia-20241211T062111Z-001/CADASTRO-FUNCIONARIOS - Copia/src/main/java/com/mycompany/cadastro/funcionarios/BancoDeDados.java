package com.mycompany.cadastro.funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

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

    static public void modificarFuncionario(){
        for (Funcionario funcionario : funcionarios) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do Funcionário.");
            String nome = sc.nextLine();
            if(funcionario.getNome().equals(nome)){
                System.out.println("#########################");
                System.out.println("-Que campo deseja mudar?");
                System.out.println("01-Nome.");
                System.out.println("02-Salario.");
                System.out.println("03-Cargo.");
                System.out.println("04-Remover.");
                System.out.println("#########################");
                int opcao = sc.nextInt();

                switch(opcao){
                    case 1:
                        sc.nextLine();
                        System.out.println("Digite o novo nome: ");
                        String nom = sc.nextLine();
                        funcionario.setNome(nom);
                        break;
                    case 2:
                        double sal = sc.nextDouble();
                        funcionario.setSalario(sal);
                        break;
                    case 3:
                        String car = sc.nextLine();
                        funcionario.setCargo(car);
                        break;
                    case 4:
                        funcionarios.remove(funcionario);
                        break;
                }

            }else{
                System.out.println("Funcionario não encontrado");
            }
        
        }

        
    }
    
}
