package animal.reptile;
import animal.Animal;
public class Reptile extends Animal{
    protected String skin, eggs;
    protected Boolean backBone;


    public Reptile() {
        this.skin = "Dry";
        this.eggs = "soft shelled";
        this.backBone = true;
        super.height = 5.0F;
        super.weight = 20.0F;
        super.animalType = "reptile";
        super.bloodType = "cold";

    }
    public String ShowInfo() {
        return "{" +
            " skin='" + skin + "'" +
            ", eggs='" + eggs + "'" +
            ", backBone='" + backBone + "'" +
            ", height='" + super.height + "'" +
            ", weight='" + super.weight + "'" +
            ", animalType='" + super.animalType + "'" +
            ", bloodType='" + super.bloodType + "'" +
            "}";
    }


    
}
