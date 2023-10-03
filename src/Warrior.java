import java.util.Random;

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


    public void attack(Character character) {
        if(stamina>0){
            Random r= new Random();
            int damage = r.nextInt(strength)+1;
            int hp= character.getHp();
            character.setHp(hp- damage);
            stamina -= 5;
            System.out.println(getName() + " attack with heavy attack and causing "+ damage+" damage ");
            System.out.println(getName() + "stamina: "+ stamina);
        }
        else {
            weekAttack(character);
        }
    }

    private void weekAttack(Character character) {
        int damage = strength/2;
        int hp= character.getHp();
        character.setHp(hp-damage);
        stamina +=1;
        System.out.println(getName() + " attack with heavy attack and causing "+ damage + " damage");

        System.out.println("pall work");
    }
}
