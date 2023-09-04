import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        /*
         * João recebeu seu salário e precisa pagar duas contas 
         * atrasadas. Em razão do atraso, ele deverá pagar
            multa de 2% sobre cada conta. Faça um programa que
            calcule e mostre quanto restará do salário de João.
         */

         //Declaração de variáveis
         Scanner entrada = new Scanner(System.in);
         double salario, boletoUm, boletoDois, totalBoletos, multa, salResto;

         //Entrada de dados
         System.out.print("Informe seu salário: ");
         salario = entrada.nextDouble() ;
         System.out.print("Informe valor do Boleto 01: ");
         boletoUm = entrada.nextDouble();
         System.out.print("Informe valor do Boleto 02: ");
         boletoDois = entrada.nextDouble();

         //Processamento de dados
         multa = boletoUm * 0.02 + boletoDois * 0.02;
         totalBoletos = boletoUm + boletoDois;
         salResto = salario - (totalBoletos + multa);

         //Saída de dados
         System.out.println(
            "O resoto do seu dinheiro é: " + salResto
            );
        entrada.close();

    }
}
