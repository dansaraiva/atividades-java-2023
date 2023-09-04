import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int num;
        String resultado = "";

        //Entrada de dados
        System.out.print("Informe um número: ");
        num = entrada.nextInt();

        //Processamento de dados
        resultado = 
        "\n" + (num + " x  " + 0 + " = " + num * 0) +
        "\n" + (num + " x  " + 1 + " = " + num * 1) +
        "\n" + (num + " x  " + 2 + " = " + num * 2) +
        "\n" + (num + " x  " + 3 + " = " + num * 3) +
        "\n" + (num + " x  " + 4 + " = " + num * 4) +
        "\n" + (num + " x  " + 5 + " = " + num * 5) +
        "\n" + (num + " x  " + 6 + " = " + num * 6) +
        "\n" + (num + " x  " + 7 + " = " + num * 7) +
        "\n" + (num + " x  " + 8 + " = " + num * 8) +
        "\n" + (num + " x  " + 9 + " = " + num * 9) +
        "\n" + (num + " x  " + 10 + " = " + num * 10);
       
        //Saída de dados
        System.out.println(resultado);

        entrada.close();


    }
}
