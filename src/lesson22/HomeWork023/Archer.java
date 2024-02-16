package lesson22.HomeWork023;

public class Archer extends GameCharacter{

        public Archer() {
            super("Snayper", "swd");
        }


        @Override
        public void attack() {
            System.out.println(getName() + " атакует с помощью " + getYdar());
        }
    }

