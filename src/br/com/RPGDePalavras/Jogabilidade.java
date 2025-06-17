package br.com.RPGDePalavras;

import java.util.Random;
import java.util.Scanner;

public class Jogabilidade {
    public void joagbilidade(Herois heroi, Inimigos inimigos){
        Scanner digitar = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("");
        System.out.println("**********************************************************************");
        System.out.println("Se pudermos continuar nossa aventura digite Sim: ");
        String continuacao = digitar.next();
        System.out.println("**********************************************************************");
        System.out.println("");

        if (continuacao.equalsIgnoreCase("Sim")) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

            inimigos.fichaPersonagem();
            double vidaHeroi = heroi.getHP();
            double vidaInimigo = inimigos.getHP();

            while (vidaHeroi > 0 && vidaInimigo > 0) {
                int dado = gerador.nextInt(0, 30);

                System.out.println("");
                System.out.println("**********************************************************************");
                System.out.println("Jogue o dado para ver quanto de dando vc vai dar, escreva (Jogar)");
                String JogarDado = digitar.next();
                System.out.println("**********************************************************************");
                System.out.println("");

                if (JogarDado.equalsIgnoreCase("Jogar")) {

                    if (dado > 25 && dado <= 30) {
                        System.out.println("Você tirou o numero: " + dado + " Acerto critico");
                        vidaInimigo -= heroi.getDano() + (heroi.getDano() * 0.1);
                        System.out.println("Dano causado: " + (heroi.getDano() + (heroi.getDano() * 0.1)));
                        inimigos.fichaBatalha();
                        System.out.println("Vida do inimigo atual: " + vidaInimigo);
                        System.out.println("");

                            if (vidaInimigo <= 0){
                            System.out.println("Você eliminou o inimigo, parabéns!!!");
                            System.out.println("");

                        }

                    } else if (dado > 20 && dado <= 25) {
                        System.out.println("Você tirou o numero: " + dado + " você acertou");
                        vidaInimigo -= heroi.getDano();
                        System.out.println("Dano causado: " + heroi.getDano());
                        inimigos.fichaBatalha();
                        System.out.println("Vida do inimigo atual: " + (vidaInimigo));
                        System.out.println("");

                            if (vidaInimigo <= 0){
                            System.out.println("Você eliminou o inimigo, parabéns!!!");
                            System.out.println("");

                        }

                    } else if (dado > 10 && dado <= 20) {
                        System.out.println("Você tirou o numero: " + dado + " você acertou de raspão");
                        vidaInimigo -= heroi.getDano() - (heroi.getDano() * 0.1);
                        System.out.println("Dano causado: " + (heroi.getDano() - (heroi.getDano() * 0.1)));
                        inimigos.fichaBatalha();
                        System.out.println("Vida do inimigo atual: " + (vidaInimigo));
                        System.out.println("");

                            if (vidaInimigo <= 0){
                            System.out.println("Você eliminou o inimigo, parabéns!!!");
                            System.out.println("");
                                System.out.println();

                        }

                    } else if (dado <= 10) {
                        System.out.println("Você tirou o numero: " + dado + " você errou e tomou dano do monstro");
                        vidaHeroi -= inimigos.getDano() + (inimigos.getDano() * 0.1);
                        System.out.println("Dano causado: " + (inimigos.getDano() + (inimigos.getDano() * 0.1)));
                        heroi.fichaBatalha();
                        System.out.println("Vida do seu heroi atualmente é : " + (vidaHeroi));

                        System.out.println("");

                            if (vidaHeroi <= 0){
                            System.out.println("Você morreu!!!");
                            System.out.println("");
                            break;
                        }
                    }
                }
            }
        }
    }
}
