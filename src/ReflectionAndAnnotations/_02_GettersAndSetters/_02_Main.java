package ReflectionAndAnnotations._02_GettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class _02_Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Method[] allMethods = Reflection.class.getDeclaredMethods();
        Arrays.stream(allMethods).filter(_02_Main::isGetter)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s will return class %s%n", e.getName(), e.getReturnType().getName()));

        Arrays.stream(allMethods).filter(_02_Main::isSetter)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s and will set field of class %s%n", e.getName(), e.getParameterTypes()[0].getName()));
    }

    private static boolean isSetter(Method e) {
        if (!e.getName().startsWith("set")) {
            return false;
        }
        if (e.getParameterCount() != 1) {
            return false;
        }
        if (!e.getReturnType().equals(void.class)) {
            return false;
        }
        return true;
    }

    private static boolean isGetter(Method e) {
        if (!e.getName().startsWith("get")) {
            return false;
        }
        if (e.getParameterCount() > 0) {
            return false;
        }
        if (e.getReturnType().equals(void.class)) {
            return false;
        }
        return true;
    }
}
