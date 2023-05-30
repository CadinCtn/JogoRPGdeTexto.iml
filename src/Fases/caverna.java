package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

import funcoes.DADO;
import funcoes.beleleu;

public class caverna {

    static Scanner le = new Scanner(System.in);
    public static void caverna() {
        byte z,a;

        System.out.println("Você adentrou a caverna!");
        System.out.println("Teste de Sorte:");
        System.out.println("Role o D20:");
        a = le.nextByte();
        DADO.dado = (byte) DADO.d20();
        System.out.println(DADO.dado);

        if (DADO.dado == 1) {
            System.out.println("O chão desaba, você tem uma queda terrivel!");
            beleleu.morte();
            Jogo.re = 1;
        } else if (DADO.dado > 1 && DADO.dado < 16) {
            System.out.println("Voce ouve um barulho vindo de sua direita, olha naquela direção e vê um 'Alotimantes'!");
            System.out.println("Uma criatura comum por essas cavernas, o que quer fazer?");
            System.out.println("1) Fugir  -  2) Enfrentá-lo");
            z = le.nextByte();
            switch (z) {
                case 1:
                    System.out.println("Você corre até o outro lado da caverna e percebe que o Alotimantes veio atraz de você, ele parece furioso!");
                    Jogo.fuga = 1;
                    break;

                case 2:
                    System.out.println("Você caminha na direção da criatura. Conforme se aproxima, ele se encolhe, parece assustado...");
                    System.out.println("Alotimantes foje, e você consegue atravessar a caverna sem problemas.");
                    break;

                default:
                    System.out.println("Você fica indeciso e o Alomantes te ataca sem chances de revidar ou se defender, devido a sua indecisão!");
                    beleleu.morte();
            }
        } else if (DADO.dado < 20 && DADO.dado >= 16) {
            System.out.println("Você atravessa a caverna sem complicações!");
        }


    }

}
