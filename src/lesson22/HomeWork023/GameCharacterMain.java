package lesson22.HomeWork023;

public class GameCharacterMain {
    public static void main(String[] args) {

       GameCharacter[] gameCharacters = new GameCharacter[3];
       gameCharacters[0] = new Warrior();
       gameCharacters[1] = new Archer();
       gameCharacters[2] = new Mage();
        for (int i = 0; i < gameCharacters.length; i++) {
            gameCharacters[i].attack();
        }


    }
}
