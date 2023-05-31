package Fases;

import Jogo_aula2.Jogo;
import funcoes.beleleu;

import java.util.Scanner;





    public class Emboscada {
        public static void emboscada_fase2() {
            Scanner le = new Scanner(System.in);

            byte emboscada;

            System.out.println("Você vê uma figura humanoide mais adiante a sua frente, ouve passos atraz das árvores, arbustos se mexendo.");
            System.out.println("Você foi emboscado por ladrões, malfeitores que vagam por aí para saquear de qualquer aventureiro novato que esteja distraido demais para percebe-los");
            System.out.println("'Renda-se, deixe tudo que tem e te deixaremos ir'");
            System.out.println("1) Se render  -  2) Lutar em desvantagem");
            emboscada = le.nextByte();

            switch (emboscada) {
                case 1:
                    System.out.println("Você deixa suas coisas, seu dinheiro, seus pertences.");
                    System.out.println("Após pegarem suas coisas ao verem que você não tem mais utilidade, os arqueiros disparam suas flechas em você.");
                    System.out.println("Gritando de dor se arrepende de sua decisão covarde, em poucos momentos sua visão escurece.");
                    beleleu.morte();
                    Jogo.re = 1;
                    break;

                case 2:
                    System.out.println("Você saca sua espada e se prepara para a luta");
                    System.out.println("No momento em que da um passo a frente, antes de perceber você é alvejado por varias flechas.");
                    beleleu.morte();
                    Jogo.re = 1;
                    break;

                default:
                    System.out.println("Uma flecha é disparada e te atinge, um arqueiro deve ter escorregado o dedo do arco.");
                    beleleu.morte();
                    Jogo.re = 1;
                    break;
            }
        }
    }



