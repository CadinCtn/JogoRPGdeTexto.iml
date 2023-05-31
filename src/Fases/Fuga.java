package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

import funcoes.DADO;
import funcoes.beleleu;

public class Fuga {
    public static void fuga_fase2() {
        Scanner le = new Scanner(System.in);

        byte a,decisao;

        System.out.println("A criatura estranha te ataca!");
        System.out.println("O que quer fazer:");
        System.out.println("1) Revidar  -  2) Tentar escapar  -  3) Não fazer nada");
        decisao = le.nextByte();

        switch (decisao) {
            case 1:
                System.out.println("A criatura vê você se posicionando e tomando uma postura mais confiante, então se acovarda e foge para a caverna.");
                break;


            case 2:
                DADO.dado = (byte) DADO.d20();
                System.out.println("Role um D20:");
                String entrada = le.nextLine();
                System.out.println(DADO.dado);
                if (DADO.dado == 1) {
                    System.out.println("Você tropeça, cai, e é devorado!");
                    beleleu.morte();
                    Jogo.re = 1;
                } else if (DADO.dado > 1 && DADO.dado < 11) {
                    System.out.println("Você tenta corre mas da de cara em uma árvore, a criatura te alcança e te devora!");
                    beleleu.morte();
                    Jogo.re = 1;
                } else if(DADO.dado ==20){
                    System.out.println("Por sorte (muita sorte), o Alotimantes perde você e você consegue escapar");

                } else {
                    System.out.println("Você entra em uma mata fechada com uma densa neblina, corre o mais rápido que consegue, sua vida depende disso, '...não interessa onde isso vai dar só preciso fugir!', você pensa.");
                    System.out.println("Antes que perceba acaba tropeçando por causa de sua visão limitada devido a densa neblina, se levanta rapidamente e descobre que não tem mais chão, você caiu de um penhasco.");
                    System.out.println("De repente tudo se apaga e...");
                    beleleu.morte();
                    Jogo.re = 1;
                }
                break;


            case 3: System.out.println("Você fica parado em uma postura ereta, sem medo, sem desconfiança, sem emoções, apenas aceitando seu destino final chegar...");
                System.out.println("A criatura foje, parece não gostar de coisas sem desafio.");
                break;


            default: System.out.println("Você fica parado indeciso com uma cara de alguem que gosta de fazer o que não deve!");
                beleleu.morte();
                System.out.println("Bem feito!");
                Jogo.re = 1;

                break;

        }
    }
}
