public class Boots implements Accessory {
    private int durability = 120;
    private int msBoost = 30;

    @Override
    public int getDurability() {
        System.out.println("Your boots durability is " + durability);
        return durability;
    }

    @Override
    public void reduceDurability(int amount) {
        durability -= amount;
        if (durability < 0) durability = 0;
        System.out.println("Your boots durability reduced by " + amount);
    }

    public int getMsBoost() {
        System.out.println("Your boots give you " + msBoost + " ms");
        return msBoost;
    }
}
