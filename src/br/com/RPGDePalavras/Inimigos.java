package br.com.RPGDePalavras;

public class Inimigos extends Personagens{
    private static String maldicao;
    private static String artefatoMalefico;

    public String getArtefatoMalefico() {
        return artefatoMalefico;
    }

    public void setArtefatoMalefico(String artefatoMalefico) {
        this.artefatoMalefico = artefatoMalefico;
    }

    public String getMaldicao() {
        return maldicao;
    }

    public void setMaldicao(String maldicao) {
        this.maldicao = maldicao;
    }

    @Override
    public void fichaPersonagem() {
        System.out.println("Droga um inimigo apareceu!!!");
        System.out.println("");
        super.fichaPersonagem();
        System.out.println("Artefato Maléfico: " + artefatoMalefico);
        System.out.println("Maldição: " + maldicao);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }

}
