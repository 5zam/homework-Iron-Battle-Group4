import java.util.Random;

public abstract class  Character {
    private String id;
    private int hp;
    private String name;
    private boolean isAlive;

    public Character(String id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }
    public Character(String name, int hp) {
        this.name = name;
        this.hp=hp;
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


    /*public boolean isAlive() { return true;
    }*/
    //public abstract String attack();

    public void setName(String name) {
        this.name =name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    private String generateId(){
        Random random=new Random();
        int idnumber=random.nextInt(900000)+100000;
        return String.valueOf(idnumber);
    }


}
