package Fases;
import java.util.Scanner;
import funcoes.DADO;
import funcoes.beleleu;

public class castelo {
    static Scanner le = new Scanner(System.in);
    public static void castelo() {
        System.out.println("Você da a volta pelo perímetro da fortaleza, estranhamente parece não haver nenhum guarda de vigia. Você encontra uma entrada lateral.");
        System.out.println("Você abre a porta...\nO que vê é assustador de certa forma, é uma sala do trono, onde do outro lado do grande salão você consegue enchergar uma grande porta\nmuitos guardas, criaturas, monstros olhando para ela em guarda, como se esperassem algo, talvez a chegada de alguem...");
        System.out.println("Ao seu lado, um trono gigantesco em uma superfície mais alta, com uma grande figura assustadora sentado nele.");
        System.out.println("Essa... coisa, no trono, tem uma brilhante coroa em sua cabeça, parece que você encontrou quem procurava, você está na presença do inquisidor!");
        System.out.println("No entanto, você entrou por uma pequena porta que fica escondida ao lado do trono, parece ser uma rota de fuga secreta, para o  Inquisidor caso ele precisasse.");
        System.out.println("Por sorte ninguem, nem os guardas, monstros e criaturas que fazem parte da guarda pessoal do rei parecem ter te percebido, eles estão concentrados demais na porta a frente deles.");
        System.out.println("Teste de Furtividade\nRole um D20:");
        String entrada = le.nextLine();

        DADO.dado = (byte) DADO.d20();
        System.out.println(DADO.dado);


        if(DADO.dado == 1) {
            System.out.println("Você DESASTROZAMENTE derruba um candelabro esbarrando nele fazendo-o cair, antes de chegar ao chão e fazer um grande barulho que alertará a todos,\n o candelabro para a poucos centimetros do chão, estranhamente os guardas ficaram imóveis, parece que o tempo parou, e só você consegue se mover, quando se da conta\no Inquisidor começa a le levantar lentamente");
            System.out.println("'Ora ora, o que temos aqui' - ele diz com uma voz grossa e áspera, ' o quão insignificante alguem precisa ser para quee entre em meu castelo sem eu perceber sua presença?'");
            System.out.println("'O quanto desprovido de poder precisa ser para que EU, não perceba sua presença, eu sinto a tudo e todos...'");
            System.out.println("'Ah, espera, você tirou 1'\n'HAHAHAHAHAHAHAHAHAHAHAHAHA\n'Bom, ok, faz sentido, você é bem azarado, então vou fazer um favor para você, e se você ganhasse o jogo por ter tirado o pior resultado?");
            System.out.println("Bom, parabéns, você ganhou o jogo!");
        }else if(DADO.dado == 20) {
            System.out.println("Você não faz nenhum ruído, nem mesmo uma barulho, e de repente percebe que tudo está quieto de mais, parado demais, parece que tudo está paralizado\napenas você consegue se mover, o tempo parou...");
            System.out.println("Você ouve uma voz grossa e áspera vindo do grande trono:\n  - 'Ora ora, parece que você é um dos sortudos, conseguiu tirar o melhor número'");
            System.out.println("' Você é sortudo de mais, ja ganhou de mais, está na hora de PEDER'");
            beleleu.morte();
        }else {
            System.out.println("Você esbarra em um candelabro que cai em cima de uma corda desamarrando-a, essa corda segurava um grande lustre de velas no teto do castelo.");
            System.out.println("O lustre cai em cima de todos os soldados e o mini exército que fazia parte da guarda pessoal do rei.");
            System.out.println("O rei assustado le vanta do trono e tropeça em cima do gigantesco lustre agora em chamas por causa das velas que tinha para iluminar, todos morrem...");
            System.out.println("Parabéns você concluiu seu objetivo de derrotar o Inquisidor, ganhou o jogo(de forma bem sem graça)...");
        }
    }
}
