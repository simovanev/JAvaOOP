package _02_SalaryIncrease;

import java.text.DecimalFormat;

class Person {
    private String firstName;
    private String lastName;
    private  int age;
    private double salary;


     Person(String firstName, String secondName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.salary=salary;
    }

      String getFirstName() {
         return firstName;
     }

      int getAge() {
         return age;
     }

     public double getSalary() {
        return salary;
    }

    public  void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
     public String toString() {
    DecimalFormat dgd= new DecimalFormat("#.0##");
         return String.format("%s %s gets %s leva",firstName,lastName,dgd.format(salary));
     }

      void increaseSalary(double bonus) {
         if (age<30){
             salary+=salary*bonus/200;
         }else salary+=salary*bonus/100;
     }
 }
