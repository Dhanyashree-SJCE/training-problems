class Character
{
    String name;
    Character()
    {
        this.name="raja";
    }
    Character(String name)
    {
        this.name=name;
    }
    void attack()
    {
        System.out.println(name+" attacks");
    }
 } 
 class Warrior extends Character
 {
    Warrior()
    {
        super();
    }
    Warrior(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" attacks with sword");
    }
 }
 class Archer extends Character
 {
    Archer(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" attacks with arrow");
    }

 }
 class Mage extends Character
 {
    Mage(String name)
    {
        super(name);
    }
    @Override
    void attack()
    {
        System.out.println(name+" attack with magic");
    }
 }
 public class Minigame {
    public static void main(String[] args) {
        Character c;
        c= new Archer("Ram");
        c.attack();
        c= new Warrior();
        c.attack();
        c= new  Mage("Rani");
        c.attack(); 

    }
}

