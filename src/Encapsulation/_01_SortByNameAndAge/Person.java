package Encapsulation._01_SortByNameAndAge;

 class Person {
    private String firstName;
    private String lastName;
    private  int age;

     Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
    }

      String getFirstName() {
         return firstName;
     }

      int getAge() {
         return age;
     }

     @Override
     public String toString() {
         return String.format("%s %s is %d years old.",firstName,lastName,age);
     }
 }
