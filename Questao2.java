/*
 * Questão 2 ( 3 pontos )

Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário, solicite o nome e a nota de cada um dos alunos. Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.
*/

import java.util.Scanner;

public class Questao2 {
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        System.out.println("Digite a quantidade de alunos: ");    
        int quantidadeAlunos = sc.nextInt();
        double[] notas = new double[quantidadeAlunos];
        String[] nomes = new String[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");    
            nomes[i] = sc.next();
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");    
            notas[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            media += notas[i];
        }
        media /= quantidadeAlunos;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] > media) {
                System.out.println("Aluno " + nomes[i] + " tirou nota " + notas[i]);
            }
        }
    }
}