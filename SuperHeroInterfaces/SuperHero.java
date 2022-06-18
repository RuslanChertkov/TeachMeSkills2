package SuperHeroInterfaces;

public class SuperHero implements Info, Swimming,Flying,Jumping {
    private String name;
    private int health;
    private int power;
    public boolean abilityToSwim = true;
    public boolean abilityToFly;
    public boolean abilityToJump;

    public SuperHero() {

    }

    public SuperHero(String name, int health, int power, boolean abilityToSwim, boolean abilityToFly, boolean abilityToJump) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.abilityToSwim = abilityToSwim;
        this.abilityToFly = abilityToFly;
        this.abilityToJump = abilityToJump;
    }

    @Override
    public void ShowInfo() {
        System.out.printf("Info about hero: name:%s, health:%d, power:%d\n", this.name, this.health, this.power);
    }

    public void CanSwim() {
        if (abilityToSwim) {
            System.out.printf("Герой %s умеет плавать!\n", this.name);
        } else {
            System.out.printf("Герой %s не умеет плавать!\n", this.name);
        }
    }

    @Override
    public void CanFly() {
        if(abilityToFly){
            System.out.printf("Герой %s умеет летать!\n", this.name);
        }else{
            System.out.printf("Герой %s не умеет летать", this.name);
        }
    }

    @Override
    public void CanJump() {
        if(abilityToJump){
            System.out.printf("Герой %s умеет прыгать!\n", this.name);
        }else{
            System.out.printf("Герой %s не умеет прыгать!", this.name);
        }
    }
}
