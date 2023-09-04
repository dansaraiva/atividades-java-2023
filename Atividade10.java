import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner (System.in);
        double lado, area;

        //Entrada de dados
        System.out.print("Informe o lado: ");
        lado = entrada.nextDouble();

        //Processamento de dados -- A = lado * lado
        area = lado * lado;

        //Saída de dados -- CONCATENAÇÃO
        System.out.println("A área do quadrado vale: " + area);
        entrada.close();

    }
}
