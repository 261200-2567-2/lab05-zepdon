public class Knuckle implements Accessory {
    private int durability = 100;
    private int atkBoost = 60;
    private int HPBoost = 60;

    @Override
    public int getDurability() {
        System.out.println("Your knuckle durability is " + durability);
        return durability;
    }

    @Override
    public void reduceDurability(int amount) {
    durability -= amount;
    if (durability < 0) durability = 0;
    System.out.println("Your knuckle durability reduced by " + amount);
    }

    public int getAtkBoost() {
        System.out.println("knuckle give you " + atkBoost + " atk");
        return atkBoost;
    }

    public int getHPBoost() {
        System.out.println("Knuckle give your " + HPBoost + " HP");
        return HPBoost;
    }
}
