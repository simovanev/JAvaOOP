package _04_WildFArm;

public class Felime extends Mammal{
    public Felime(String animalName, String animalType, String animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound(sound);
    }

    @Override
    protected void eat(Food food) {
        super.eat(food);
    }
}
