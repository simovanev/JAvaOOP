package _03_ValidationData;

import java.text.DecimalFormat;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    Person(String firstName, String lastName, int age, double salary) {
       setFirstName(firstName);
       setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    String getFirstName() {
        return firstName;
    }

    int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        } else this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        } else this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else this.salary = salary;
    }

    @Override
    public String toString() {
        DecimalFormat dgd = new DecimalFormat("#.0##");
        return String.format("%s %s gets %s leva", firstName, lastName, dgd.format(salary));
    }

    void increaseSalary(double bonus) {
        if (age < 30) {
            salary += salary * bonus / 200;
        } else salary += salary * bonus / 100;
    }
}
