package ReflectionAndAnnotations._03_HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Method[] methods = Reflection.class.getDeclaredMethods();
        List<Method> methodGetters = Arrays.stream(methods)
                .filter(e -> isGetter(e))
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());

        List<Method> methodSetters = Arrays.stream(methods)
                .filter(e -> isSetter(e))
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
        Field[] fields = Reflection.class.getDeclaredFields();
        List<Field> fieldList = Arrays.stream(fields).sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());

        fieldList.stream()
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .forEach(f -> System.out.printf("%s must be private!\n", f.getName()));

        methodGetters.stream()
                .filter(g -> !Modifier.isPublic(g.getModifiers()))
                .forEach(g -> System.out.printf("%s have to be public!\n", g.getName()));
        methodSetters.stream()
                .filter(s -> !Modifier.isPrivate(s.getModifiers()))
                .forEach(s -> System.out.printf("%s have to be private!\n", s.getName()));
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
