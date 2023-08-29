import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, mediaPonderada;

        //Entrada de dados
        System.out.print("Informe uma nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe uma nota: ");
        nota2 = entrada.nextDouble();

        //Processamento de dados
        mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;

        //Saída de dados
        System.out.print(
            "A média ponderada dessas notas: " + mediaPonderada);

        entrada.close();

    }
}
