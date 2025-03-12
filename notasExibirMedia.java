import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        //Ler notas de 5 alunos, calcular e exibir a média
        int[] notas = new int[5];
        int soma = 0;
        double media;
        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = teclado.nextInt();
            soma += notas[i];
        }

        teclado.close();

        //Média
        media = (double) soma / notas.length;

        //Exibir
        System.out.println("\nMédia:" + media);
    }
}