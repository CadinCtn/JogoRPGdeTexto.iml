package Jogo_aula2;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    static Scanner le = new Scanner(System.in);
    static byte fuga = 0;

    public static void morte() {
        System.out.println("Você morre, um trágico fim para um guerreiro tão jovem, é uma pena.");
    }

    public static int d20() {
        Random d20 = new Random();
        return d20.nextInt(19)+1;
    }

    public static void fase1() {
        byte x = 0, z = 0;
        String a;
        int dado;

        System.out.println("Você estava caminhando pela floresta e encontra uma bifurcação, um caminho para direita e um para esquerda, por onde decide ir?");
        System.out.println("1) Esquerda'CAVERNA'  -  2) Direita'CAMINHO DA DOR'");
        x = le.nextByte();
        dado = d20();

        switch (x) {

            case 1:
                System.out.println("Você adentrou a caverna!");
                System.out.println("Role o D20:");
                a = le.next();
                System.out.println(dado);

                if (dado == 1) {
                    System.out.println("O chão desaba, você tem uma queda terrivel!");
                    morte();
                } else if (dado > 1 && dado < 11) {
                    System.out.println("Voce ouve um barulho vindo de sua direita, olha naquela direção e vê um 'Alotimantes'!");
                    System.out.println("Uma criatura comum por essas cavernas, o que quer fazer?");
                    System.out.println("1) Fugir  -  2) Enfrentá-lo");
                    z = le.nextByte();
                    switch (z) {
                        case 1:
                            System.out.println("Você corre até o outro lado da caverna e percebe que o Alotimantes veio atraz de você, ele parece furioso!");
                            fuga = 1;
                            break;

                        case 2:
                            System.out.println("Você caminha na direção da criatura. Conforme se aproxima, ele se encolhe parece assustado.");
                            System.out.println("Alotimantes foje, e você consegue atravessar a caverna sem problemas.");
                            break;

                        default:
                            System.out.println("Você fica indeciso e o Alomantes te ataca sem chances de revidar ou se defender, devido a sua indecisão!");
                            morte();
                    }
                } else if (dado < 20 && dado >= 11) {
                    System.out.println("Você atravessa a caverna sem complicações!");
                }

                break;

            case 2:
                System.out.println("Você escolheu o caminho da DOR!");
                System.out.println("Conforme caminha, percebe a estrada ficando mais dificil de caminhar, olha adiante e percebe uma neblina densa, percebe que está no meio do nada, não existe mais estrada");
                System.out.println("'Quando foi que a estrada sumiu'- você se pergunta, e não tem mais senso de direção.");
                System.out.println("Você passa horas caminhando não sabe para onde, ' há quanto tempo estou andando?', você não sabe, nao possui mais noção de tempo");
                System.out.println("Não sabe quando isso vai acabar, ou se isso algum dia vai acabar.");
                System.out.println("role o D20:");
                a = le.next();
                System.out.println(d20());

                if (d20() == 20) {
                    System.out.println("Você consegue atravessar a densa neblina!");
                    System.out.println("Você se sente fraco, faminto, sem forças para seguir em frente, você cai.");
                    System.out.println("Antes de fechar os olhos para seu descanço final, consegue ler uma placa 'Vale da neblina do envelhecimento'");
                    morte();
                } else {
                    System.out.println("Você eventualmente cai, sem forças, não sabe onde está, tenta ao máximo se levantar e continuar, mas é inútil.");
                    morte();
                }
                break;

        }

    }


    public static void fase2() {


    }

    public static void main(String[] args) {
        fase1();

    }

}