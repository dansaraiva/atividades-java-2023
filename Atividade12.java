import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
         //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double qtdSalario, salarioRecebido, valorSalario;

        //Entrada de dados
        System.out.print("Informe o valor do salário mínimo: ");
        valorSalario = entrada.nextDouble();
        System.out.print("Informe seu salário: ");
        salarioRecebido = entrada.nextDouble();

        //Processamento de dados
        qtdSalario = salarioRecebido / valorSalario;

        //Saída de dados
        System.out.print(
            "Essa é a quantidade de salários que você recebe: " + qtdSalario
            );
        
        entrada.close();
    }
}
