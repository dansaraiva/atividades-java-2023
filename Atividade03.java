import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2;

        //Entrada de dados
        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        num2 = entrada.nextDouble();

        //Processamento de dados
        res = num1 / num2;

        //Saída de dados
        System.out.print(
            "A divisão do primeiro número pelo segundo: " + res);
        
        entrada.close();
        
    }
}
