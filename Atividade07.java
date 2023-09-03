import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        //Declaração de dados
        Scanner entrada = new Scanner(System.in);
        double peso, pesoMais15, pesoMenos20;

        //Entrada de dados
        System.out.print("Informe seu peso: ");
        peso = entrada.nextDouble();

        //Processamento de dados
        pesoMais15 = peso + (peso*15/100);
        //pesoMais15 = peso * 1.15;
        pesoMenos20 = peso * 0.8;
        //pesoMenos20 = peso - (peso * 20/100);

        //Saída de dados
        System.out.print("Seu peso mais 15%: " + pesoMais15+ " kg.");
        System.out.print("\nSeu peso menos 20% " + pesoMenos20+" kg.");
        entrada.close();

    }
}
