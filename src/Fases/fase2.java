package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

import funcoes.DADO;
import funcoes.beleleu;

public class fase2 {
    public static void fase2() {
        Scanner le = new Scanner(System.in);

        //variaveis
        String entrada;
        byte decisao;

        //codigo
        if(Jogo.fuga == 1) {
            Fuga.fuga_fase2();
        }

        if(Jogo.re == 0) {
            System.out.println("Depois disso, ao sair da caverna, encontra com facilidade a trilha novamente e continua a caminhar, em busca de um novo desafio.");
            System.out.println("Teste de percepção:");
            System.out.println("Role um D20:");
            DADO.dado = (byte) DADO.d20();
            entrada = le.nextLine();
            System.out.println(DADO.dado);
            if(DADO.dado == 1) {

                Emboscada.emboscada_fase2();

            } else if(DADO.dado >1 && DADO.dado <15) {

                System.out.println("Conforme caminha, percebe algo estranho, sente algo não está certo, movimentações estranhas por entre as árvores");
                System.out.println("1) Continuar a caminhar, deve ter sido somente uma impressão.  -  2) Sair da trilha, encontrar outro caminho");
                decisao = le.nextByte();
                switch (decisao) {
                    case 1: Emboscada.emboscada_fase2();
                        break;

                    case 2:
                        System.out.println("Você sai da trilha, e continua furtivamente por traz das árvores, percebe um grupo de pessoas se escondendo atraz das arvores e olhando para a trilha.");
                        System.out.println("Não parecem ter te percebido, aparentam ser ladrões, saqueadores, se não seguisse seus instintos provavelmente seria emboscado...");
                        break;

                    default: System.out.println("Você tropeça faz muito barulho e toma uma flechada, aconteceu algo que você não queria que acontecesse.");
                        beleleu.morte();
                        Jogo.re = 1;
                }

            }
        }
    }
}
