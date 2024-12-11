
package com.mycompany.cadastro.funcionarios;
import java.util.Scanner;
public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private double bonus;
    boolean promocao;
    public String hierarquia;
    
    public Funcionario(String nome, int idade,String cargo, double salario){
        if (salario>=1500){
            this.salario = salario;
            this.nome = nome;
            this.idade = idade;
            this.cargo = cargo;
       
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

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
    
    public void promover(String cargo, double salario, double bonus){
        if (this.isPromocao()){
            this.cargo = cargo;
            this.salario = salario;
            this.bonus = bonus;
            System.out.println("Funcionário promovido!");
        }else{
            System.out.println("Funcionário não elegível para promoção.");
        }
    }
    
    public void mudarPromocao(){
        setPromocao(!isPromocao());
    }
    
    @Override
    public String toString(){
        String dados = "Nome do funcionário: " +  this.nome + "\n";
        dados += "Idade do funcionário: " + this.idade + "\n";
        dados += "Cargo do funcionário: " + this.cargo + "\n";
        dados += "Salário do funcionário: " + this.salario + "\n";
        dados += "Elegivel a promoção?: " + this.promocao + "\n";
        return dados;
    }
    
    
    public double calcularSalario(){
        this.setSalario(this.getSalario()+(this.getSalario()*this.getBonus()));
        return this.getSalario();
    }
    static void cadastroFuncionario(){
            Scanner sc = new Scanner(System.in);
            System.out.println("#########################");
            System.out.println("-Qual tipo de funcionário?");
            System.out.println("01-Gerente.");
            System.out.println("02-Técnico");
            System.out.println("03-Assistente.");
            System.out.println("#########################");
            int opcao = sc.nextInt();
            
                    
    }
}
