import java.util.Scanner;

/*
2. Elabore um programa que preencha um array de 10 posições digitado pelo usuário
(valores inteiros), calcule e mostre:

a) A quantidade de números pares.
b) Quais os números pares.
c) A quantidade de números ímpares.
d) Quais os números ímpares
*/

public class Ex2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valores[] = new int[10];
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros pares encontrados:");

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2 == 0) {
                System.out.println(valores[i]);
                qtdPar++;
            }

        }

        System.out.println("\nNúmeros ímpares encontrados:");

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2 != 0) {
                System.out.println(valores[i]);
                qtdImpar++;
            }

        }

        System.out.println("\nTotal de pares: " + qtdPar);
        System.out.println("Total de ímpares: " + qtdImpar);

        entrada.close();
    }
}
