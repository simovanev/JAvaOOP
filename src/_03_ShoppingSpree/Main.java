package _03_ShoppingSpree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] people= scanner.nextLine().split(";");
        Map<String , Person> personMap= new HashMap<>();
        for (String buyer: people){
            String[] buyerInfo= buyer.split("=");
            String buyerName= buyerInfo[0];
            double buyerMoney=Double.parseDouble(buyerInfo[1]);
            Person person= new Person(buyerName,buyerMoney);
            personMap.putIfAbsent(buyerName,person);

        }
        String[] products= scanner.nextLine().split(";");
        Map<String , Product> productMap= new HashMap<>();
        for (String item: products){
            String[] buyerInfo= item.split("=");
            String itemName= buyerInfo[0];
            double itemCost=Double.parseDouble(buyerInfo[1]);
            Product product= new Product(itemName,itemCost);
            productMap.putIfAbsent(itemName,product);

        }
        String action= scanner.nextLine();
        while (!action.equals("END")){
            String customer= action.split("\\s+")[0];
            String good= action.split("\\s+")[1];
            Person currentPerson= personMap.get(customer);
            Product currentProduct= productMap.get(good);
           currentPerson.buyProduct(currentProduct);

            action= scanner.nextLine();
        }
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            if (entry.getValue().getProducts().isEmpty()){
                System.out.println(entry.getKey()+" – Nothing bought");
            }else {


               List< String> element= entry.getValue().getProducts().stream().map(e->e.getName()).collect(Collectors.toList());
            System.out.println(entry.getKey()+" - "+ String.join(", " ,element));

            }
        }


    }
}
