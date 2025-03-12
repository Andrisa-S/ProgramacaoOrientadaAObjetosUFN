import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        //Ler 10 números inteiros e exibir maior e menor valor
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);

        int maior = 0;
        int menor = 999999999;

        //Inserir
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
            //Definir valores
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        teclado.close();

        //Exibir
        System.out.println("\nMaior: " + maior);
        System.out.println("\nMenor: " + menor);
    }
}