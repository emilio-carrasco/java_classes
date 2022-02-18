package animal.bird;

import animal.Animal;

public class Bird extends Animal{
    protected Boolean feather,canFly;
    
    public Bird() {
        super();
        this.feather = true;
        this.canFly = true;
        super.animalType = "bird";
        super.bloodType = "warm";

    }


    public String ShowInfo() {
        return "{" +
            " feather='" + feather + "'" +
            ", canFly='" + canFly + "'" +
            ", height='" + super.height + "'" +
            ", weight='" + super.weight + "'" +
            ", animalType='" + super.animalType + "'" +
            ", BloodType='" + super.bloodType + "'" +
            "}";
    }

}
