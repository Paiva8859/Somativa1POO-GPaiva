package Exercicios;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        double n1;
        double n2;
        int operacao;
        double resultado;

        System.out.println("Insira o primeiro número");
        n1 = sc.nextDouble();

        System.out.println("Insira o segundo número");
        n2 = sc.nextDouble();

        System.out.println(
                "Qual será a operação executada? Insira o número relacionado: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("O resultado da operação é: " + resultado);

                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("O resultado da operação é: " + resultado);

                break;

            case 3:
                resultado = n1 * n2;
                System.out.println("O resultado da operação é: " + resultado);

                break;

            case 4:
                while (n2 == 0) {
                    System.out.println(
                            "O segundo número será o divisor, que não pode ser igual a 0, por favor insira outro número");
                    n2 = sc.nextDouble();

                }

                resultado = n1 / n2;
                System.out.println("O resultado da operação é: " + resultado);

                break;
        }
    }

    public void exercicio2() {
        double n; // número de matricula

        System.out.println("Insira o número de matricula");
        n = sc.nextDouble();

        if (n % 4 == 0) {
            System.out.println("O aluno está no time do Chris");

        } else if (n % 4 == 3) {
            System.out.println(" O aluno está no time do Greg");
        } else if (n % 4 == 2) {
            System.out.println("O aluno está no time do Caruso");

        } else {
            System.out.println("O aluno está no time do Jerome");

        }

    }

    public void exercicio3() {
        double kg1 = 0;
        double kg2 = 0;
        double kg3 = 0;
        int fruta;
        int x = 1; // contador
        double valor;
        double desconto = 1;

        while (x <= 1) {

            System.out.println("Qual fruta será comprada? Digite o número relacionado: 1-morangos, 2-maçãs, 3-bananas");
            fruta = sc.nextInt();

            switch (fruta) {
                case 1:
                    System.out.println("Quantos Kg serão comprados?");
                    kg1 = sc.nextDouble();

                    break;

                case 2:
                    System.out.println("Quantos Kg serão comprados?");
                    kg2 = sc.nextDouble();

                    break;
                
                case 3:
                    System.out.println("Quantos Kg serão comprados?");
                    kg3 = sc.nextDouble();

                    break;
            }

            System.out.println( "Deseja mais alguma coisa? Digite o número relacionado: 1-Sim, 2-Não" );
            x = sc.nextInt();
        }

        if (kg1 + kg2 + kg3 >= 15) {
            desconto = 0.90;
        }
        else 
        if ( kg1 * 3.5 + kg2 * 2.3 + kg3 * 1.8 >= 30) {
            desconto = 0.90;
        }

        valor = (kg1 * 3.5 + kg2 * 2.3 + kg3 * 1.8) * desconto;

        System.out.println( "O valor da compra será de: R$ " + valor );

    }
    
}
