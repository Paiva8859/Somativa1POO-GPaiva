package Exercicios;

import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int exe = 1;

        while (exe > 0) {
            System.out.println("Qual Objeto executar? Para cancelar digite 0");
            exe = sc.nextInt();

            switch (exe) {

                case 1:
                    Exercicios obj1 = new Exercicios();
                    obj1.exercicio1();
                    break;

                case 2:
                    Exercicios obj2 = new Exercicios();
                    obj2.exercicio2();
                    break;

                case 3:
                    Exercicios obj3 = new Exercicios();
                    obj3.exercicio3();
                    break;

            }
        }

        sc.close();
    }
}