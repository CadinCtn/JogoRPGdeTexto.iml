package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

import funcoes.DADO;
import funcoes.beleleu;

public class fase1 {
    static Scanner le = new Scanner(System.in);

    public static void fase1() {
        byte decisao;


        System.out.println("Você estava caminhando pela floresta e encontra uma bifurcação, um caminho para direita e um para esquerda, por onde decide ir?");
        System.out.println("1) Esquerda'CAVERNA'  -  2) Direita'continuar a trilha'");
        decisao = le.nextByte();
        DADO.dado = (byte) DADO.d20();

        switch (decisao) {

            case 1:
                caverna.caverna();
                break;

            case 2:
                System.out.println("Você escolheu o caminho da DOR!");
                System.out.println("Conforme caminha, percebe a estrada ficando mais dificil de caminhar, olha adiante e percebe uma neblina densa, percebe que está no meio do nada, não existe mais estrada");
                System.out.println("'Quando foi que a estrada sumiu'- você se pergunta, e não tem mais senso de direção.");
                System.out.println("Você passa horas caminhando não sabe para onde, ' há quanto tempo estou andando?', você não sabe, nao possui mais noção de tempo");
                System.out.println("Não sabe quando isso vai acabar, ou se isso algum dia vai acabar.");
                System.out.println("role o D20:");
                String entrada = le.nextLine();

                System.out.println(DADO.d20());

                if (DADO.d20() == 20) {
                    System.out.println("Você consegue atravessar a densa neblina!");
                    System.out.println("Você se sente fraco, faminto, sem forças para seguir em frente, você cai.");
                    System.out.println("Antes de fechar os olhos para seu descanço final, consegue ler uma placa 'Vale da neblina do envelhecimento'");
                    beleleu.morte();
                } else {
                    System.out.println("Você eventualmente cai, sem forças, não sabe onde está, tenta ao máximo se levantar e continuar, mas é inútil.");
                    beleleu.morte();
                }
                Jogo.re = 1;
                break;

        }

    }


}
