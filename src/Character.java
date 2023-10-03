public abstract class  Character {
    private int hp;
    private String name;

    public Character(String name, int hp) {
    }

    public Character() {

    }

    protected int getHp() {
        return hp;
    }

    protected void setHp(int i) {

    }

    public String getName() {
        return name;
    }

    public boolean isAlive() { return true;
    }
    //public abstract String attack();
}
