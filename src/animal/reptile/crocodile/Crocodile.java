package animal.reptile.crocodile;
import animal.reptile.Reptile;
public class Crocodile extends Reptile{
    private String egg;
    public Crocodile() {
        egg = "hard shell";
    }
    public String ShowInfo() {
        return "{" +
            " egg='" + egg +
            "', Skin= '" + super.skin +
            "' , backBone= " + super.backBone +
            ", height= " + super.height +
            ", weight= " + super.weight +
            ", animalType= " + super.animalType +
            ", bloodType= " + super.bloodType +
            "}";
    }

}
