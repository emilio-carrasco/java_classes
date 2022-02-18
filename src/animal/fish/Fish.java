package animal.fish;
import animal.Animal;
public class Fish extends Animal{
    protected Boolean livesInWater, gills;

    public Fish() {
        this.livesInWater = true;
        this.gills = true;
        super.animalType = "fish";
        super.bloodType = "cold";
    
    }

    
}
