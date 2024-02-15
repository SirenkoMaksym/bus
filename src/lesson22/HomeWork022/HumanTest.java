package lesson22.HomeWork022;

public class HumanTest {


    public static void main(String[] args) {
        Human human = new Human("Vasya");
        human.run();
        Human human1 = new AmateurSportsman("Kolya");
        human1.run();
        Human human2= new ProfessionalSportsman("PEtya");
        human2.run();
    }

}
