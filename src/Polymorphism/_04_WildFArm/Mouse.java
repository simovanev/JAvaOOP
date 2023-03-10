package Polymorphism._04_WildFArm;

public class Mouse extends  Mammal{
    public Mouse(String animalType,String animalName,  String animalWeight, String livingRegion) {
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

        return String.format("%s[%s, %s, %s, %d]\n",
                getClass().getSimpleName(),
                getAnimalName(),
                getAnimalWeight(),
                getLivingRegion(),
                getFoodEaten());
    }
}
