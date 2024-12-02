import java.util.List;

interface RPGCharacter {
    int getHP();
    int getAtk();
    int getMana();
    int getMovespeed();
    String playerClass();
    void equipAccessory(Accessory accessory);
    List<Accessory> getAccessoryList();
}