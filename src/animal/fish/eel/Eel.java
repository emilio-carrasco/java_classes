package animal.fish.eel;
import animal.fish.Fish;
public class Eel extends Fish {
    private Boolean releaseElectriCharge;

    public Eel() {
        this.releaseElectriCharge = true;
    }
    

    public String ShowInfo() {
        return "{" +
            " releaseElectriCharge= " + releaseElectriCharge +
            "', gills= '" + super.gills +
            "', livesInWater= " + super.livesInWater +
            "', height= '" + super.height +
            "', weight= '" + super.weight +
            "', animalType= '" + super.animalType +
            "', bloodType= '" + super.bloodType 
            +"}";
    }
}
