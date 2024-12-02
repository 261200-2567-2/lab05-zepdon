public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        Knuckle knuckle = new Knuckle();
        Boots boots = new Boots();

        player1.equipAccessory(knuckle);
        player2.equipAccessory(boots);

        System.out.println("\nPlayer1 Class: " + player1.playerClass());
        System.out.println("HP: " + player1.getHP());
        System.out.println("Attack: " + player1.getAtk());
        System.out.println("Mana: " + player1.getMana());
        System.out.println("Movespeed: " + player1.getMovespeed());
        player1.displayAccessories();

        System.out.println("\nPlayer2 Class: " + player2.playerClass());
        System.out.println("HP: " + player2.getHP());
        System.out.println("Attack: " + player2.getAtk());
        System.out.println("Mana: " + player2.getMana());
        System.out.println("Movespeed: " + player2.getMovespeed());
        player2.displayAccessories();

        System.out.println("\n");
        player1.punch();
        knuckle.reduceDurability(10);
        System.out.println("Knuckle durability after punch: " + knuckle.getDurability());

        player2.backstab();
        boots.reduceDurability(15);
        System.out.println("Boots durability after backstab: " + boots.getDurability());
    }
}