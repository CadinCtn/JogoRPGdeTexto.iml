package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;
import Fases.castelo;
import funcoes.DADO;
import funcoes.beleleu;

public class fase3 {

    static Scanner le = new Scanner(System.in);
    public static void fase3() {


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
                    System.out.println("Você abre a grande porta da frente, e vê quase que um mini exercito com guardas armadurados, criaturas, e monstros.");
                    System.out.println("Todos eles te atacam sem pensar como se você fosse uma grande ameaça, ja esperavam a chegada de alguem...");
                    beleleu.morte();

                    break;

                case 2:
                    castelo.castelo();
                    break;
                default:System.out.println("Você sente que fez algo que não deveria fazer...\nEnfim, você será punido, e por forças maiores...");
                beleleu.morte();
                break;
            }
        }
    }
}
