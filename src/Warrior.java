public class Warrior extends Character{
    private int stamina;
    private int strength;

    //setter

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //getter
    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
