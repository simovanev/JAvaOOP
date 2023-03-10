package Polymorphism._04_WildFArm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         String info= scanner.nextLine();
         while (!info.equals("End")){

             String[] information=info.split(" ");
             String animal= information[0];
             Animal creature=null;
             switch (animal){
                 case "Mouse":
                     creature= new Mouse(information[0],information[1],information[2],information[3]);
                     break;
                 case "Cat":
                     creature= new Cat(information[0],information[1],information[2],information[3],information[4]);
                     break;
                 case "Tiger":
                     creature= new Tiger(information[0],information[1],information[2],information[3]);
                     break;
                 case "Zebra":
                     creature= new Zebra(information[0],information[1],information[2],information[3]);
                     break;
             }
             String foodInfo= scanner.nextLine();
             String[] whatFood= foodInfo.split(" ");
             Food food;
             if (whatFood[0].equals("Meat")){
                 food = new Meat(Integer.parseInt(whatFood[1]));
             }else {
                 food = new Vegetable(Integer.parseInt(whatFood[1]));
             }
             assert creature != null;
             creature.makeSound("");
             creature.eat(food);
             System.out.println(creature);


             info= scanner.nextLine();
         }
    }
}
