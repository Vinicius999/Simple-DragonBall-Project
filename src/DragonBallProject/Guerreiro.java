package DragonBallProject;

import java.util.ArrayList;

public abstract class Guerreiro {
    private String nome;
    private int hp;
    private int xp;
    private int atk;
    private int def;
    private int vel;

    // Implementações futuras
    //ArrayList<Luta> lista = new ArrayList<Luta>();
    
    // Constructor
    public Guerreiro(String nome, int hp, int xp, int atk, int def, int vel) {
        this.nome = nome;
        this.hp = hp;
        this.hp = xp;
        this.atk = atk;
        this.def = def;
        this.vel = vel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.vel = vel;
    }

    // Métodos abstratos
    public abstract void atacar();
        // Incrementa/decrementa os atributos do guerreiro
    public abstract String imprimir();
        // Seria o método toString
        // Retorna as informações do funcionário

    
 
}
