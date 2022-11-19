package DragonBallProject;

public class Humano extends Guerreiro {

    public Humano(String nome, int hp, int xp, int atk, int def, int vel) {
        super(nome, hp, xp, atk, def, vel);
    }

    @Override
    public void atacar() {
        // implementações futuras
        System.out.println(getNome()+" ataca!");
    }

    @Override
    public String imprimir() {
        return "Humano [Nome=" + super.getNome() + ", HP=" + super.getHp() + ", XP=" + super.getXp() + ", ATK="
        + super.getAtk() + ", DEF=" + super.getDef() + ", Vel=" + super.getVel() + "]";
    }
    
}
