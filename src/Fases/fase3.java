package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

public class fase3 {

    public static int fase3() {
        Scanner le = new Scanner(System.in);

        byte porta;

        if(Jogo.re == 0 ) {

            System.out.println("Após finalmente sair da floresta sombria, chega a fortaleza do Inquisidor...");
            System.out.println("Grandes estruturas de ferro e pedra arranhando o céu de tão enormes. Tem forma de uma castelo mas com um aspecto mais sombrio.");
            System.out.println("Você sente um grande arrepio sabendo que precisa entrar la para concluir seu objetivo.");
            System.out.println("Você se aproxima do grande portão da fortaleza, parece estar entreaberto.");
            System.out.println("1) Entrar  -  2) Tentar achar outra entrada");
            porta = le.nextByte();
            switch (porta) {
                case 1:

                    break;

                case 2:
                    System.out.println("Você da a volta pelo perímetro da fortaleza, estranhamente parece não haver nenhum guarda de vigia. Você encontra uma entrada lateral.");
                    System.out.println("Ao entrar pela porta, a cena em que se encontra.");

            }
        }


        return 0;
    }

}
