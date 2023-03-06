package Inheritance.animals;

public class Animal {
    private String name;
    private  int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        isValid(name);
        this.name = name;
        if (age<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
        isValid(gender);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private void isValid(String name) {
        if (name==null || name.trim().isBlank()){
            throw new IllegalArgumentException("Invalid input!");
        }
    }
    public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + System.lineSeparator()
                + this.getName() + " " + this.getAge() + " " + this.getGender() + System.lineSeparator()
                + this.produceSound();
    }
}
