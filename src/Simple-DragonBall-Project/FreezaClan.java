package DragonBallProject;

public class FreezaClan extends Guerreiro implements Extraterreste {
    public FreezaClan(String nome, int hp, int xp, int atk, int def, int vel) {
        super(nome, hp, xp, atk, def, vel);
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
    }

    @Override
    public String imprimir() {
        return "FreezaClan [Nome=" + super.getNome() + ", HP=" + super.getHp() + ", XP=" + super.getXp() + ", ATK="
        + super.getAtk() + ", DEF=" + super.getDef() + ", Vel=" + super.getVel() + ", lista=" + super.getLista() + "]";
    }

    @Override
    public void transformacao() {
        // TODO Auto-generated method stub
        
    }
}
