package entities;

public class Champion {

    private String name ;
    private int life;
    private int attack;
    private int armor;

    public int getLife() {
        return life;
    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion outro) {

        int damage = outro.attack - this.armor;

        if (damage <= 0) {
            damage = 1;
        }

        this.life -= damage;

        if (this.life < 0) {
            this.life = 0;
        }
    }


    public String status() {
        return name
                + ": "
                + life
                + " de vida "
                + (life == 0 ? "(morreu)" : "");

    }
}
