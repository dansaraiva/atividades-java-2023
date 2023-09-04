import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner (System.in);
        double diagonalMaior, diagonalMenor, area;

        //Entrada de dados
        System.out.print("Informe a diagonal maior: ");
        diagonalMaior = entrada.nextDouble();
        System.out.print("Informe a diagonal menor: ");
        diagonalMenor = entrada.nextDouble();
       
        //Processamento de dados
        //A = (diagonal maior * diagonal menor)/2
        area = (diagonalMaior * diagonalMenor) / 2;

        //Saída de dados -- CONCATENAÇÃO
        System.out.print("A área do losango: " + area);
        entrada.close();
    }
}
