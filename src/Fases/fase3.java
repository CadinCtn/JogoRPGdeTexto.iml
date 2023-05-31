package Fases;
import java.util.Scanner;
import Jogo_aula2.Jogo;

import funcoes.DADO;
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

                    break;

                case 2:
                    System.out.println("Você da a volta pelo perímetro da fortaleza, estranhamente parece não haver nenhum guarda de vigia. Você encontra uma entrada lateral.");
                    System.out.println("Você abre a porta...\nO que vê é assustador de certa forma, é uma sala do trono, onde do outro lado do grande salão você consegue enchergar uma grande porta\nmuitos guardas, criaturas, monstros olhando para ela em guarda, como se esperassem algo, talvez a chegada de alguem...");
                    System.out.println("Ao seu lado, um trono gigantesco em uma superfície mais alta, com uma grande figura assustadora sentado nele.");
                    System.out.println("Essa... coisa, no trono, tem uma brilhante coroa em sua cabeça, parece que você encontrou o quem procurava, você está na presença do inquisidor!");
                    System.out.println("No entanto, você entrou por uma pequena porta que fica escondida ao lado do trono, parece ser uma rota de fuga secreta, para o  Inquisidor caso ele precisasse.");
                    System.out.println("Por sorte ninguem, nem os guardas, monstros e criaturas que fazem parte da guarda pessoal do rei parecem ter te percebido, eles estão concentrados demais na porta a frente deles.");
                    System.out.println("Teste de Furtividade\nRole um D20:");
                    String entrada  = le.nextLine();

                    DADO.dado = (byte) DADO.d20();
                    System.out.println(DADO.dado);


                    if(DADO.dado >= 1) {
                        System.out.println("Você DESASTROZAMENTE derruba um candelabro esbarrando nele fazendo-o cair, antes de chegar ao chão e fazer um grande barulho que alertará a todos,\n o candelabro para a poucos centimetros do chão, estranhamente os guardas ficaram imóveis, parece que o tempo parou, e só você consegue se mover, quando se da conta\no Inquisidor começa a le levantar lentamente");
                        System.out.println("'Ora ora, o que temos aqui' - ele diz com uma voz grossa e áspera, ' o quão insignificante alguem precisa ser para quee entre em meu castelo sem eu perceber sua presença?'");
                        System.out.println("'O quanto desprovido de poder precisa ser para que EU, não perceba sua presença, eu sinto a tudo e todos...'");
                        System.out.println("'Ah, espera, você tirou 1'\n'HAHAHAHAHAHAHAHAHAHAHAHAHA\n'Bom, ok, faz sentido, você é bem azarado, então vou fazer um favor para você, e se você ganhasse o jogo por ter tirado o pior resultado?");
                    }
            }
        }
    }
}
