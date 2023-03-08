package InterfacesAndAbstraction._03_BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> citizensAndPets = new ArrayList<>();
        while (!input.equals("End")) {
            String[] information = input.split("\\s+");
            switch (information[0]) {
                case "Citizen":
                    Citizen citizen = new Citizen(information[1], Integer.parseInt(information[2]), information[3], information[4]);
                    citizensAndPets.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(information[1], information[2]);
                    citizensAndPets.add(pet);
                    break;
                case "Robot":
                    break;
                default:
                    throw new IllegalArgumentException("No such thing" + information[0]);
            }

            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        if (!citizensAndPets.isEmpty()) {

            for (Birthable individual : citizensAndPets) {
                if (individual.getBirthDate().endsWith(year)) {
                    System.out.println(individual.getBirthDate());
                }
            }
        }
    }
}
