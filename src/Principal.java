import br.com.RPGDePalavras.Herois;
import br.com.RPGDePalavras.Inimigos;
import br.com.RPGDePalavras.Jogabilidade;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

            Scanner digitar = new Scanner(System.in);
            Random gerador = new Random();
            Jogabilidade jogar = new Jogabilidade();


            Inimigos necromante = new Inimigos();
            necromante.setNome("Zul’Vor - O Necromante Profano");
            necromante.setArtefatoMalefico("Tomo das Almas Perdidas");
            necromante.setHP(100);
            necromante.setDano(30);
            necromante.setElemento("Sombras");
            necromante.setMaldicao("Chamado dos Mortos+");

            Inimigos vampira = new Inimigos();
            vampira.setNome("Lilith - A Dama da Meia-Noite");
            vampira.setArtefatoMalefico("Anel de Sangue Eterno");
            vampira.setHP(95);
            vampira.setDano(28);
            vampira.setElemento("Escuridão");
            vampira.setMaldicao("Sedução Sombria");

            Inimigos golem = new Inimigos();
            golem.setNome("Grakthor - Golem de Pedra Ancestral");
            golem.setArtefatoMalefico("Coração de Obsidiana");
            golem.setHP(160);
            golem.setDano(20);
            golem.setElemento("Pedra");
            golem.setMaldicao("Resistência Titânica");

            Inimigos banshee = new Inimigos();
            banshee.setNome("Sirena - A Banshee Lamentadora");
            banshee.setArtefatoMalefico("Colar do Lamento");
            banshee.setHP(85);
            banshee.setDano(32);
            banshee.setElemento("Espírito");
            banshee.setMaldicao("Grito Mortal ");

            Inimigos cavaleiroCorrompido = new Inimigos();
            cavaleiroCorrompido.setNome("Draven - O Cavaleiro Corrompido");
            cavaleiroCorrompido.setArtefatoMalefico("Espada Negra do Destino");
            cavaleiroCorrompido.setHP(120);
            cavaleiroCorrompido.setDano(38);
            cavaleiroCorrompido.setElemento("Trevas");
            cavaleiroCorrompido.setMaldicao("Marca da Ruína");

            Inimigos demonio = new Inimigos();
            demonio.setNome("Azaroth - O Demônio da Ira");
            demonio.setArtefatoMalefico("Tridente de Lavas");
            demonio.setHP(140);
            demonio.setDano(45);
            demonio.setElemento("Fogo");
            demonio.setMaldicao("Inferno Ardente");

            Inimigos ceifador = new Inimigos();
            ceifador.setNome("Mortus - O Ceifador de Almas");
            ceifador.setArtefatoMalefico("Foice do Crepúsculo");
            ceifador.setHP(110);
            ceifador.setDano(36);
            ceifador.setElemento("Morte");
            ceifador.setMaldicao("Toque da Morte ");

            Inimigos goblin = new Inimigos();
            goblin.setNome("Fatter - Rei Dos Goblins");
            goblin.setArtefatoMalefico("Katana Sangrenta");
            goblin.setHP(110);
            goblin.setDano(35);
            goblin.setElemento("Terra");
            goblin.setMaldicao("Noite Sombria");

            Inimigos bruxa = new Inimigos();
            bruxa.setNome("Morganna - A Bruxa da Névoa");
            bruxa.setArtefatoMalefico("Cajado da Ilusão");
            bruxa.setHP(90);
            bruxa.setDano(25);
            bruxa.setElemento("Ar");
            bruxa.setMaldicao("Névoa Mental");

            Inimigos serpente = new Inimigos();
            serpente.setNome("Nagazul - A Serpente Infernal");
            serpente.setArtefatoMalefico("Presas Venenosas");
            serpente.setHP(130);
            serpente.setDano(40);
            serpente.setElemento("Fogo");
            serpente.setMaldicao("Corrupção Flamejante");

            List<Inimigos> inimigos = new ArrayList<>(Arrays.asList(
                    goblin, bruxa, serpente, ceifador, demonio,
                    cavaleiroCorrompido, banshee, golem, vampira, necromante
            ));



            Herois arqueiro = new Herois();
            arqueiro.setNome("Eduart - O Arqueiro Divino");
            arqueiro.setArma("Arco");
            arqueiro.setHP(110);
            arqueiro.setDano(15);
            arqueiro.setElemento("Vento");
            arqueiro.setHablidade("Velocidade de Disparo");

            System.out.println("Personagem = 1");

            arqueiro.fichaPersonagem();


            Herois mago = new Herois();
            mago.setNome("Faille - O Mago da Penitência");
            mago.setArma("Cajado");
            mago.setHP(90);
            mago.setDano(25);
            mago.setElemento("Fogo ");
            mago.setHablidade("Dano em Àrea");

            System.out.println("Personagem = 2");
            mago.fichaPersonagem();


            Herois cavalheiro = new Herois();
            cavalheiro.setNome("Ghost - O Cavalheiro Sagrado");
            cavalheiro.setArma("Espada");
            cavalheiro.setHP(180);
            cavalheiro.setDano(40);
            cavalheiro.setElemento("Terra");
            cavalheiro.setHablidade("Dano extra por Fúria");

            System.out.println("Personagem = 3");

            cavalheiro.fichaPersonagem();


        System.out.println("Escolha um dos personagens acima:  ");
        int numPersonagem = digitar.nextInt();
        

            if (numPersonagem == 1) {

                System.out.println("Você escolheu: ");
                arqueiro.fichaPersonagem();

                        while(inimigos.size() != 0) {
                                Inimigos inimigoSorteado = inimigos.get(gerador.nextInt(inimigos.size()));
                                jogar.joagbilidade(arqueiro, inimigoSorteado);
                                inimigos.remove(inimigoSorteado);
                                System.out.println("Sua Jornada de batalhas acabou, Obrigado por jogar!!");
                        }
            } else if (numPersonagem == 2) {

                System.out.println("Você escolheu: ");
                mago.fichaPersonagem();

                        while(inimigos.size() != 0) {
                                Inimigos inimigoSorteado = inimigos.get(gerador.nextInt(inimigos.size()));
                                jogar.joagbilidade(mago, inimigoSorteado);
                                 inimigos.remove(inimigoSorteado);
                                System.out.println("Sua Jornada de batalhas acabou, Obrigado por jogar!!");
                        }
            } else if (numPersonagem == 3) {
                System.out.println("Você escolheu: ");
                cavalheiro.fichaPersonagem();

                        while(inimigos.size() != 0) {
                                Inimigos inimigoSorteado = inimigos.get(gerador.nextInt(inimigos.size()));
                                jogar.joagbilidade(cavalheiro, inimigoSorteado);
                                inimigos.remove(inimigoSorteado);
                                System.out.println("Sua Jornada de batalhas acabou, Obrigado por jogar!!");
                        }
            }
    }
}

