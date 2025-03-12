import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        //Ler os nomes de 5 cidades e outro vetor para armazenar as suas respectivas populações e depois imprima na tela o nome da cidade mais populosa.
        String[] cidades = new String[5];
        int[] habitantes = new int[5];
        int maior = 0;
        int menor = 999999999;
        String cidadeMaior = "";
        String cidadeMenor = "";

        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < cidades.length; i++){
            System.out.println("Digite o nome da cidade " + (i+1) + ": ");
            cidades[i] = teclado.nextLine();
            System.out.println("Digite o número de habitantes da cidade " + cidades[i] + ": ");
            habitantes[i] = teclado.nextInt();
            teclado.nextLine();
            //Definir valores
            if(habitantes[i] > maior){
                maior = habitantes[i];
                cidadeMaior = cidades[i];
            }
            if(habitantes[i] < menor){
                menor = habitantes[i];
                cidadeMenor = cidades[i];
            }
        }

        teclado.close();

        //Exibir
        System.out.println("\nMaior cidade: " + cidadeMaior + " com " + maior + " habitantes.");
        System.out.println("\nMenor cidade: " + cidadeMenor + " com " + menor + " habitantes.");
    }
}