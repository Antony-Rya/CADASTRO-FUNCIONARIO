
package com.mycompany.cadastro.funcionarios;
import java.util.Scanner;

public class CADASTROFUNCIONARIOS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("#########################");
        System.out.println("01-Cadastrar funcíonário.");
        System.out.println("#########################");
        int opcao = sc.nextInt();
        
        
        
        
        
        System.out.println("Digite o nome do funcionário.");
        String nome = sc.next();
        System.out.println("Digite a idade do funcionário.");
        int idade = sc.nextInt();
        System.out.println("Digite o cargo do funcionário.");
        String cargo = sc.next();
        System.out.println("Digite o salário do funcionário.");
        double salario = sc.nextDouble();
        
        Gerente um = new Gerente(nome, idade, cargo, salario); 
        System.out.println(um.toString());
        
        
        
    }
}