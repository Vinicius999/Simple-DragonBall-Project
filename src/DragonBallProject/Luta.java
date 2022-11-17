package DragonBallProject;

public class Luta {
    private Guerreiro guerreiro1;
    private Guerreiro guerreiro2;
    private Guerreiro ganhador;
    private Guerreiro perdedor;

     // Constructor
    public Luta(Guerreiro guerreiro1, Guerreiro guerreiro2, Guerreiro ganhador, Guerreiro perdedor) {
        this.guerreiro1 = guerreiro1;
        this.guerreiro2 = guerreiro2;
        this.ganhador = ganhador;
        this.perdedor = perdedor;
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
    public Guerreiro getGanhador() {
        return ganhador;
    }
    public void setGanhador(Guerreiro ganhador) {
        this.ganhador = ganhador;
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
            }
            if (nome2 == g.getNome()) {
                setGuerreiro2(g);
            }
            return true;
        }
        return false;
    }

    public void iniciarLuta() {
        if (guerreiro1.getVel() > guerreiro2.getVel()) {
            guerreiro1.atacar();
        } else {
            guerreiro2.atacar();
        }
    }
/* 
    public void verificarGanhador(Guerreiro guerreiro1, Guerreiro guerreiro2) {
        
    }:
*/
   
    
}