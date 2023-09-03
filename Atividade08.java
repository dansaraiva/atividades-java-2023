import java.util.Scanner;

//Faça um programa que receba o peso de uma pessoa em quilos, 
//calcule e mostre esse peso em gramas.
public class Atividade08 {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double peso, pesoGramas;

        //Entrada de dados
        System.out.print("Informe seu peso: ");
        peso = entrada.nextDouble();

        //Processamento de dados
        pesoGramas = peso * 1000;

        //Saída de dados
        System.out.print(
            "Seu peso em gramas: " + pesoGramas + " gramas.");
        entrada.close();

    }
}
