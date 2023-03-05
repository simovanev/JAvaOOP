package Encapsulation._03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
       setName(name);
       setMoney(money);
       this.products = new ArrayList<>();
    }



    public void setName(String name) {
      Validate.validationName(name);
        this.name = name;
    }

    public void setMoney(double money) {
        Validate.ValidationMoney(money);
        this.money = money;
    }
    public  void buyProduct(Product product){
       if (this.money<product.getCost()){
           System.out.println(this.name+" can't afford "+ product.getName());
       }else {
           this.money-= product.getCost();
           this.products.add(product);
           System.out.println(this.name+" bought "+ product.getName());
       }
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
