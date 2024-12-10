/*
 * Questão 3 ( 3 pontos )

Uma família está dividindo uma pizza entre seus membros. Crie um programa que solicite o número de membros da família e o número de fatias da pizza. O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.
*/

import java.util.Scanner;

public class Questao3 {
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        System.out.println("Digite o numero de membros da familia: ");
        int quantidadeMembros = sc.nextInt();
        System.out.println("Digite o numero de fatias da pizza: ");
        int quantidadeFatias = sc.nextInt();
        int fatiasPorMembro = quantidadeFatias / quantidadeMembros;
        int sobras = quantidadeFatias % quantidadeMembros;
        if (sobras > 0) {
            System.out.println("Cada membro deverah comer " + fatiasPorMembro + " fatias e obraram " + sobras + " fatias.");
        } else if (quantidadeMembros > quantidadeFatias) {
            int diferencaNumeroFatias = quantidadeFatias - quantidadeMembros;
            System.out.println("A diferença entre numero de membros e fatias da pizza é de " + diferencaNumeroFatias + " fatias.");
        } else {
            System.out.println("Cada membro deve comer " + fatiasPorMembro + " fatias.");
        } 
    }
}