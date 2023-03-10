package Polymorphism._04_WildFArm;

public class Zebra extends Mammal{
    public Zebra(String animalType,String animalName,  String animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")){
        super.eat(food);

        }else System.out.println("Zebras are not eating that type of food");
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
