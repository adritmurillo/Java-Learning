public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if (health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if (health > 100){
            System.out.println("Player restored to maximum health");
            health = 100;
        }
    }
}
