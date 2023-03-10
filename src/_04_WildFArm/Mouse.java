package _04_WildFArm;

public class Mouse extends  Mammal{
    public Mouse(String animalName, String animalType, String animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
    @Override
    public String toString() {

        return String.format("%S[%s, %s, %s, %d]\n",
                getClass().getSimpleName(),
                getAnimalName(),
                getAnimalWeight(),
                getLivingRegion(),
                getFoodEaten());
    }
}
