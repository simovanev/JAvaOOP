package _04_WildFArm;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, String animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound("ROAAR!!!");
    }

    @Override
    protected void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            super.eat(food);
        }else System.out.println("Tigers are not eating that type of food!");

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
