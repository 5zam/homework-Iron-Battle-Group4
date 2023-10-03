import java.util.Random;

public class Wizard extends Character implements Attacker{
    private int mana;
    private int intelligence;

    public Wizard() {
        super();
        Random random = new Random();
        this.mana = random.nextInt(41) + 10; // Generates a random number between 10 and 50
    }


    public Wizard(String name ,int hp , int mana , int intelligence)
    {super(name, hp);
        this.mana=Math.max(10, Math.min(mana, 50));
        this.intelligence= Math.max(1, Math.min(intelligence, 50));

    }



    public void setMana(int stamina) {
        this.mana = stamina; }

    public void setIntelligence(int strength) {
        this.intelligence = strength; }

    public int getMana() {
        return mana; }

    public int getIntelligence() {
        return intelligence; }



    // void Attacker (int stamina, int strength){
    //  int Heavy , Weak; }

    public void attack(Character target) {
        Random random = new Random();
        boolean isFireball = random.nextBoolean();

        if (isFireball && mana >= 5)
        { target.setHp(target.getHp() - intelligence);
            mana -= 5;}
        else if (mana > 0)
        { target.setHp(target.getHp() - 2);
            mana -= 1;}
        else {mana += 2;}
    }



}


