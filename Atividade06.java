import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double salarioFixo, vendas, salarioTotal;

        //Entrada de dados
        System.out.print("Informe seu salário: R$ ");
        salarioFixo = entrada.nextDouble();
        System.out.print("Informe suas vendas: R$ ");
        vendas = entrada.nextDouble();

        //Processamento de dados
        //salarioTotal = salarioFixo + (vendas *4/100);
        salarioTotal = salarioFixo + (0.04*vendas);

        //Saída de dados
        System.out.print(
            "Comissão e seu salário final: R$ " +salarioTotal
            );
        entrada.close();
    }
}
