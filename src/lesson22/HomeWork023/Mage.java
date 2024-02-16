package lesson22.HomeWork023;

public class Mage extends GameCharacter{

    public Mage() {
        super("Garry Potter", "Adaba Kedavra!!");
    }


    @Override
    public void attack() {
        System.out.println(getName() + " атакует с помощью " + getYdar());
    }
}
