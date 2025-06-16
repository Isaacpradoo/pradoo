import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.printf("1º Bimestre: %.1f%n", mediasBimestrais[0]);
        System.out.printf("2º Bimestre: %.1f%n", mediasBimestrais[1]);
        System.out.printf("1º Semestre: %.1f%n", mediaSemestre1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f%n", mediasBimestrais[2]);
        System.out.printf("4º Bimestre: %.1f%n", mediasBimestrais[3]);
        System.out.printf("2º Semestre: %.1f%n", mediaSemestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
