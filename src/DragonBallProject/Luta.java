package DragonBallProject;

import java.util.Random;

public class Luta {
    private Guerreiro guerreiro1;
    private Guerreiro guerreiro2;
    private Guerreiro vencedor;
    private Guerreiro perdedor;

    Random random = new Random();

     // Constructor
    public Luta() {
        this.guerreiro1 = null;
        this.guerreiro2 = null;
        this.vencedor = null;
        this.perdedor = null;
    }

    // Getters e Setters
    public Guerreiro getGuerreiro1() {
        return guerreiro1;
    }
    public void setGuerreiro1(Guerreiro guerreiro1) {
        this.guerreiro1 = guerreiro1;
    }
    public Guerreiro getGuerreiro2() {
        return guerreiro2;
    }
    public void setGuerreiro2(Guerreiro guerreiro2) {
        this.guerreiro2 = guerreiro2;
    }
    public Guerreiro getVencedor() {
        return vencedor;
    }
    public void setVencedor(Guerreiro vencedor) {
        this.vencedor = vencedor;
    }
    public Guerreiro getPerdedor() {
        return perdedor;
    }
    public void setPerdedor(Guerreiro perdedor) {
        this.perdedor = perdedor;
    }


    public boolean selecionarConfronto(String nome1, String nome2) {
        GerenciadorGuerreiros gg = new GerenciadorGuerreiros();

        for (Guerreiro g: gg.getLista()) {
            if (nome1 == g.getNome()) {
                setGuerreiro1(g);
            } else {
                System.out.println(nome1 +"não encontrado");
                return false;
            }
            if (nome2 == g.getNome()) {
                setGuerreiro2(g);
            } else {
                System.out.println(nome2 +"não encontrado");
                return false;
            }
        }
        return true;
    }

    public void iniciarLuta() {
        while ( !verificarVencedor(guerreiro1, guerreiro2) ) {
            if (guerreiro1.getVel() > guerreiro2.getVel()) {
                guerreiro1.atacar();
                if (guerreiro1.getXp() * random.nextInt(11) > guerreiro2.getXp() * random.nextInt(11)) {
                    guerreiro2.setHp((int)(guerreiro1.getAtk() - (guerreiro2.getDef() / 2)));
                    System.out.println(guerreiro1.getNome() + ": ataque entrou");
                } else {
                    System.out.println(guerreiro1.getNome() + ": ataque defendido");
                }
            } else {
                guerreiro2.atacar();
                if (guerreiro2.getXp() * random.nextInt(11) > guerreiro1.getXp() * random.nextInt(11)) {
                    guerreiro1.setHp((int)(guerreiro2.getAtk() - (guerreiro1.getDef() / 2)));
                    System.out.println("\n"+ guerreiro2.getNome() + ": ataque entrou");
                } else {
                    System.out.println("\n"+ guerreiro1.getNome() + ": ataque defendido");
                }
            }
        }   
    }

    public boolean verificarVencedor(Guerreiro guerreiro1, Guerreiro guerreiro2) {
        if (guerreiro1.getHp() == 0 | guerreiro2.getHp() == 0) {
            if (guerreiro1.getHp() == 0) {
                setPerdedor(guerreiro1);
                setVencedor(guerreiro2);
            } else {
                setPerdedor(guerreiro2);
                setVencedor(guerreiro1);
            }
            System.out.println("Vencedor: "+getVencedor().getNome()+"Perdedor: "+getPerdedor().getNome());
            return true;    
        }
        else {
            return false;
        }
    }

   
    
}
