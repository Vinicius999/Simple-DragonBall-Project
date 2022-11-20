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


    public boolean selecionarConfronto(GerenciadorGuerreiros gerenG, String nome1, String nome2) {
        boolean achou1 = false;
        boolean achou2 = false;
        for (Guerreiro g: gerenG.lista) {
            if ( nome1.toUpperCase().equals(g.getNome().toUpperCase()) ) {
                System.out.println(nome1.toUpperCase() + " vs " + g.getNome().toUpperCase());
                setGuerreiro1(g);
                achou1 = true;
            }
            if (nome2.toUpperCase().equals(g.getNome().toUpperCase())) {
                System.out.println(nome2.toUpperCase() + " vs " + g.getNome().toUpperCase());
                setGuerreiro2(g);
                achou2 = true;
            }
        }
        if (!achou1) {
            System.out.println(nome1 + " não encontrado!");
            return false;
        } else if (!achou2) {
            System.out.println(nome2 + " não encontrado!");
            return false;
        } else {
            return true;
        }
    }

    public void iniciarLuta() {
        
        boolean ataca;
        if (guerreiro1.getVel() >= guerreiro2.getVel()) {
            ataca = true;
        } else {
            ataca = false;
        }

        int count1 = 0;
        int count2 = 0;
        while ( ! (verificarVencedor(guerreiro1, guerreiro2)) ) {

            if ((count1 % 10) == 0 || count1 < 41) {
                if (guerreiro1 instanceof Sayajin) {
                    Sayajin sj01 = (Sayajin) guerreiro1;
                    sj01.transformacao();
                }
            }
            else if ((count1 % 8) == 0 || count1 < 25) {
                if (guerreiro1 instanceof FreezaClan) {
                    FreezaClan fz01 = (FreezaClan) guerreiro1;
                    fz01.transformacao();
                }
            }
             
            if ((count2 % 10) == 0 || count2 < 41) {
                if (guerreiro2 instanceof Sayajin) {
                    Sayajin sj02 = (Sayajin) guerreiro1;
                    sj02.transformacao();
                }
            }
            else if ((count2 % 8) == 0 || count1 < 25) {
                if (guerreiro2 instanceof FreezaClan) {
                    FreezaClan fz02 = (FreezaClan) guerreiro2;
                    fz02.transformacao();
                } 
            }
                
            if (ataca) {
                guerreiro1.atacar();
                count1 ++;
                if (guerreiro1.getXp() * random.nextInt(11) >= guerreiro2.getXp() * random.nextInt(11)) {
                    guerreiro2.setHp(guerreiro1.getHp() - (int)(guerreiro1.getAtk() - (guerreiro2.getDef() / 2)));
                    System.out.println(guerreiro1.getNome() + ": ataque gerou dano");
                }
                else {
                    System.out.println(guerreiro1.getNome() + ": ataque defendido");
                }
            }
            ataca = true;
            if (ataca) {
                if (! (verificarVencedor(guerreiro1, guerreiro2)) ) {
                    guerreiro2.atacar();
                    count2 ++;
                    if ((guerreiro2.getXp() * random.nextInt(11)) >= (guerreiro1.getXp() * random.nextInt(11))) {
                        guerreiro1.setHp(guerreiro2.getHp() - (int)(guerreiro2.getAtk() - (guerreiro1.getDef() / 2)));
                        System.out.println("\n"+ guerreiro2.getNome() + ": ataque gerou dano");
                    }
                    else {
                        System.out.println("\n"+ guerreiro2.getNome() + ": ataque defendido");
                    }
                }
            }

            System.out.println(guerreiro1.getNome() + ":" + guerreiro1.getHp());
            System.out.println(guerreiro2.getNome() + ":" + guerreiro2.getHp());  
        } 
    }

    public boolean verificarVencedor(Guerreiro g01, Guerreiro g02) {
        if ((g01.getHp() <= 0) || (g02.getHp() <= 0)) {
            if (g01.getHp() <= 0) {
                setPerdedor(g01);
                setVencedor(g02);
            } else {
                setPerdedor(g02);
                setVencedor(g01);
            }
            System.out.println("Vencedor: "+getVencedor().getNome()+"\nPerdedor: "+getPerdedor().getNome());
            return true;    
        }
        else {
            return false;
        }
    }
}
