/*
 * Questão 1 ( 3 pontos )

Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. Além disso, informe quantos litros de combustível serão necessários para completar a viagem.
*/

import java.util.Scanner;

public class Questao1 {
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        System.out.println("Digite o preco do combustivel por litro: ");
        double preco = sc.nextDouble();
        double litrosNecessarios = 360 / 12;
        double valorViagem = litrosNecessarios * preco;
        System.out.println("Foram necessarios " + litrosNecessarios + " litros de combustivel e o valor da viagem foi: " + valorViagem);
    }
}