
package com.mycompany.cadastro.funcionarios;
import java.util.Scanner;

public class CADASTROFUNCIONARIOS {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Antony", 23, "Dono", 1500, "Júnior");
        gerente.promover();
        gerente.promover();
        gerente.promover();
        System.out.println(gerente.toString());
        gerente.getNivel();
        System.out.println(gerente.toString());





        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        while (menu){
            System.out.println("#########################");
            System.out.println("#######Bem-vindo!########");
            System.out.println("01-Cadastrar funcíonário.");
            System.out.println("02-Listar funcíonários.");
            System.out.println("03-Folha de pagamentos.");
            System.out.println("04-Atualizar dados.");
            System.out.println("05-Sair.");
            System.out.println("#########################");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Funcionario.cadastroFuncionario();
                    break;
                case 2:
                    System.out.println(BancoDeDados.listarFuncionarios());
                    break;
                case 3:
                    System.out.println(BancoDeDados.folhaPagamento());
                    break;
                case 4:
                    BancoDeDados.modificarFuncionario();
                    break;
                case 5:
                    System.out.println("Até breve!");
                    menu = false;
                    break;
            }

        }
        
    }
        
}
