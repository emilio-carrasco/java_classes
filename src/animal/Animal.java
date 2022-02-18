package animal;

public class Animal {
    protected Float height;
    protected Float weight;
    protected String animalType;
    protected String bloodType;


    public Animal() {
        this.height = 0.0F;
        this.weight = 0.0F;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }


    public String ShowInfo() {
        return "{" +
            " height='" + height + "'" +
            ", weight='" + weight + "'" +
            ", animalType='" + animalType + "'" +
            ", BloodType='" + bloodType + "'" +
            "}";
    }
    
}
