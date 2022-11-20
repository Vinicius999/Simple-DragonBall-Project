package DragonBallProject;

public class Sayajin extends Guerreiro implements Extraterreste {
    private int superSayajin;

    // Constructor
    public Sayajin(String nome, int hp, int xp, int atk, int def, int vel, int superSayajin) {
        super(nome, hp, xp, atk, def, vel);
        this.superSayajin = superSayajin;
    }

    // Getters e Setters
    public int getSuperSayajin() {
        return superSayajin;
    }
    public void setSuperSayajin(int superSayajin) {
        this.superSayajin = superSayajin;
    }
    
    @Override
    public void atacar() {
        // implementações completa futuramente
        System.out.println(getNome()+" ataca!");
    }

    @Override
    public String imprimir() {
        return "Sayajin [Nome=" + super.getNome() + ", HP=" + super.getHp() + ", XP=" + super.getXp() + ", ATK="
        + super.getAtk() + ", DEF=" + super.getDef() + ", Vel=" + super.getVel() + "]";
    }

    @Override
    public void transformacao() {
        setSuperSayajin(getSuperSayajin() + 1);
        System.out.println(getNome()+" se transforma em Super Sayajin "+ getSuperSayajin());
        setHp((getSuperSayajin()+1) * getHp());
        setXp((getSuperSayajin()+1) * getXp());
        setAtk((getSuperSayajin()+1) * getAtk());
        setDef((getSuperSayajin()+1) * getDef());
        setVel((getSuperSayajin()+1) * getVel());
    }

}
