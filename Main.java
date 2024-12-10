import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        try{
            System.out.println("Escolhar o exercicio:");
            System.out.println("1 - Questao1");
            System.out.println("2 - Questao2");
            System.out.println("3 - Questao3");
            System.out.println("4 - Questao4");
            String exerc = sc.nextLine();

            switch (exerc) {
                case "1":
                    Questao1.main();
                    break;
                case "2":
                    Questao2.main();
                    break;
                case "3":
                    Questao3.main();
                    break;
                case "4":
                    Questao4.main();
                    break;
                default:
                System.out.println("Erro: Valor invalido");
                    break;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor invalido");
        }
        
        System.out.println("Fim do programa");
        sc.close();
    }

}
