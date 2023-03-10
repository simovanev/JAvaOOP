package Polymorphism._03_Animals;

public abstract class Animal {
    private String name;
    private  String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }
    protected   String explainSelf(){
        return String.format("I am %s and my favourite food is %s\n",name,favouriteFood);
    }
}
