package InterfacesAndAbstraction._04_FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        List<Person> buyersList= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length==4){
                Citizen citizen = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                buyersList.add(citizen);
            }else {
                Rebel rebel = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
                buyersList.add(rebel);
            }
        }
        String personName = scanner.nextLine();
        int totalFood=0;
        while (!personName.equals("End")){
            for (Person buyer: buyersList){
                if (buyer.getName().equals(personName)){
                    buyer.buyFood();

                }
            }

            personName= scanner.nextLine();
        }
        for (Person person:buyersList){
            totalFood+= person.getFood();
        }
        System.out.println(totalFood);
    }
}
