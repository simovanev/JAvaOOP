package ReflectionAndAnnotations._02_BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import static javax.swing.UIManager.getInt;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt clazz = constructor.newInstance();

        Method[] methods = BlackBoxInt.class.getDeclaredMethods();

        while (!"END".equals(command)) {
            String action = command.split("_")[0];
            int valueToProcess = Integer.parseInt(command.split("_")[1]);
            for (Method method : methods) {
                if (method.getName().equals(action)) {
                    method.setAccessible(true);
                    method.invoke(clazz, valueToProcess);
                }
            }
                Field field = clazz.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);
                int currentValue = field.getInt(clazz);
                System.out.println(currentValue);


            command = scanner.nextLine();
        }


    }

}

