package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        double n1, n2, soma, subtracao, multiplicacao, divisao;
            Scanner captura = new Scanner(System.in);
            System.out.println("Digite um número: ");
            n1 = captura.nextDouble();
            System.out.println("Digite um número: ");
            n2 = captura.nextDouble();
            
            soma = n1 + n2;
            subtracao = n1 - n2;
            multiplicacao = n1 * n2;
            divisao = n1 / n2;
            
            System.out.println("A soma dos dois números é: "+soma);
            System.out.println("A subtracao dos dois números é: "+subtracao);
            System.out.println("A multiplicacao dos dois números é: "+multiplicacao);
            System.out.println("A divisao dos dois números é: "+divisao);
            System.out.println("parabéns");
    }
    
}