import java.util.ArrayList;
import java.util.List;

class Player1 implements RPGCharacter {
    private int hp = 500;
    private int atk = 50;
    private int mana = 50;
    private int movespeed = 300;
    private String playerClass = "Fighter";
    private List<Accessory> accessoryList = new ArrayList<>();

    @Override
    public int getHP() {
        int extraHP = 0;
        for (Accessory accessory : accessoryList) {
            if (accessory instanceof Knuckle) {
                extraHP += ((Knuckle) accessory).getHPBoost();
            }
        }
        return hp + extraHP;
    }

    @Override
    public int getAtk() {
        int extraAtk = 0;
        for (Accessory accessory : accessoryList) {
            if (accessory instanceof Knuckle) {
                extraAtk += ((Knuckle) accessory).getAtkBoost();
            }
        }
        return atk + extraAtk;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getMovespeed() {
        int extraMS = 0;
        for (Accessory accessory : accessoryList) {
            if (accessory instanceof Boots) {
                extraMS += ((Boots) accessory).getMsBoost();
            }
        }
        return movespeed + extraMS;
    }

    @Override
    public String playerClass() {
        return playerClass;
    }

    @Override
    public void equipAccessory(Accessory accessory) {
        System.out.println("Player1 equipped knuckle");
        accessoryList.add(accessory);
    }

    @Override
    public List<Accessory> getAccessoryList() {
        return accessoryList;
    }

    public void displayAccessories() {
        if (accessoryList.isEmpty()) {
            System.out.println("No accessories equipped.");
        } else {
            System.out.println("Equipped Accessories:");
            for (Accessory accessory : accessoryList) {
                System.out.println("- " + accessory.getClass() + " (Durability: " + accessory.getDurability() + ")");
            }
        }
    }

    // Example action
    public void punch() {
        System.out.println("Player1 throws a powerful punch!");
    }
}

