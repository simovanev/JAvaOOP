package ReflectionAndAnnotations._01_Reflection;

import ReflectionAndAnnotations._01_Reflection.Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection= Reflection.class;
        System.out.println(reflection);
        Class superClass= reflection.getSuperclass();
        System.out.println(superClass);
        Class[] interfaces= reflection.getInterfaces();
        for (Class intr:interfaces){
            System.out.println(intr);
        }
        Object reflectionObject=reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);
    }
}
