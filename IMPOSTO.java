package Imposto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class IMPOSTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Impostos> MinhaLista = new ArrayList();
        String opcao = " ";
        
        do{
            if(MinhaLista.size() < 10){
                double dados[] = null;
                
                System.out.println("--- CADASTRO DE IMPOSTOS ---\n");
                System.out.println("|P| - PIS // |C| - COFINS // |I| - ICMS // |IP| - IPI // |S| - SAIR");
                opcao = entrada.nextLine();
                
                switch (opcao){
                    
                    case "P":
                        
                        dados = new double[2];
                        
                        System.out.print("Informe o valor do débito: ");
                        dados[0] = entrada.nextDouble();
                        System.out.print("Informe o valor do crédito da empresa: ");
                        dados[1] = entrada.nextDouble();
                        
                        MinhaLista.add(new Pis(dados[0], dados[1]));
                        entrada.nextLine();
                        
                        break;
                        
                    case "C":
                        
                        dados = new double[2];
                        
                        System.out.print("Informe o valor do débito: ");
                        dados[0] = entrada.nextDouble();
                        System.out.print("Informe o valor do crédito da empresa: ");
                        dados[1] = entrada.nextDouble();
                        
                        MinhaLista.add(new Cofins(dados[0], dados[1]));
                        entrada.nextLine();
                        
                        break;
                    
                    case "I":
                        
                        dados = new double[2];
                        
                        System.out.print("Informe o preço da mercadoria: ");
                        dados[0] = entrada.nextDouble();
                        System.out.print("Informe a alíquota: ");
                        dados[1] = entrada.nextDouble();
                        
                        MinhaLista.add(new Icms(dados[0], dados[1]));
                        entrada.nextLine();
                        
                        break;
                        
                    case "IP":
                        
                        dados = new double[5];
                        
                        System.out.print("Informe o valor do produto: ");
                        dados[0] = entrada.nextDouble();
                        System.out.print("Informe o valor do frete: ");
                        dados[1] = entrada.nextDouble();
                        System.out.print("informe o valor do seguro: ");
                        dados[2] = entrada.nextDouble();
                        System.out.print("Inferme o valor de outras despesas: ");
                        dados[3] = entrada.nextDouble();
                        System.out.print("Informe o valor da alíquota: ");
                        dados[4] = entrada.nextDouble();
                        
                        MinhaLista.add(new Ipi(dados[0], dados[1], dados[2], dados[3], dados[4]));
                        entrada.nextLine();
                }
                for(int i = 0; i < MinhaLista.size(); i++){
                    MinhaLista.get(i).MostrarDados();
                }
            } else {
                System.out.println("Limite de cadastros atingido!");
                opcao = "S";
            }
        }while(!opcao.equals("S"));
    }
    
}
