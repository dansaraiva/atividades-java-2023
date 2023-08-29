import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double price, newPrice;

        // Entrada de dados
        System.out.print("Informe o preço: ");
        price = entrada.nextDouble();

        // Processamento de dados
        // newPrice = price - (price * 10/100);
        // newPrice = price - price * 0.1;
        newPrice = price * 0.9;

        // Saída de dados
        System.out.print("O novo preço: " + newPrice);
        entrada.close();
    }
}
