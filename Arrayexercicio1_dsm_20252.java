import java.util.Scanner;

/*
1. Elabore um programa que preencha um array de 10 posições digitados pelo usuário
(valores inteiros), ao final o programa deve subtrair 1 dos números impares e
adicionar 1 aos números pares. Exibir em tela os novos valores do array.
*/

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                vetor[i] += 1;
            } else {
                vetor[i] -= 1;
            }

        }

        System.out.println("\nValores do vetor depois da alteração:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        entrada.close();
    }
}
