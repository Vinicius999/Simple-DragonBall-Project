package DragonBallProject;

public class FreezaClan extends Guerreiro implements Extraterreste {
    private int forma;

    // Constructor
    public FreezaClan(String nome, int hp, int xp, int atk, int def, int vel, int forma) {
        super(nome, hp, xp, atk, def, vel);
        this.forma = forma;
    }

    // Getters e Setters
    public int getForma() {
        return forma;
    }
    public void setForma(int forma) {
        this.forma = forma;
    }

    @Override
    public void atacar() {
        // implementações futuras
        System.out.println(getNome()+" ataca!");
    }

    @Override
    public String imprimir() {
        return "FreezaClan [Nome = " + super.getNome() + ", HP = " + super.getHp() + ", XP = " + super.getXp() + ", ATK = "
        + super.getAtk() + ", DEF =" + super.getDef() + ", Vel = " + super.getVel() + "]";
    }

    @Override
    public void transformacao() {
        System.out.println(getNome()+" assume a forma "+ getForma());
    }

}
