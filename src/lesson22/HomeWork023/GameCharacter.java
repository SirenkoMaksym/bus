package lesson22.HomeWork023;
/*Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов
персонажей (например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей,
такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */
abstract public class GameCharacter {
   private String name;
   private String ydar;

    public GameCharacter(String name, String ydar) {
        this.name = name;
        this.ydar = ydar;
    }

    public String getName() {
        return name;
    }

    public String getYdar() {
        return ydar;
    }

    abstract public void attack();
}

