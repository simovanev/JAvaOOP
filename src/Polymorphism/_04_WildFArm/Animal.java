package Polymorphism._04_WildFArm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private String animalWeight;
    private Integer foodEaten = 0;

    public Animal( String animalType,String animalName,  String animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten += foodEaten;
    }

    protected  void makeSound(String sound) {
        System.out.println(sound);
    }

    protected abstract void eat(Food food);
}
