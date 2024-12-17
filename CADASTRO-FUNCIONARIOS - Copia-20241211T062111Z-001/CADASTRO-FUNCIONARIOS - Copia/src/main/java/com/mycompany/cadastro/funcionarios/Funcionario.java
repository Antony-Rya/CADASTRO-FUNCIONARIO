
package com.mycompany.cadastro.funcionarios;
import java.util.Scanner;
public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private double bonus;
    private String nivel = "Júnior";
  
    
    public Funcionario(String nome, int idade,String cargo, double salario, String nivel){
        if (salario>=1500){
            this.salario = salario;
            this.nome = nome;
            this.idade = idade;
            this.cargo = cargo;
            this.nivel = nivel;
       
        }else{
            System.out.println("Salário abaixo do mínimo.");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=1500){
            this.salario = salario;
            
        }else{
            System.out.println("Salário abaixo do mínimo.");
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(){
        if (nivel == "Júnior"){
            nivel = "Experiente";
        }else if(nivel == "Experiente"){
            nivel = "Senior";
        }else{
            System.out.println("Funcionário não pode ser promovido.");
        }
    }

    public void promover(){
        setNivel();
    }
    
    
    @Override
    public String toString(){
        String dados = "Nome do funcionário: " +  this.nome + "\n";
        dados += "Idade do funcionário: " + this.idade + "\n";
        dados += "Cargo do funcionário: " + this.cargo + "\n";
        dados += "Salário do funcionário: " + this.salario + "\n";
        dados += "Nível: " + this.nivel + "\n";
        return dados;
    }
    
    
    public double calcularSalario(){
        return this.getSalario();
    }
    static void cadastroFuncionario(){
            Scanner sc = new Scanner(System.in);
            System.out.println("#########################");
            System.out.println("-Qual tipo de funcionário?");
            System.out.println("01-Gerente.");
            System.out.println("02-Técnico");
            System.out.println("03-Assistente.");
            System.out.println("04-Sair.");
            System.out.println("#########################");
            int opcao = sc.nextInt();
            System.out.println("Digite o nome do funcionário.");
            String nome = sc.next();
            System.out.println("Digite a idade do funcionário.");
            int idade = sc.nextInt();
            if (idade<18){
                System.out.println("Funcionário menor de idade.");
                throw new IllegalArgumentException();
            }
            System.out.println("Digite o cargo do funcionário().");
            String cargo = sc.next();
            System.out.println("Digite o salário do funcionário.");
            double salario = sc.nextDouble();
            String nivel = "Júnior";
            switch(opcao){
                case 1:
                    Gerente gerente = new Gerente(nome, idade, cargo, salario, nivel); 
                    BancoDeDados.funcionarios.add(gerente);
                    break;
                case 2:
                    Tecnico tecnico = new Tecnico(nome, idade, cargo, salario, nivel); 
                    BancoDeDados.funcionarios.add(tecnico);
                    break;
                case 3:
                    Assistente assistente = new Assistente(nome, idade, cargo, salario, nivel); 
                    BancoDeDados.funcionarios.add(assistente);
                    break;
                case 4:
                    break;
                    
            }
    }

    

}
