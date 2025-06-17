package br.com.RPGDePalavras;

public class Personagens {
    private String nome;
    private  int HP;
    private  int dano;
    private String elemento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    void fichaPersonagem(){
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + HP);
        System.out.println("Dano atual: " + dano);
        System.out.println("Elemento: " + elemento);
    }
    void fichaBatalha(){
        System.out.println("Nome: " + nome);
        System.out.println("Dano atual do personagem: " + dano);
        System.out.println("Elemento: " + elemento);
    }

}
