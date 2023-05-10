/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imposto;

/**
 *
 * @author Duda
 */
public class Icms implements Impostos {
    
    private String nome;
    private double precoMercadoria;
    private double aliquota;
    private double valorImposto;
    
    public Icms(double precoMercadoria_, double aliquota_){
        this.nome = "ICMS";
        this.precoMercadoria = precoMercadoria_;
        this.aliquota = aliquota_;
    }
    
    @Override
    public void MostrarDados(){
        valorImposto = (this.precoMercadoria * this.aliquota) / 100;
        
        System.out.println("|**********|| "+ this.nome + " ||**********|");
        System.out.println("Valor da mercadoria: "+ this.precoMercadoria);
        System.out.println("Valor da Alíquota: " + this.aliquota);
        System.out.println("Valor do imposto: " + this.valorImposto);
    }
}
