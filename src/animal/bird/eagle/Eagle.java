package animal.bird.eagle;
import animal.bird.Bird;

public class Eagle extends Bird{


    public Eagle() {
        super();
        super.height = 10.0F;
        super.weight = 20.0F;

    }

    public String ShowInfo() {
        return "{" +
            " feather='" + super.feather + "'" +
            ", canFly='" + super.canFly + "'" +
            ", height='" + super.height + "'" +
            ", weight='" + super.weight + "'" +
            ", animalType='" + super.animalType + "'" +
            ", BloodType='" + super.bloodType + "'" +
            "}";
    }
    
}
