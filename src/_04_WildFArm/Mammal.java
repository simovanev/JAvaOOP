package _04_WildFArm;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, String animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound(String sound) {
        super.makeSound(sound);
    }

    @Override
    protected void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }
}
