/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imposto;

/**
 *
 * @author Duda
 */
public class Ipi implements Impostos {
    
    private String nome;
    private double valorProduto;
    private double valorFrete;
    private double valorSeguro;
    private double outrasDespesas;
    private double aliquota;
    private double valorImposto;
    
    public Ipi(double valorProduto_, double valorFrete_, double valorSeguro_, double outrasDespesas_, double aliquota_){
        this.nome = "IPI";
        this.valorProduto = valorProduto_;
        this.valorFrete = valorFrete_;
        this.valorSeguro = valorSeguro_;
        this.outrasDespesas = outrasDespesas_;
        this.aliquota = aliquota_;
    }
    
    @Override
    public void MostrarDados(){
        this.valorImposto = (this.valorProduto + this.valorFrete + this.valorSeguro + this.outrasDespesas)* 5 /100;
        
        System.out.println("|**********|| "+ this.nome + " ||**********|");
        System.out.println("Valor do produto: "+ this.valorProduto);
        System.out.println("Valor do frete: "+ this.valorFrete);
        System.out.println("Valor do seguro: "+ this.valorSeguro);
        System.out.println("Valor de outras despesas: "+ this.outrasDespesas);
        System.out.println("Valor da alíquota: "+ this.aliquota);
        System.out.println("Valor do importo: "+ this.valorImposto);
    }
}
