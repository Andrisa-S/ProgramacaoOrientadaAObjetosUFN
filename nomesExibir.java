import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //Ler 5 nomes e exibi-los
        String[] nomes = new String[5];
        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = teclado.nextLine();
        }

        //Exibir
        System.out.println("\nNomes:");

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}