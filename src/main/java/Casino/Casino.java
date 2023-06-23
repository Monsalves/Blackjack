package Casino;

import BlackJack.BlackJack;
import Bullseye.Bullseye;

import java.util.Scanner;

public class Casino {
    public void jugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea jugar?");
        System.out.println("1-BlackJack");
        System.out.println("2-Bullseye");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:

                BlackJack cartitas = new BlackJack();

                break;
            case 2:
                Bullseye caballitos = new Bullseye();
                caballitos.Jugar();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

}

