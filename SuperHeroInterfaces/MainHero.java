package SuperHeroInterfaces;

public class MainHero {
    public static void main(String[] args) {
        SuperHero hero1 = new SuperHero("Spiderman", 240,450, true, true, true);
        SuperHero hero2 = new SuperHero("Venom", 550, 600, false, true, false);
hero1.ShowInfo();
hero2.ShowInfo();
hero1.CanSwim();
hero2.CanSwim();
hero1.CanFly();
hero2.CanFly();
hero1.CanJump();
hero2.CanJump();
    }
}
