public class Mammal{
    protected int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public int displayEnergy(){
        System.out.println("This Mammal's Energy Level is " + this.energyLevel);
        return this.energyLevel;
    }

}