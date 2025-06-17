package br.com.RPGDePalavras;

public class Herois extends Personagens {
    private String hablidade;
    private String arma;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getHablidade() {
        return hablidade;
    }

    public void setHablidade(String hablidade) {
        this.hablidade = hablidade;
    }


    @Override
    public void fichaPersonagem() {


        System.out.println("");
        super.fichaPersonagem();
        System.out.println("Arma: " + arma);
        System.out.println("Habilidade: " + hablidade);
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

}
