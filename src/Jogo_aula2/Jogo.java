package Jogo_aula2;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    //variaveis globais
    static Scanner le = new Scanner(System.in);
    static byte fuga = 0, dado,re;

    //funções:
    public static void morte() {
        System.out.println("Você morre, um trágico fim para um guerreiro tão jovem, é uma pena.");
    }

    public static int d20() {
        Random d20 = new Random();
        return d20.nextInt(19)+1;
    }

    public static void caverna() {
        byte z,a;

        System.out.println("Você adentrou a caverna!");
        System.out.println("Teste de Sorte:");
        System.out.println("Role o D20:");
        a = le.nextByte();
        System.out.println(dado);

        if (dado == 1) {
            System.out.println("O chão desaba, você tem uma queda terrivel!");
            morte();
            re = 1;
        } else if (dado > 1 && dado < 16) {
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
                    System.out.println("Você caminha na direção da criatura. Conforme se aproxima, ele se encolhe, parece assustado...");
                    System.out.println("Alotimantes foje, e você consegue atravessar a caverna sem problemas.");
                    break;

                default:
                    System.out.println("Você fica indeciso e o Alomantes te ataca sem chances de revidar ou se defender, devido a sua indecisão!");
                    morte();
            }
        } else if (dado < 20 && dado >= 16) {
            System.out.println("Você atravessa a caverna sem complicações!");
        }


    }

    public static int fuga_fase2() {
        byte a,d;

        System.out.println("A criatura estranha te ataca!");
        System.out.println("O que quer fazer:");
        System.out.println("1) Revidar  -  2) Tentar escapar  -  3) Não fazer nada");
        d = le.nextByte();

        switch (d) {
            case 1:
                System.out.println("A criatura vê você se posicionando e tomando uma postura mais confiante, então se acovarda e foge para a caverna.");
                break;


            case 2:
                dado = (byte) d20();
                System.out.println("Role um D20:");
                a = le.nextByte();
                System.out.println(dado);
                if (dado == 1) {
                    System.out.println("Você tropeça, cai, e é devorado!");
                    morte();
                    re = 1;
                } else if (dado > 1 && dado < 11) {
                    System.out.println("Você tenta corre mas da de cara em uma árvore, a criatura te alcança e te devora!");
                    morte();
                    re = 1;
                } else if(dado ==20){
                    System.out.println("Por sorte (muita sorte), o Alotimantes perde você e voê consegue escapar");

                } else {
                    System.out.println("Você entra em uma mata fechada com uma densa neblina, corre o mais rápido que consegue, sua vida depende disso, '...não interessa onde isso vai dar só preciso fugir!', você pensa.");
                    System.out.println("Antes que perceba acaba tropeçando por causa de sua visão limitada devido a densa neblina, se levanta rapidamente e descobre que não tem mais chão, você caiu de um penhasco.");
                    System.out.println("De repente tudo se apaga e...");
                    morte();
                    re = 1;
                }
                break;


            case 3: System.out.println("Você fica parado em uma postura ereta, sem medo, sem desconfiança, sem emoções, apenas aceitando seu destino final chegar...");
                System.out.println("A criatura foje, parece não gostar de coisas sem desafio.");
                break;


            default: System.out.println("Você fica parado indeciso com uma cara de alguem que gosta de fazer o que não deve!");
                morte();
                System.out.println("Bem feito!");
                re = 1;

                break;

        }
    return 0;
    }


    public static int emboscada_fase2() {
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
                morte();
                re = 1;
                break;

            case 2:
                System.out.println("Você saca sua espada e se prepara para a luta");
                System.out.println("No momento em que da um passo a frente, antes de perceber você é alvejado por varias flechas.");
                morte();
                re = 1;
                break;

            default:
                System.out.println("Uma flecha é disparada e te atinge, um arqueiro deve ter escorregado o dedo do arco.");
                morte();
                re = 1;
                break;
        }
    return 0;
    }


    public static void fase1() {
        byte x = 0, a;


        System.out.println("Você estava caminhando pela floresta e encontra uma bifurcação, um caminho para direita e um para esquerda, por onde decide ir?");
        System.out.println("1) Esquerda'CAVERNA'  -  2) Direita'continuar a trilha'");
        x = le.nextByte();
        dado = (byte) d20();

        switch (x) {

            case 1:
                caverna();
                break;

            case 2:
                System.out.println("Você escolheu o caminho da DOR!");
                System.out.println("Conforme caminha, percebe a estrada ficando mais dificil de caminhar, olha adiante e percebe uma neblina densa, percebe que está no meio do nada, não existe mais estrada");
                System.out.println("'Quando foi que a estrada sumiu'- você se pergunta, e não tem mais senso de direção.");
                System.out.println("Você passa horas caminhando não sabe para onde, ' há quanto tempo estou andando?', você não sabe, nao possui mais noção de tempo");
                System.out.println("Não sabe quando isso vai acabar, ou se isso algum dia vai acabar.");
                System.out.println("role o D20:");
                a = le.nextByte();
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
                re = 1;
                break;

        }

    }


    public static int fase2() {

        byte d,a;

        if(fuga == 1) {
            fuga_fase2();
        }

        if(re == 0) {
            System.out.println("Depois disso, ao sair da caverna, encontra com facilidade a trilha novamente e continua a caminhar, em busca de um novo desafio.");
            System.out.println("Teste de percepção:");
            System.out.println("Role um D20:");
            dado = (byte) d20();
            a = le.nextByte();
            System.out.println(dado);
            if(dado == 1) {

                emboscada_fase2();

            } else if(dado >1 && dado <15) {

                System.out.println("Conforme caminha, percebe algo estranho, sente algo não está certo, movimentações estranhas por entre as árvores");
                System.out.println("1) Continuar a caminhar, deve ter sido somente uma impressão.  -  2) Sair da trilha, encontrar outro caminho");
                a = le.nextByte();
                switch (a) {
                    case 1: emboscada_fase2();
                    break;

                    case 2:
                        System.out.println("Você sai da trilha, e continua furtivamente por traz das árvores, percebe um grupo de pessoas se escondendo atraz das arvores e olhando para a trilha.");
                        System.out.println("Não parecem ter te percebido, aparentam ser ladrões, saqueadores, se não seguisse seus instintos provavelmente seria emboscado...");
                        break;

                    default: System.out.println("Você tropeça faz muito barulho e toma uma flechada, aconteceu algo que você não queria que acontecesse.");
                    morte();
                    re = 1;
                }

            }
            }
        return 0;
    }


    public static int fase3() {




        return 0;
    }


    public static void main(String[] args) {

        //prólogo
        System.out.println("Este é um mundo medieval, onde existem centenas de aventureiros buscando se tornarem grandes lendas.");
        System.out.println("Voce, é um desses aventureiros.");
        System.out.println("Sua missão é derrotar o 'Inquisidor', um ser maligno que vem trazendo mal por eras. Para isso, precisa passar pela floresta sombria.");


        //começo
        while(re ==0 ) {
            fase1();
            fase2();
        }

    }

}