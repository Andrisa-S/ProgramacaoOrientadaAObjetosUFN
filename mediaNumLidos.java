import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //Calcular a média de vários números reais lidos do usuário até que seja lido o número 0.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);

        int numero;

        //Inserir
        do{
            System.out.println("Digite um número inteiro (0 para sair): ");
            numero = teclado.nextInt();
            if(numero != 0){
                lista.add(numero);
            }
        } while(numero != 0);

        teclado.close();

        //Média
        int soma = 0;

        for(int i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }

        int media = soma / lista.size();

        //Exibir

        System.out.println("Média: " + media);
    }
}