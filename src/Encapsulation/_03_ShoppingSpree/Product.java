package Encapsulation._03_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);

    }

    public void setName(String name) {
        Validate.validationName(name);
        this.name = name;
    }

    public void setCost(double cost) {
       Validate.ValidationMoney(cost);
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
