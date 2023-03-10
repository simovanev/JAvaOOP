package Polymorphism._04_WildFArm;

public class Vegetable extends Food{
    public Vegetable(Integer quantity) {
        super(quantity);
    }

    @Override
    public Integer getQuantity() {
        return super.getQuantity();
    }
}
