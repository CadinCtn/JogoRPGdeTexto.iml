package Jogo_aula2;
import java.util.Scanner;

import funcoes.DADO;
import funcoes.beleleu;

import Fases.fase1;
import Fases.fase2;
import Fases.fase3;

public class Jogo {

    //variaveis globais
    static Scanner le = new Scanner(System.in);
    public static byte fuga = 0,re;


    public static void main(String[] args) {

        //prólogo
        System.out.println("Este é um mundo medieval, onde existem centenas de aventureiros buscando se tornarem grandes lendas.");
        System.out.println("Voce, é um desses aventureiros.");
        System.out.println("Sua missão é derrotar o 'Inquisidor', um ser maligno que vem trazendo mal por eras. Para isso, precisa passar pela floresta sombria.");


        //começo

            fase1.fase1();
            fase2.fase2();
            fase3.fase3();


    }

}