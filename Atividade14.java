import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        /*
         * Faça um programa que receba o ano de nascimento de uma 
         * pessoa e o ano atual, calcule e mostre:
            a) a idade dessa pessoa em anos;
            b) a idade dessa pessoa em meses;
            c) a idade dessa pessoa em dias;
            d) a idade dessa pessoa em semanas.
         */

        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int anoAtual, anoNasc, anos, meses, dias, semanas;

        //Entrada de dados
        System.out.print("Informe o ano atual: ");
        anoAtual = entrada.nextInt();
        System.out.print("Informe o ano nascimento: ");
        anoNasc = entrada.nextInt();

        //Processamento de dados
        anos = anoAtual - anoNasc;
        meses = anos * 12;
        dias = anos * 365;
        semanas = anos * 52;

        //Saída de dados
        System.out.print("A idade dessa pessoa em anos: " + anos);
        System.out.print("\nA idade dessa pessoa em meses: " + meses);
        System.out.print("\nA idade dessa pessoa em dias " + dias);
        System.out.print("\nA idade dessa pessoa em semanas: " + semanas);
        
        entrada.close();
    }
}
