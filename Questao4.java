/*
 * Questão 4 ( 1 ponto )

Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.
*/

import java.util.Scanner;

public class Questao4 {
    public static final String Questao4 = null;
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        boolean ehPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(num + " eh primo.");
        } else {
            System.out.println(num + " nao eh primo.");
        }
    }
}