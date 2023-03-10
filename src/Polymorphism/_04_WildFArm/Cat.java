package Polymorphism._04_WildFArm;

public class Cat extends Felime{
    private  String breed;

    public Cat( String animalType,String animalName, String animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed= breed;
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound("Meowwww");
    }

    @Override
    public void eat(Food food) {

            super.eat(food);

    }

    @Override
    public String toString() {

        return String.format("%s[%s, %s, %s, %s, %d]\n",
                getClass().getSimpleName(),
                getAnimalName(),
                breed,
                getAnimalWeight(),
                getLivingRegion(),
                getFoodEaten());
    }
}
