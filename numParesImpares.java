import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        //Ler 10 números e exibir quantidade de pares e ímpares
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();

            //Definir valores
            if(numeros[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        teclado.close();

        //Exibir
        System.out.println("\nPares: " + pares);
        System.out.println("\nÍmpares: " + impares);
    }
}