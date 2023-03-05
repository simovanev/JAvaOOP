package Encapsulation._03_ShoppingSpree;

public class Validate {
    public static void validationName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void ValidationMoney(double money) {
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
