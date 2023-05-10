/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imposto;

/**
 *
 * @author Duda
 */
public class Cofins implements Impostos{
    
    private String nome;
    private double valorDebito;
    private double valorCredito;
    private double valorImposto;
    
    public Cofins(double valorDebito_, double valorCredito_){
        
        this.nome = "Cofins";
        this.valorDebito = valorDebito_;
        this.valorCredito = valorCredito_;
    }
    
    @Override
    public void MostrarDados(){
        valorImposto = (((this.valorDebito - this.valorCredito)* 7.6 )/ 100);
        
        System.out.println("|**********|| "+ this.nome + " ||**********|");
        System.out.println("Valor do débito: "+ this.valorDebito);
        System.out.println("Valor do crédito da empresa: " + this.valorCredito);
        System.out.println("Valor do imposto: " + this.valorImposto);
    }
}
