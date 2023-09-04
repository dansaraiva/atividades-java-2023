import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner (System.in);
        double baseMaior, baseMenor, altura, area;

        //Entrada de dados
        System.out.print("Informe a base maior: ");
        baseMaior = entrada.nextDouble();
        System.out.print("Informe a base menor: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Informe a altura: ");
        altura = entrada.nextDouble();

        //Processamento de dados
        //A = ((base maior + base menor) * altura)/2
        area = ((baseMaior + baseMenor) * altura )/ 2;

        //Saída de dados -- CONCATENAÇÃO
        System.out.print("A área do trapézio: " + area);
        entrada.close();
    }
}
