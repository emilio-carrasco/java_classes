import animal.reptile.crocodile.Crocodile;
import animal.reptile.Reptile;
import animal.fish.eel.Eel;
import animal.fish.Fish;
import animal.bird.Bird;
import animal.bird.eagle.Eagle;
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Animal animal = new Animal();
         * System.out.println(animal.ShowInfo());
         */

        /*
         * Crocodile crocodile = new Crocodile();
         * System.out.println(crocodile.ShowInfo());
         * 
         * Reptile reptile = new Reptile();
         * System.out.println(reptile.ShowInfo());
         */

        /*
         * Eel eel = new Eel();
         * System.out.println(eel.ShowInfo());
         * 
         * Fish fish = new Fish();
         * System.out.println(fish.ShowInfo());
         */

         Bird bird = new Bird();
         System.out.println(bird.ShowInfo());

         Eagle eagle = new Eagle();
         System.out.println(eagle.ShowInfo());
        
    }
}
