package ReflectionAndAnnotations._01_HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String command = scanner.nextLine();
		Field[] fields= RichSoilLand.class.getDeclaredFields();

		while (!command.equals("HARVEST")){
			for (Field field: fields){
				String mod= Modifier.toString(field.getModifiers());
				if (command.equals("all") || command.equals(mod)){
					//protected String testString
					System.out.printf("%s %s %s\n",mod,field.getType().getSimpleName(),field.getName());
				}
			}

			command=scanner.nextLine();

		}

	}
}
