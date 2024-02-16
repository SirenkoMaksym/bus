package lesson22.HomeWork023;

import javax.sound.midi.Soundbank;

public class Warrior extends GameCharacter{
    public Warrior() {
        super("Warrior", "sword");
    }


    @Override
    public void attack() {
        System.out.println(getName()+ " атакует с помощью " + getYdar());
    }
}
