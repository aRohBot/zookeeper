public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("Flap Flap");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("so- well, never mind");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("AHHHHHHHHHHHHHHH TOWN IS ON FIREEEE");
        this.energyLevel -= 100;
    }



}
