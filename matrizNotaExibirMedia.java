import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        //Ler as notas de 3 alunos em 4 disciplinas, calcular e exibir a média
        int[][] notas = new int[3][4];
        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Digite a nota " + (j+1) + " do aluno " + (i+1) + ": ");
                notas[i][j] = teclado.nextInt();
            }
        }

        //Média
        for(int i = 0; i < notas.length; i++){
            int soma = 0;
            for(int j = 0; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            double media = (double) soma / notas[i].length;
            System.out.println("Média do aluno " + (i+1) + ": " + media);
        }


    }
}