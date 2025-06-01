public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Joaquin";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Health left: " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Health left: " + player.healthRemaining());
        EnhancedPlayer joaquin = new EnhancedPlayer("Joaquin");
        System.out.println("Initial health is " + joaquin.healthRemaining());
        System.out.println(joaquin.getFullName() + "'s default weapon is " + joaquin.getWeapon());

        joaquin.loseHealth(50);
        System.out.println("Health remaining: " + joaquin.healthRemaining());

    }
}
